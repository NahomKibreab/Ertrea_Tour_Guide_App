package com.nknahom.tourguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class ResturantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.location_list);
//        // Name, City, Image, Description and Phone Number
//        ArrayList<Location> resturants = new ArrayList<>();
//        resturants.add(new Location("Asmara Palace","Is located in Asmara",R.drawable.asmara,"07149206"));
//        resturants.add(new Location("Asmara Palace","Is located in Asmara",R.drawable.asmara,"07149206"));
//        resturants.add(new Location("Asmara Palace","Is located in Asmara",R.drawable.asmara,"07149206"));
//        resturants.add(new Location("Asmara Palace","Is located in Asmara",R.drawable.asmara,"07149206"));
//
//        LocationAdapter locationAdapter = new LocationAdapter(this, resturants);
//
//        Log.v("Resurant Activity", locationAdapter.toString());
//        ListView listView = findViewById(R.id.item_list);
//        listView.setAdapter(locationAdapter);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new ResturantFragment())
                .commit();
    }
}
