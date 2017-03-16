package com.manchehahiyo.www.manchechahiyo;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.manchehahiyo.www.manchechahiyo.Fragments.BottomFragment;
import com.manchehahiyo.www.manchechahiyo.Fragments.TopFragment;
import com.manchehahiyo.www.manchechahiyo.R;

public class Fragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);


        FragmentManager manager =getSupportFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.replace(R.id.top,new TopFragment());
        transaction.replace(R.id.bottom,new BottomFragment());
        transaction.commit();
    }
}
