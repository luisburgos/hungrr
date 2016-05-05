package com.snotsoft.hungrr.menu;


import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.view.ViewPager;
import android.os.Bundle;



import com.snotsoft.hungrr.R;
import com.snotsoft.hungrr.domain.Menu;

public class MenuActivity extends AppCompatActivity {


    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;
    private Menu menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


           Menu menu = (Menu) getIntent().getSerializableExtra("Menu");


        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager(),menu);
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);


    }




}
