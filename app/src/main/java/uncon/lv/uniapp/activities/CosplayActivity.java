package uncon.lv.uniapp.activities;

import android.os.Bundle;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

import data_providers.CosplayAdapter;
import data_providers.CosplayDataProvider;
import uncon.lv.uniapp.R;

/**
 * Created by antos on 7/31/16.
 */
public class CosplayActivity extends YberActivity {

    private TreeMap<String, List<String>> cosplayersMap;
    private List<String> cosplayList;
    private ExpandableListView expList;
    private CosplayAdapter adapter;
    private int lastExpandablePosition = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cosplay);
        setMenuButton();
        expList = (ExpandableListView) findViewById(R.id.cosplay_exp_list);
        cosplayersMap = CosplayDataProvider.getInfo();
        cosplayList = new ArrayList<>(cosplayersMap.keySet());
        adapter = new CosplayAdapter(this, cosplayersMap, cosplayList);
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
