package uncon.lv.uniapp.activities;

import android.os.Bundle;

import uncon.lv.uniapp.R;

public class MainActivity extends YberActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setMenuButton();
    }
}
