package unicon.lv.uniapp.activities;

import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import unicon.lv.uniapp.data_providers.CosplayDataProvider;
import uncon.lv.uniapp.R;
import unicon.lv.uniapp.data_providers.DataAdapter;

/**
 * Created by antos on 7/31/16.
 */
public class CosplayActivity extends YberActivity {

    private LinkedHashMap<String, List<String>> cosplayersMap;
    private List<String> cosplayList;
    private ExpandableListView expList;
    private DataAdapter adapter;
    private int lastExpandablePosition = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cosplay);
        setMenuButton();
        expList = (ExpandableListView) findViewById(R.id.cosplay_exp_list);
        cosplayersMap = CosplayDataProvider.getInfo();
        cosplayList = new ArrayList<>(cosplayersMap.keySet());
        adapter = new DataAdapter(this, cosplayersMap, cosplayList, R.id.cosplay_parent_txt, R.layout.exp_cosplay_parent, R.id.cosplay_child_txt, R.layout.exp_cosplay_child);
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
