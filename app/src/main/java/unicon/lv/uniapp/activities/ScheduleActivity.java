package unicon.lv.uniapp.activities;

import android.os.Bundle;

import uncon.lv.uniapp.R;

/**
 * Created by antos on 7/31/16.
 */
public class ScheduleActivity extends YberActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        setMenuButton();
    }
}