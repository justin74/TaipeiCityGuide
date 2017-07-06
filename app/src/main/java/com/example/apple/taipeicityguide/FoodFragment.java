package com.example.apple.taipeicityguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by apple on 2017/7/3.
 */

public class FoodFragment extends Fragment {

    private RecyclerView listRecyclerView;
    private RecyclerView.Adapter locationAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    public FoodFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        ArrayList<Location> food = new ArrayList<>();

        food.add(new Location(R.drawable.din_tai_fung_photo,
                getString(R.string.din_tai_fung),
                getString(R.string.din_tai_fung_info),
                getString(R.string.din_tai_fung_location),
                getString(R.string.din_tai_fung_access_time),
                getString(R.string.din_tai_fung_phone_number)));

        food.add(new Location(R.drawable.lin_tung_fong_beef_noodle_photo,
                getString(R.string.lin_tung_fong_beef_noodles),
                getString(R.string.lin_tung_fong_info),
                getString(R.string.lin_tung_fong_location),
                getString(R.string.lin_tung_fong_access_time),
                getString(R.string.lin_tung_fong_phone_number)));

        food.add(new Location(R.drawable.shilin_night_market_photo,
                getString(R.string.shilin_night_market),
                getString(R.string.shilin_night_market_info),
                getString(R.string.shilin_night_market_location),
                getString(R.string.shilin_night_market_access_time),
                getString(R.string.shilin_night_market_phone_number)));

        food.add(new Location(R.drawable.ay_chung_flour_rice_noodle_photo,
                getString(R.string.ay_chung_flour_rice_noodle),
                getString(R.string.ay_chung_flour_rice_noodle_info),
                getString(R.string.ay_chung_flour_rice_noodle_location),
                getString(R.string.ay_chung_flour_rice_noodle_access_time),
                getString(R.string.ay_chung_flour_rice_noodle_phone_number)));

        food.add(new Location(R.drawable.modern_toilet_restaurant_photo,
                getString(R.string.modern_toilet),
                getString(R.string.modern_toilet_info),
                getString(R.string.modern_toilet_location),
                getString(R.string.modern_toilet_access_time),
                getString(R.string.modern_toilet_phone_number)));

        listRecyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view);
        mLayoutManager = new LinearLayoutManager(getActivity());
        listRecyclerView.setLayoutManager(mLayoutManager);
        locationAdapter = new LocationAdapter(food);
        listRecyclerView.setAdapter(locationAdapter);

        return rootView;
    }
}
