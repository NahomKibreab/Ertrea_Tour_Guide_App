package com.nknahom.tourguideapp;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(@NonNull Context context, @NonNull ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.location_layout, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Location location = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView cityName = listItemView.findViewById(R.id.city_name);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        if (location.hasCity()){
            cityName.setText(location.getCity());
        } else {
            cityName.setText(location.getName());
        }

        TextView subzone = listItemView.findViewById(R.id.subzone);
        if (location.hasSubzone()){
            subzone.setText(location.getSubzone());
            subzone.setVisibility(View.VISIBLE);
        } else {
            subzone.setVisibility(View.GONE);
        }


        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView imageView = listItemView.findViewById(R.id.city_image);

        // Check if an image is provided for this word or not
        if (location.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(location.getImage());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        TextView cityDescription = listItemView.findViewById(R.id.city_description);
        cityDescription.setText(location.getDescription());

        TextView phoneNumber = listItemView.findViewById(R.id.phone);

        if (location.hasPhone()){
            phoneNumber.setText(location.getPhone());
            phoneNumber.setVisibility(View.VISIBLE);
        } else {
            phoneNumber.setVisibility(View.GONE);
        }
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}