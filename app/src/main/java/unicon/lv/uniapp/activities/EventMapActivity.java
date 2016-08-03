package unicon.lv.uniapp.activities;

import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import uncon.lv.uniapp.R;
import unicon.lv.uniapp.data_providers.EventMapAdapter;
import unicon.lv.uniapp.data_providers.EventMapDataProvider;

/**
 * Created by antos on 7/31/16.
 */
public class EventMapActivity extends YberActivity {

    private LinkedHashMap<String, List<String>> eventMapMap;
    private List<String> eventMapList;
    private ExpandableListView expList;
    private EventMapAdapter adapter;
    private int lastExpandablePosition = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_map);
        setMenuButton();
        expList = (ExpandableListView) findViewById(R.id.event_map_exp_list);
        eventMapMap = EventMapDataProvider.getInfo();
        eventMapList = new ArrayList<>(eventMapMap.keySet());
        adapter = new EventMapAdapter(this, eventMapMap, eventMapList);
        expList.setAdapter(adapter);

        expList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
                if (lastExpandablePosition != -1 && groupPosition != lastExpandablePosition) {
                    expList.collapseGroup(lastExpandablePosition);
                    expList.setSelection(0);
                }
                lastExpandablePosition = groupPosition;
            }
        });
    }

}
