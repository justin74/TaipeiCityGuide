package com.example.apple.taipeicityguide;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by justin on 2017/7/4.
 */

public class LocationAdapter extends RecyclerView.Adapter<LocationAdapter.ViewHolder> {
    private List<Location> mData;

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView mPhotoImageView;
        public TextView mNameTextView;
        public TextView mInfoTextView;
        public TextView mAddressTextView;
        public TextView mPhoneTextView;
        public TextView mAccessTimeTextView;
        public TextView mAttachMoneyTextView;

        public ViewHolder(View v) {
            super(v);
            mPhotoImageView = (ImageView) v.findViewById(R.id.photo_image_view);
            mNameTextView = (TextView) v.findViewById(R.id.name_text_view);
            mInfoTextView = (TextView) v.findViewById(R.id.info_text_view);
            mAddressTextView = (TextView) v.findViewById(R.id.location_text_view);
            mAccessTimeTextView = (TextView) v.findViewById(R.id.access_time_text_view);
            mAttachMoneyTextView = (TextView) v.findViewById(R.id.attach_money_text_view);
            mPhoneTextView = (TextView) v.findViewById(R.id.phone_text_view);
        }
    }

    public LocationAdapter(List<Location> data) {
        mData = data;
    }

    @Override
    public LocationAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        if(mData.get(position).hasImage()){
            holder.mPhotoImageView.setImageResource(
                    mData.get(position).getmLocationImageResourceId());
        } else {
            holder.mPhotoImageView.setVisibility(View.GONE);
        }

        holder.mNameTextView.setText(mData.get(position).getmLocationName());
        holder.mInfoTextView.setText(mData.get(position).getmLocationInfo());

        if(mData.get(position).hasAddress()){
            holder.mAddressTextView.setText(mData.get(position).getmLocationAddress());
        } else {
            holder.mAddressTextView.setVisibility(View.GONE);
        }

        if(mData.get(position).hasAccessTime()){
            holder.mAccessTimeTextView.setText(mData.get(position).getmLocationAccessTime());
        } else {
            holder.mAccessTimeTextView.setVisibility(View.GONE);
        }

        if(mData.get(position).hasPrice()){
            holder.mAttachMoneyTextView.setText(mData.get(position).getmAttachMoney());
        } else {
            holder.mAttachMoneyTextView.setVisibility(View.GONE);
        }

        if(mData.get(position).hasPhoneNumber()){
            holder.mPhoneTextView.setText(mData.get(position).getmPhoneNumber());
        } else {
            holder.mPhoneTextView.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

}
