package com.example.apple.taipeicityguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by apple on 2017/7/3.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    private static int PAGE_COUNT = 4;
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new SightsFragment();
        } else if (position == 1){
            return new FoodFragment();
        } else if (position == 2){
            return new ShopsFragment();
        } else {
            return new InfoFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_sights);
        } else if (position == 1) {
            return mContext.getString(R.string.category_food);
        } else if (position == 2) {
            return mContext.getString(R.string.category_shop);
        } else {
            return mContext.getString(R.string.category_info);
        }
    }
}
