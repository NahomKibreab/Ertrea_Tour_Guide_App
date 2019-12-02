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

public class ResturantFragment extends Fragment {
    public ResturantFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        ArrayList<Location> resturants = new ArrayList<>();
        resturants.add(new Location("Asmara Palace","Is located in Asmara",R.drawable.asmara,"07149206"));
        resturants.add(new Location("Asmara Palace","Is located in Asmara",R.drawable.asmara,"07149206"));
        resturants.add(new Location("Asmara Palace","Is located in Asmara",R.drawable.asmara,"07149206"));
        resturants.add(new Location("Asmara Palace","Is located in Asmara",R.drawable.asmara,"07149206"));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), resturants);

        Log.v("Resurant Activity", locationAdapter.toString());
        ListView listView = rootView.findViewById(R.id.item_list);
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
