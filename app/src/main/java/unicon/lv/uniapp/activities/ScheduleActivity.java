package unicon.lv.uniapp.activities;

import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import uncon.lv.uniapp.R;
import unicon.lv.uniapp.data_providers.DataAdapter;
import unicon.lv.uniapp.data_providers.ScheduleDataProvider;

/**
 * Created by antos on 7/31/16.
 */
public class ScheduleActivity extends YberActivity {

    private LinkedHashMap<String, List<String>> scheduleMap;
    private List<String> scheduleList;
    private ExpandableListView expList;
    private DataAdapter adapter;
    private int lastExpandablePosition = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        setMenuButton();
        expList = (ExpandableListView) findViewById(R.id.schedule_exp_list);
        scheduleMap = ScheduleDataProvider.getInfo();
        scheduleList = new ArrayList<>(scheduleMap.keySet());
        adapter = new DataAdapter(this, scheduleMap, scheduleList, R.id.schedule_parent_txt, R.layout.exp_schedule_parent, R.id.schedule_child_txt, R.layout.exp_schedule_child);
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
