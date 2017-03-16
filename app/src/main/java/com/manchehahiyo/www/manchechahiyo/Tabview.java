package com.manchehahiyo.www.manchechahiyo;

import android.graphics.Color;
import android.support.v4.app.*;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.manchehahiyo.www.manchechahiyo.Fragments.BottomFragment;
import com.manchehahiyo.www.manchechahiyo.Fragments.MiddleFragment;
import com.manchehahiyo.www.manchechahiyo.Fragments.TopFragment;

public class Tabview extends AppCompatActivity {
    ViewPager viewPager;

    TextView tab1,tab2,tab3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tab1= (TextView) findViewById(R.id.tab1);
        tab2= (TextView) findViewById(R.id.tab2);
        viewPager= (ViewPager) findViewById(R.id.container);
        tab3= (TextView) findViewById(R.id.tab3);
        tab1.setOnClickListener(tabclicklistener);
        tab2.setOnClickListener(tabclicklistener);
        tab3.setOnClickListener(tabclicklistener);
        //getSupportFragmentManager().beginTransaction().replace(R.id.container,new BottomFragment()).commit();


        tab1.setBackgroundColor(Color.BLUE);

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                tab1.setBackgroundColor(Color.parseColor("#aabbcc"));
                tab2.setBackgroundColor(Color.parseColor("#aabbcc"));
                tab3.setBackgroundColor(Color.parseColor("#aabbcc"));
                if(position==0){
                    tab1.setBackgroundColor(Color.BLUE);
                  //  viewPager.setCurrentItem(0);



                    // getSupportFragmentManager().beginTransaction().replace(R.id.container,new TopFragment()).commit();
                    //// tab1.setBackgroundColor(Color.BLUE);
                    //pager.setCurrentItem(0);
                    // getSupportFragmentManager().beginTr
                    // tansaction().replace(R.id.container,new TopFragment()).commit();


                }else if(position==1)
                {
                    tab2.setBackgroundColor(Color.BLUE);
                   // viewPager.setCurrentItem(1);
                    //getSupportFragmentManager().beginTransaction().replace(R.id.container,new BottomFragment()).commit();
//                //getSupportFragmentManager().beginTransaction().replace(R.id.container,new BottonFragment()).commit();

                }
                else{
                   // viewPager.setCurrentItem(2);

                    //getSupportFragmentManager().beginTransaction().replace(R.id.container,new MiddleFragment()).commit();
                    tab3.setBackgroundColor(Color.BLUE);


                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        viewPager.setAdapter(new TabviewAdapter(getSupportFragmentManager()));

    }
    public View.OnClickListener tabclicklistener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if(v.getId()==R.id.tab1){
                tab1.setBackgroundColor(Color.BLUE);
                viewPager.setCurrentItem(0);



               // getSupportFragmentManager().beginTransaction().replace(R.id.container,new TopFragment()).commit();
                 //// tab1.setBackgroundColor(Color.BLUE);
                //pager.setCurrentItem(0);
                // getSupportFragmentManager().beginTr
                // tansaction().replace(R.id.container,new TopFragment()).commit();


            }else if(v.getId()==R.id.tab2)
            {
                tab2.setBackgroundColor(Color.BLUE);
                viewPager.setCurrentItem(1);
                //getSupportFragmentManager().beginTransaction().replace(R.id.container,new BottomFragment()).commit();
//                //getSupportFragmentManager().beginTransaction().replace(R.id.container,new BottonFragment()).commit();

            }
            else{
                viewPager.setCurrentItem(2);

                //getSupportFragmentManager().beginTransaction().replace(R.id.container,new MiddleFragment()).commit();
                tab3.setBackgroundColor(Color.BLUE);


            }

        }
    };

    public class TabviewAdapter extends FragmentPagerAdapter {
        public TabviewAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if (position==0){
                return new TopFragment();
            }else if (position==1){
                return  new MiddleFragment();

            }else

            return new BottomFragment();
        }

        @Override
        public int getCount() {
            return 3;
        }
    }


}


