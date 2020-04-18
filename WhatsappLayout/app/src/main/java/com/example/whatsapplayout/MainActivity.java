package com.example.whatsapplayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager(), 0);
        pagerAdapter.addFragment(new ChatFragment());
        pagerAdapter.addFragment(new StatusFragment());
        pagerAdapter.addFragment(new CallFragment());

        viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(pagerAdapter);

        tabLayout = findViewById(R.id.tab);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setText("Chats");
        tabLayout.getTabAt(1).setText("Status");
        tabLayout.getTabAt(2).setText("Calls");


    }
}
