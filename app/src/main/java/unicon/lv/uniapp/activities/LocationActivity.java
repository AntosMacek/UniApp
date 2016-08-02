package unicon.lv.uniapp.activities;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;

import uncon.lv.uniapp.R;

/**
 * Created by antos on 7/31/16.
 */
public class LocationActivity extends YberActivity {

    private Button mapButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        setMenuButton();
        setMapButton();
    }

    private void setMapButton() {
        mapButton = (Button) findViewById(R.id.map_button);
        mapButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                doMapButtonStuff(v, mapButton);
            }
        });
    }

    private void doMapButtonStuff(View v, Button mapButton) {
        Uri location = Uri.parse("geo:0,0?q=Grostonas+iela+6b,+Riga,+Latvia");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);

        PackageManager packageManager = getPackageManager();
        List<ResolveInfo> activities = packageManager.queryIntentActivities(mapIntent, 0);
        boolean isIntentSafe = activities.size() > 0;

        if (isIntentSafe) {
            startActivity(mapIntent);
        }
    }

    public void doTransportButtonStuff(View v) {
        String address = "";
        int buttonId = v.getId();
        if (buttonId == R.id.transport_btn1) {
            address = "https://saraksti.rigassatiksme.lv/index.html#stop/0020/en";
        }
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
