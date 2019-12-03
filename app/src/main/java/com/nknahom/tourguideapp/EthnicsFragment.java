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

public class EthnicsFragment extends Fragment {

    public EthnicsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        ArrayList<Location> ethnics = new ArrayList<>();
        ethnics.add(new Location(getString(R.string.kunama),getString(R.string.zone_kunama),getString(R.string.desc_kunama),R.drawable.kunama));
        ethnics.add(new Location(getString(R.string.afar),getString(R.string.zone_afar),getString(R.string.desc_afar),R.drawable.afar));
        ethnics.add(new Location(getString(R.string.saho),getString(R.string.zone_saho),getString(R.string.desc_saho),R.drawable.saho));
        ethnics.add(new Location(getString(R.string.rashaida),getString(R.string.zone_rashaida),getString(R.string.desc_rashaida),R.drawable.rashaida));
        ethnics.add(new Location(getString(R.string.tigrinya),getString(R.string.zone_tigrinya),getString(R.string.desc_tigrinya),R.drawable.tigrinya));
        ethnics.add(new Location(getString(R.string.bilen),getString(R.string.zone_bilen),getString(R.string.desc_bilen),R.drawable.bilen));
        ethnics.add(new Location(getString(R.string.nara),getString(R.string.zone_nara),getString(R.string.desc_nara),R.drawable.nara));
        ethnics.add(new Location(getString(R.string.tigre),getString(R.string.zone_tigre),getString(R.string.desc_tigre),R.drawable.tigre));
        ethnics.add(new Location(getString(R.string.hedareb),getString(R.string.zone_hedareb),getString(R.string.desc_hedareb),R.drawable.hedarb));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), ethnics);

        ListView listView = rootView.findViewById(R.id.item_list);
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
