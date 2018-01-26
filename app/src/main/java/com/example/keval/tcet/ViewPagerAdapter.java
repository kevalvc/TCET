package com.example.keval.tcet;

/**
 * Created by keval on 7/21/2017.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position ==0) {
            return new Tab1();
        } else if (position == 1) {
            return new Tab2();
        } else return new Tab3();
    }

    @Override
    public int getCount() {
        return 3;
    }
}