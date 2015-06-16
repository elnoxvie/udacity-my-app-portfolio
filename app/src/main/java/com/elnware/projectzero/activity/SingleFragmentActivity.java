package com.elnware.projectzero.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.elnware.projectzero.R;

/**
 * Created by elnoxvie on 8/6/15.
 */
public abstract class SingleFragmentActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_container);
        FragmentManager fragmentManager = getSupportFragmentManager();

        if (savedInstanceState == null){
            fragmentManager.beginTransaction().add(R.id.fragmentContainer, createFragment()).commit();
        }
    }

    protected abstract Fragment createFragment();

}
