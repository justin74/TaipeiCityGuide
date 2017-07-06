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

public class InfoFragment extends Fragment {

    private RecyclerView listRecyclerView;
    private RecyclerView.Adapter locationAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    public InfoFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        ArrayList<Location> info = new ArrayList<>();

        info.add(new Location(getString(R.string.taipei_city), getString(R.string.taipei_city_info)));

        info.add(new Location(R.drawable.mrt_logo,
                getString(R.string.taipei_metro), getString(R.string.taipei_metro_info)));

        listRecyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view);
        mLayoutManager = new LinearLayoutManager(getActivity());
        listRecyclerView.setLayoutManager(mLayoutManager);
        locationAdapter = new LocationAdapter(info);
        listRecyclerView.setAdapter(locationAdapter);

        return rootView;
    }
}
