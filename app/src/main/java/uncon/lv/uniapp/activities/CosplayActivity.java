package uncon.lv.uniapp.activities;

import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import data_providers.CosplayAdapter;
import data_providers.CosplayDataProvider;
import uncon.lv.uniapp.R;

/**
 * Created by antos on 7/31/16.
 */
public class CosplayActivity extends YberActivity {

    HashMap<String, List<String>> cosplayersMap;
    List<String> cosplayList;
    ExpandableListView expList;
    CosplayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cosplay);
        expList = (ExpandableListView) findViewById(R.id.cosplay_exp_list);
        cosplayersMap = CosplayDataProvider.getInfo();
        cosplayList = new ArrayList<>(cosplayersMap.keySet());
        adapter = new CosplayAdapter(this, cosplayersMap, cosplayList);
        expList.setAdapter(adapter);
        setMenuButton();
    }
}
