package unicon.lv.uniapp.data_providers;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.LinkedHashMap;
import java.util.List;


/**
 * Created by antos on 8/1/16.
 */
public class DataAdapter extends BaseExpandableListAdapter {

    private Context ctx;
    private LinkedHashMap<String, List<String>> dataMap;
    private List<String> dataList;
    private final int parentId, parentLayout, childId, childLayout;

    public DataAdapter(Context ctx, LinkedHashMap<String, List<String>> dataMap, List<String> dataList, int parentId, int parentLayout, int childId, int childLayout) {
        this.ctx = ctx;
        this.dataMap = dataMap;
        this.dataList = dataList;
        this.parentId = parentId;
        this.parentLayout = parentLayout;
        this.childId = childId;
        this.childLayout = childLayout;
    }

    @Override
    public int getGroupCount() {
        return dataList.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return dataMap.get(dataList.get(i)).size();
    }

    @Override
    public Object getGroup(int i) {
        return dataList.get(i);
    }

    @Override
    public Object getChild(int parent, int child) {
        return dataMap.get(dataList.get(parent)).get(child);
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
    public View getGroupView(int parent, boolean isExpanded, View convertView, final ViewGroup parentView) {
        String groupTitle = (String) getGroup(parent);
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(parentLayout, parentView, false);
        }
        TextView parentTextView = (TextView) convertView.findViewById(parentId);
        parentTextView.setTypeface(null, Typeface.BOLD);
        parentTextView.setText(groupTitle);
        return convertView;
    }

    @Override
    public View getChildView(int parent, int child, boolean lastChild, View convertView, ViewGroup parentView) {
        String childTitle = (String) getChild(parent, child);
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(childLayout, parentView, false);
        }
        TextView childTextView = (TextView) convertView.findViewById(childId);
        childTextView.setText(childTitle);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return false;
    }

}
