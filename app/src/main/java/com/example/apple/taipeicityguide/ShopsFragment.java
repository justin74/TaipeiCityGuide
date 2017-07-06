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

public class ShopsFragment extends Fragment {

    private RecyclerView listRecyclerView;
    private RecyclerView.Adapter locationAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    public ShopsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        ArrayList<Location> shops = new ArrayList<>();

        shops.add(new Location(R.drawable.taipei_101_photo,
                getString(R.string.taipei_101),
                getString(R.string.taipei_101_info),
                getString(R.string.taipei_101_location),
                getString(R.string.taipei_101_access_time),
                getString(R.string.taipei_101_phone_number)));

        shops.add(new Location(R.drawable.breeze_center_photo,
                getString(R.string.breeze_center),
                getString(R.string.breeze_center_info),
                getString(R.string.breeze_center_location),
                getString(R.string.breeze_center_access_time),
                getString(R.string.breeze_center_phone_number)));

        shops.add(new Location(R.drawable.ximending_photo,
                getString(R.string.ximending),
                getString(R.string.ximending_info),
                getString(R.string.ximending_location),
                getString(R.string.ximending_access_time),
                getString(R.string.ximending_phone_number)));

        shops.add(new Location(R.drawable.dihua_streer_photo,
                getString(R.string.dihua_street),
                getString(R.string.dihua_street_info),
                getString(R.string.dihua_street_location),
                getString(R.string.dihua_street_phone_number)));

        shops.add(new Location(R.drawable.pacific_sogo_photo,
                getString(R.string.pacific_sogo),
                getString(R.string.pacific_sogo_info),
                getString(R.string.pacific_sogo_location),
                getString(R.string.pacific_sogo_access_time),
                getString(R.string.pacific_sogo_phone_number)));

        listRecyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view);
        mLayoutManager = new LinearLayoutManager(getActivity());
        listRecyclerView.setLayoutManager(mLayoutManager);
        locationAdapter = new LocationAdapter(shops);
        listRecyclerView.setAdapter(locationAdapter);

        return rootView;
    }
}
