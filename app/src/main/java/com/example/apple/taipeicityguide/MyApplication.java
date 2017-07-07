package com.example.apple.taipeicityguide;

import android.app.Application;
import android.content.Context;

/**
 * Created by justin on 2017/7/7.
 */

public class MyApplication extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }

    public static Context getContext(){
        return mContext;
    }
}
