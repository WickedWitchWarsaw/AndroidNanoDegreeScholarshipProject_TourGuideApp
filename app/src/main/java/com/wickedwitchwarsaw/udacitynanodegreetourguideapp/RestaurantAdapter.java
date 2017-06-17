package com.wickedwitchwarsaw.udacitynanodegreetourguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ZuZ on 16/06/2017.
 */
public class RestaurantAdapter extends ArrayAdapter<Attraction> {
    public RestaurantAdapter(Activity context, ArrayList<Attraction> attractionList) {
        super(context, 0, attractionList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Attraction currentAttraction = getItem(position);
        View listViewItem = convertView;
        if(convertView == null){
            listViewItem = LayoutInflater.from(getContext()).inflate(R.layout.restaurant_list, parent, false);
        }

        ImageView imageView = (ImageView) listViewItem.findViewById(R.id.restaurant_image);
        imageView.setImageResource(currentAttraction.getImageResourceId());

        TextView nameText = (TextView) listViewItem.findViewById(R.id.restaurants_name);
        nameText.setText(currentAttraction.getAttractionName());

        TextView locationText = (TextView) listViewItem.findViewById(R.id.restaurants_location);
        locationText.setText(currentAttraction.getAttractionLocation());

        return listViewItem;
    }
}
