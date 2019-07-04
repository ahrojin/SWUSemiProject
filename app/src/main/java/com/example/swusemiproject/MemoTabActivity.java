package com.example.swusemiproject;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MemoTabActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_memo_tab);
        tabLayout=findViewById(R.id.tabLayout);
        viewPager=findViewById(R.id.viewPager);

        tabLayout.addTab(tabLayout.newTab().setText("글쓰기"));
        tabLayout.addTab(tabLayout.newTab().setText("사진찍기"));

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        MyPagerAdapter adapter=new MyPagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
    class MyPagerAdapter extends FragmentPagerAdapter {
        int tapSize;  //TAB 수

        public MyPagerAdapter(FragmentManager fm, int count) {
            super(fm);
            this.tapSize=count;   //TAB 수
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return new WriteMemoActivity();
                case 1:
                    return new Camera();

            }
            return null;
        }

        @Override
        public int getCount() {
            return this.tapSize;
        }
    }

}
