package com.example.viewpager2library;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ViewPager2 mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);



        mViewPager = (ViewPager2) findViewById(R.id.view_pager);

        ArrayList<String> mList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            mList.add(String.valueOf(i));
        }


    }
}