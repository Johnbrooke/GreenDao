package com.example.administrator.mydemo_onepic_2;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2016/12/24 0024.
 */
public class MyApplication extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
        GreenDaoManager.getInstance();

    }
    static Context getContext(){
        return mContext;
    }
}
