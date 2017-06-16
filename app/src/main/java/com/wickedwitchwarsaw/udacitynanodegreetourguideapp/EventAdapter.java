package com.wickedwitchwarsaw.udacitynanodegreetourguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by ZuZ on 16/06/2017.
 */
public class EventAdapter extends ArrayAdapter<Attraction> {
    public EventAdapter(Activity context, ArrayList<Attraction> attractionList) {
        super(context, 0, attractionList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Attraction currentAttraction = getItem(position);
        View listViewItem = convertView;
        if(convertView == null){
            listViewItem = LayoutInflater.from(getContext()).inflate(R.layout.event_list, parent, false);
        }

        TextView nameText = (TextView) listViewItem.findViewById(R.id.event_name);
        nameText.setText(currentAttraction.getAttractionName());

        TextView dateText = (TextView) listViewItem.findViewById(R.id.event_date);
        dateText.setText(currentAttraction.getAttractionDate());

        TextView timeText = (TextView) listViewItem.findViewById(R.id.event_time);
        timeText.setText(currentAttraction.getAttractionTime());

        TextView locationText = (TextView) listViewItem.findViewById(R.id.event_location);
        locationText.setText(currentAttraction.getAttractionLocation());

        return listViewItem;
    }
}
