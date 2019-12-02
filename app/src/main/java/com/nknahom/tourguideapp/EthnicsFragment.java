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

        ArrayList<Location> cities = new ArrayList<>();
        cities.add(new Location("Tigrinya","Zoba Maekel","Is the capital city of Eritrea.",R.drawable.asmara));
        cities.add(new Location("Tigrinya","Zoba Maekel","Is the capital city of Eritrea.",R.drawable.asmara));
        cities.add(new Location("Tigrinya","Zoba Maekel","Is the capital city of Eritrea.",R.drawable.asmara));
        cities.add(new Location("Tigrinya","Zoba Maekel","Is the capital city of Eritrea.",R.drawable.asmara));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), cities);

        ListView listView = rootView.findViewById(R.id.item_list);
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
