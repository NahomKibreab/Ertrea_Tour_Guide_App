package com.nknahom.tourguideapp;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class HotelFragment extends Fragment {
    public HotelFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        ArrayList<Location> hotels = new ArrayList<>();
        hotels.add(new Location(getString(R.string.asmara_palace),getString(R.string.desc_asmara_palace),R.drawable.asmara_palace,getString(R.string.phone_asmara_palace)));
        hotels.add(new Location(getString(R.string.albergo),getString(R.string.desc_albergo),R.drawable.albergo_italiano,getString(R.string.phone_albergo)));
        hotels.add(new Location(getString(R.string.dahlak_hotel),getString(R.string.desc_dahlak_hotel),R.drawable.dahlak_hotel,null));
        hotels.add(new Location(getString(R.string.sunshine),getString(R.string.desc_sunshine),R.drawable.sunshine_hotel,getString(R.string.phone_sunshine)));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), hotels);

        ListView listView = rootView.findViewById(R.id.item_list);
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
