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
 * Created by justin on 2017/7/3.
 */

public class SightsFragment extends Fragment {

    private RecyclerView listRecyclerView;
    private RecyclerView.Adapter locationAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    public SightsFragment() {
    }

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location(R.drawable.longshan_temple_taipei_photo,
                getString(R.string.longshan_temple),
                getString(R.string.longshan_temple_info),
                getString(R.string.longshan_temple_location),
                getString(R.string.longshan_temple_access_time),
                getString(R.string.longshan_temple_attach_money),
                getString(R.string.longshan_temple_phone_number)));

        locations.add(new Location(R.drawable.red_house_theater_photo,
                getString(R.string.red_house_theater),
                getString(R.string.red_house_theater_info),
                getString(R.string.red_house_theater_location),
                getString(R.string.red_house_theater_access_time),
                getString(R.string.red_house_theater_attach_money),
                getString(R.string.red_house_theater_phone_number)));

        locations.add(new Location(R.drawable.beitou_hot_spring_museum_photo,
                getString(R.string.beitou_hot_spring_museum),
                getString(R.string.beitou_hot_spring_museum_info),
                getString(R.string.beitou_hot_spring_museum_location),
                getString(R.string.beitou_hot_spring_museum_access_time),
                getString(R.string.beitou_hot_spring_museum_attach_money),
                getString(R.string.beitou_hot_spring_museum_phone_number)));

        locations.add(new Location(R.drawable.sun_yat_sen_memorial_hall_photo,
                getString(R.string.sun_yat_sen_memorial_hall),
                getString(R.string.sun_yat_sen_memorial_hall_info),
                getString(R.string.sun_yat_sen_memorial_hall_location),
                getString(R.string.sun_yat_sen_memorial_hall_access_time),
                getString(R.string.sun_yat_sen_memorial_hall_attach_money),
                getString(R.string.sun_yat_sen_memorial_hall_phone_number)));

        locations.add(new Location(R.drawable.yang_ming_shan_photo,
                getString(R.string.yang_ming_shan),
                getString(R.string.yang_ming_shan_info),
                getString(R.string.yang_ming_shan_location),
                getString(R.string.yang_ming_shan_access_time),
                getString(R.string.yang_ming_shan_attach_money),
                getString(R.string.yang_ming_shan_phone_number)));

        listRecyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view);
        mLayoutManager = new LinearLayoutManager(getActivity());
        listRecyclerView.setLayoutManager(mLayoutManager);
        locationAdapter = new LocationAdapter(locations);
        listRecyclerView.setAdapter(locationAdapter);

        return rootView;
    }


}
