package com.nknahom.tourguideapp;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/**
 * {@link CategoryAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Location} objects.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }


    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new CityFragment();
        } else if (position == 1){
            return new EthnicsFragment();
        } else if (position == 2){
            return new HistoryFragment();
        } else {
            return new ResturantFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.city_name);
        } else if (position == 1) {
            return mContext.getString(R.string.city_name);
        } else if (position == 2) {
            return mContext.getString(R.string.city_name);
        } else {
            return mContext.getString(R.string.city_name);
        }
    }
}