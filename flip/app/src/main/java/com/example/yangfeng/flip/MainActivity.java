package com.example.yangfeng.flip;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import java.util.List;
import java.util.ArrayList;
import android.support.v4.view.ViewPager;



public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //构造适配器
        List<Fragment> fragments=new ArrayList<Fragment>();
        fragments.add(new Fragment1());
        fragments.add(new Fragment2());
        fragments.add(new Fragment3());
        FragAdapter adapter = new FragAdapter(getSupportFragmentManager(), fragments);

        //设定适配器
        ViewPager vp = (ViewPager)findViewById(R.id.viewpager);
        vp.setAdapter(adapter);
    }

}
