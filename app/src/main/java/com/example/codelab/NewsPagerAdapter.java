package com.example.codelab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class NewsPagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public NewsPagerAdapter(FragmentManager fm,int mNumOfTabs) {
        super(fm);
        this.mNumOfTabs=mNumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return new TopStoriesFragment();
            case 1: return new TechnewsFramgent();
            case 2: return new HeadlinesFragment();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
