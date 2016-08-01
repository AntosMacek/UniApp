package data_providers;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

import uncon.lv.uniapp.R;

/**
 * Created by antos on 8/1/16.
 */
public class CosplayAdapter extends BaseExpandableListAdapter {

    private Context ctx;
    private HashMap<String, List<String>> cosplayersMap;
    private List<String> cosplayList;

    public CosplayAdapter(Context ctx, HashMap<String, List<String>> cosplayersMap, List<String> cosplayList) {
        this.ctx = ctx;
        this.cosplayersMap = cosplayersMap;
        this.cosplayList = cosplayList;
    }

    @Override
    public int getGroupCount() {
        return cosplayList.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return cosplayersMap.get(cosplayList.get(i)).size();
    }

    @Override
    public Object getGroup(int i) {
        return cosplayList.get(i);
    }

    @Override
    public Object getChild(int parent, int child) {
        return cosplayersMap.get(cosplayList.get(parent)).get(child);
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
            convertView = inflater.inflate(R.layout.cosplay_parent, parentView);
        }
        TextView parentTextView = (TextView) convertView.findViewById(R.id.cosplay_parent_txt);
        parentTextView.setTypeface(null, Typeface.BOLD);
        parentTextView.setText(groupTitle);
        return convertView;
    }

    @Override
    public View getChildView(int parent, int child, boolean lastChild, View convertView, ViewGroup parentView) {
        String childTitle = (String) getChild(parent, child);
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.cosplay_child, parentView, false);
        }
        TextView childTextView = (TextView) convertView.findViewById(R.id.cosplay_child_txt);
        childTextView.setText(childTitle);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return false;
    }
}
