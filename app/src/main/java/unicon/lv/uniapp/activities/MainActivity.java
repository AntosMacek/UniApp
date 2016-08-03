package unicon.lv.uniapp.activities;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.util.List;

import uncon.lv.uniapp.R;

public class MainActivity extends YberActivity {

    private String socialButtonName = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setMenuButton();
    }

    public void startFacebook(View v) {
        socialButtonName = "http://www.facebook.com/uniconlv/";
        doSocialStuff(v, socialButtonName);
    }
    public void startYoutube(View v) {
        socialButtonName = "http://www.youtube.com/user/UniConLv";
        doSocialStuff(v, socialButtonName);
    }
    public void startTwitter(View v) {
        socialButtonName = "http://twitter.com/uniconlv";
        doSocialStuff(v, socialButtonName);
    }
    public void startUnicon(View v) {
        socialButtonName = "http://unicon.lv/";
        doSocialStuff(v, socialButtonName);
    }


    private void doSocialStuff(View v, String address) {
        Uri location = Uri.parse(address);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);

        PackageManager packageManager = getPackageManager();
        List<ResolveInfo> activities = packageManager.queryIntentActivities(mapIntent, 0);
        boolean isIntentSafe = activities.size() > 0;

        if (isIntentSafe) {
            startActivity(mapIntent);
        }
    }

}
