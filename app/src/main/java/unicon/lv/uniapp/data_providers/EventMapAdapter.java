package unicon.lv.uniapp.data_providers;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.LinkedHashMap;
import java.util.List;

import uncon.lv.uniapp.R;

/**
 * Created by antos on 8/1/16.
 */
public class EventMapAdapter extends BaseExpandableListAdapter {

    private Context ctx;
    private LinkedHashMap<String, List<String>> eventMapMap;
    private List<String> eventMapList;

    public EventMapAdapter(Context ctx, LinkedHashMap<String, List<String>> eventMapMap, List<String> eventMapList) {
        this.ctx = ctx;
        this.eventMapMap = eventMapMap;
        this.eventMapList = eventMapList;
    }

    @Override
    public int getGroupCount() {
        return eventMapList.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return eventMapMap.get(eventMapList.get(i)).size();
    }

    @Override
    public Object getGroup(int i) {
        return eventMapList.get(i);
    }

    @Override
    public Object getChild(int parent, int child) {
        return eventMapMap.get(eventMapList.get(parent)).get(child);
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int parent, int child) {
        return child;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int parent, boolean isExpanded, View convertView, ViewGroup parentView) {
        String groupTitle = (String) getGroup(parent);
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.exp_event_map_parent, parentView, false);
        }
        TextView parentTextView = (TextView) convertView.findViewById(R.id.event_map_parent_txt);
        parentTextView.setTypeface(null, Typeface.BOLD);
        parentTextView.setText(groupTitle);
        return convertView;
    }

    @Override
    public View getChildView(int parent, int child, boolean lastChild, View convertView, ViewGroup parentView) {
        String childTitle = (String) getChild(parent, child);
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.exp_event_map_child, parentView, false);
        }
        TextView childTextView = (TextView) convertView.findViewById(R.id.event_map_child_txt);
        childTextView.setText(childTitle);

        ImageView imageView = (ImageView) convertView.findViewById(R.id.map);
        String groupTitle = (String) getGroup(parent);

        if (groupTitle.equals("A. Gallery")) {
            imageView.setImageResource(R.drawable.a01_entrance);
        } else if (groupTitle.equals("B. Main Hall")) {
            imageView.setImageResource(R.drawable.a02_main_hall);
        } else if (groupTitle.equals("C. Hall")) {
            imageView.setImageResource(R.drawable.a03_hall);
        } else if (groupTitle.equals("D. 2nd floor")) {
            imageView.setImageResource(R.drawable.a04_second_floor);
        } else if (groupTitle.equals("E. Main Stage")) {
            imageView.setImageResource(R.drawable.a05_main_stage);
        }

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return false;
    }

}
