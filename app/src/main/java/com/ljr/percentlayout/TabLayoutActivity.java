package com.ljr.percentlayout;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class TabLayoutActivity extends AppCompatActivity {

    private TabLayout mMainTab;
    private ViewPager mMainVp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);
        mMainTab = (TabLayout) findViewById(R.id.main_tab);
        mMainVp = (ViewPager) findViewById(R.id.main_vp);
        initViewPager();
    }

    private void initViewPager() {
        ArrayList<String> titles = new ArrayList<>();
        titles.add("百分比线性布局");
        titles.add("百分比相对布局");
        titles.add("百分比帧布局");
        //为tab添加标题
        for(int i=0;i<titles.size();i++){
            mMainTab.addTab(mMainTab.newTab().setText(titles.get(i)));
        }
        ArrayList<Fragment> fragments = new ArrayList<Fragment>();
        LinearFragment linearFragment = new LinearFragment();
        RelativeFragment relativeFragment = new RelativeFragment();
        FrameFragment frameFragment = new FrameFragment();
        fragments.add(linearFragment);
        fragments.add(relativeFragment);
        fragments.add(frameFragment);

        FragmentAdapter fragmentAdapter = new FragmentAdapter(getSupportFragmentManager(), fragments, titles);
        mMainVp.setAdapter(fragmentAdapter);
        mMainTab.setupWithViewPager(mMainVp);
        mMainTab.setTabsFromPagerAdapter(fragmentAdapter);
    }
}
