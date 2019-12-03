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

public class LegacyFragment extends Fragment {
    public LegacyFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        ArrayList<Location> legacies = new ArrayList<>();
        legacies.add(new Location(getString(R.string.fiat),getString(R.string.desc_fiat),R.drawable.fiat_tagliero));
        legacies.add(new Location(getString(R.string.cathedral),getString(R.string.desc_cathedral),R.drawable.cattedrale));
        legacies.add(new Location(getString(R.string.cinema_impero),getString(R.string.desc_cinema_impero),R.drawable.cinema_impero));
        legacies.add(new Location(getString(R.string.italian_bank),getString(R.string.desc_italian_bank),R.drawable.bank_massawa));
        legacies.add(new Location(getString(R.string.dahlak),getString(R.string.desc_dahlak),R.drawable.dahlak));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), legacies);

        ListView listView = rootView.findViewById(R.id.item_list);
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
