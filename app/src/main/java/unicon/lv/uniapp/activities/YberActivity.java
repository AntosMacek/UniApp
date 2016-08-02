package unicon.lv.uniapp.activities;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;

import java.util.List;

import uncon.lv.uniapp.R;

/**
 * Created by antos on 7/31/16.
 */
public class YberActivity extends AppCompatActivity {

    private ImageButton menuButton;
    private ImageButton socialButton;

    public void doPopup(View v, ImageButton menuButton) {
        final View view = v;
        PopupMenu popupMenu = new PopupMenu(this, menuButton);
        popupMenu.setOnMenuItemClickListener(
                new PopupMenu.OnMenuItemClickListener() {

                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        if (menuItem != null) {
                            if (menuItem.getItemId() == R.id.schedule) {
                                startScheduleActivity(view);
                            } else if (menuItem.getItemId() == R.id.event_map) {
                                startEventMapActivity(view);
                            } else if (menuItem.getItemId() == R.id.location) {
                                startLocationActivity(view);
                            } else if (menuItem.getItemId() == R.id.ticket_info) {
                                startTicketActivity(view);
                            } else if (menuItem.getItemId() == R.id.special_guests) {
                                startGuestActivity(view);
                            } else if (menuItem.getItemId() == R.id.panels) {
                                startPanelActivity(view);
                            } else if (menuItem.getItemId() == R.id.cosplay) {
                                startCosplayActivity(view);
                            } else if (menuItem.getItemId() == R.id.policy) {
                                startPolicyActivity(view);
                            }
                            return true;
                        } else {
                            return false;
                        }
                    }
                }
        );
        popupMenu.inflate(R.menu.menu_main);
        popupMenu.show();
    }

    public void doSocialPopup(View v, ImageButton menuButton) {
        final View view = v;
        PopupMenu popupMenu = new PopupMenu(this, menuButton);
        popupMenu.setOnMenuItemClickListener(
                new PopupMenu.OnMenuItemClickListener() {

                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        String address = null;
                        if (menuItem != null) {
                            if (menuItem.getItemId() == R.id.facebook) {
                                address = "https://www.facebook.com/uniconlv/";
                            } else if (menuItem.getItemId() == R.id.youtube) {
                                address = "https://www.youtube.com/user/UniConLv";
                            } else if (menuItem.getItemId() == R.id.twitter) {
                                address = "https://twitter.com/uniconlv";
                            } else if (menuItem.getItemId() == R.id.webpage) {
                                address = "http://unicon.lv/";
                            }
                            doSocialStuff(view, address);
                            return true;
                        } else {
                            return false;
                        }
                    }
                }
        );
        popupMenu.inflate(R.menu.menu_social);
        popupMenu.show();
    }

    public void setMenuButton() {
        menuButton = (ImageButton) findViewById(R.id.menu_button);
        menuButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                doPopup(v, menuButton);
            }
        });
    }
    public void setSocialButton() {
        socialButton = (ImageButton) findViewById(R.id.social_button);
        socialButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                doSocialPopup(v, socialButton);
            }
        });
    }

    public void goHome(View view) {
        startActivity(new Intent(YberActivity.this, MainActivity.class));
    }

    private void startScheduleActivity(View view) {
        startActivity(new Intent(YberActivity.this, ScheduleActivity.class));
    }
    private void startEventMapActivity(View view) {
        startActivity(new Intent(YberActivity.this, EventMapActivity.class));
    }
    private void startLocationActivity(View view) {
        startActivity(new Intent(YberActivity.this, LocationActivity.class));
    }
    private void startTicketActivity(View view) {
        startActivity(new Intent(YberActivity.this, TicketActivity.class));
    }
    private void startGuestActivity(View view) {
        startActivity(new Intent(YberActivity.this, GuestActivity.class));
    }
    private void startPanelActivity(View view) {
        startActivity(new Intent(YberActivity.this, PanelActivity.class));
    }
    private void startCosplayActivity(View view) {
        startActivity(new Intent(YberActivity.this, CosplayActivity.class));
    }
    private void startPolicyActivity(View view) {
        startActivity(new Intent(YberActivity.this, PolicyActivity.class));
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
