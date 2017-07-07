package com.example.apple.taipeicityguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by justin on 2017/7/3.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;
    private MyApplication application;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public int getCount() {
        return pages.length;
    }

    @Override
    public Fragment getItem(int position) {
        return pages[position];
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return pageTitle[position];
    }

    private Fragment[] pages = new Fragment[]{
            new SightsFragment(),
            new FoodFragment(),
            new ShopsFragment(),
            new InfoFragment()
    };

    private CharSequence[] pageTitle = new CharSequence[]{
            application.getContext().getString(R.string.category_sights),
            application.getContext().getString(R.string.category_food),
            application.getContext().getString(R.string.category_shop),
            application.getContext().getString(R.string.category_info),
    };

}
