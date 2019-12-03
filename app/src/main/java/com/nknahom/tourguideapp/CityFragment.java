package com.nknahom.tourguideapp;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class CityFragment extends Fragment {
    public CityFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        ArrayList<Location> cities = new ArrayList<>();
        cities.add(new Location(getString(R.string.asmara),getString(R.string.desc_asmara),R.drawable.asmara));
        cities.add(new Location(getString(R.string.massawa),getString(R.string.desc_massawa),R.drawable.massawa));
        cities.add(new Location(getString(R.string.keren),getString(R.string.desc_keren),R.drawable.keren));
        cities.add(new Location(getString(R.string.adi_keyh),getString(R.string.desc_adi_keyh),R.drawable.adikeyh));
        cities.add(new Location(getString(R.string.dekemhare),getString(R.string.desc_dekemhare),R.drawable.dekemhare));
        cities.add(new Location(getString(R.string.segheneyti),getString(R.string.desc_segheneyti),R.drawable.segheneyti));
        cities.add(new Location(getString(R.string.ghinda),getString(R.string.desc_ghinda),R.drawable.ghinda));
        cities.add(new Location(getString(R.string.assab),getString(R.string.desc_assab),R.drawable.assab));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), cities);

        ListView listView = rootView.findViewById(R.id.item_list);
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
