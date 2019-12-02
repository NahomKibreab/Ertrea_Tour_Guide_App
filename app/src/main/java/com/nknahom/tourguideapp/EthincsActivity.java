package com.nknahom.tourguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class EthincsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);
        ArrayList<Location> cities = new ArrayList<>();
        cities.add(new Location("Tigrinya","Zoba Maekel","Is the capital city of Eritrea.",R.drawable.asmara));
        cities.add(new Location("Tigrinya","Zoba Maekel","Is the capital city of Eritrea.",R.drawable.asmara));
        cities.add(new Location("Tigrinya","Zoba Maekel","Is the capital city of Eritrea.",R.drawable.asmara));
        cities.add(new Location("Tigrinya","Zoba Maekel","Is the capital city of Eritrea.",R.drawable.asmara));

        LocationAdapter locationAdapter = new LocationAdapter(this, cities);

        ListView listView = findViewById(R.id.item_list);
        listView.setAdapter(locationAdapter);
    }
}
