package unicon.lv.uniapp.activities;

import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import unicon.lv.uniapp.data_providers.GuestAdapter;
import unicon.lv.uniapp.data_providers.GuestDataProvider;
import uncon.lv.uniapp.R;

/**
 * Created by antos on 7/31/16.
 */
public class GuestActivity extends YberActivity {

    private LinkedHashMap<String, List<String>> guestMap;
    private List<String> guestList;
    private ExpandableListView expList;
    private GuestAdapter adapter;
    private int lastExpandablePosition = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest);
        setMenuButton();
        expList = (ExpandableListView) findViewById(R.id.guest_exp_list);
        guestMap = GuestDataProvider.getInfo();
        guestList = new ArrayList<>(guestMap.keySet());
        adapter = new GuestAdapter(this, guestMap, guestList);
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
