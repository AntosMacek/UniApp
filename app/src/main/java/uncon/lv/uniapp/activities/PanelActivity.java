package uncon.lv.uniapp.activities;

import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

import data_providers.PanelAdapter;
import data_providers.PanelDataProvider;
import uncon.lv.uniapp.R;

/**
 * Created by antos on 7/31/16.
 */
public class PanelActivity extends YberActivity {

    private LinkedHashMap<String, List<String>> panelMap;
    private List<String> panelList;
    private ExpandableListView expList;
    private PanelAdapter adapter;
    private int lastExpandablePosition = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panel);
        setMenuButton();
        expList = (ExpandableListView) findViewById(R.id.panel_exp_list);
        panelMap = PanelDataProvider.getInfo();
        panelList = new ArrayList<>(panelMap.keySet());
        adapter = new PanelAdapter(this, panelMap, panelList);
        expList.setAdapter(adapter);

        expList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
                if (lastExpandablePosition != -1 && groupPosition != lastExpandablePosition) {
                    expList.collapseGroup(lastExpandablePosition);
                }
                lastExpandablePosition = groupPosition;
            }
        });
    }
}
