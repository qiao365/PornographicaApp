package com.example.unkown.xoapp;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public String nav_title;
    private TextView nav_textView;
    HomeFragment homeFragment;
    MineFragment mineFragment;
    AddFragment addFragment;
    Fragment currentFragment;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            FragmentManager manager = getFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();

            switch (item.getItemId()) {
                case R.id.navigation_home:
                    setNav_title("首页");
                    hideFragmentsAndShowFragmet(transaction, homeFragment);
                    return true;
                case R.id.navigation_dashboard:
                    setNav_title("添加");
                    hideFragmentsAndShowFragmet(transaction, addFragment);
                    return true;
                case R.id.navigation_notifications:
                    setNav_title("我的");
                    hideFragmentsAndShowFragmet(transaction, mineFragment);
                    return true;
            }
            return false;
        }
    };

    protected void hideFragmentsAndShowFragmet(FragmentTransaction transaction, Fragment fragment) {
        if (addFragment.isAdded() == true) {
            transaction.hide(addFragment);
        }
        if (mineFragment.isAdded() == true) {
            transaction.hide(mineFragment);
        }
        if (homeFragment.isAdded() == true) {
            transaction.hide(homeFragment);
        }
        if (fragment.isAdded() == false) {
            transaction.add(R.id.id_content, fragment);
        }
        currentFragment = fragment;
        transaction.show(fragment).commit();
    }

    public void setupView() {
        homeFragment = new HomeFragment();
        mineFragment = new MineFragment();
        addFragment = new AddFragment();
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        hideFragmentsAndShowFragmet(transaction, homeFragment);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Intent intent = new Intent(this,LoginActivity.class);
//        startActivity(intent);
        Toolbar toolbar = (Toolbar) findViewById(R.id.ToolBar);
        toolbar.setTitle("");
        this.nav_textView = (TextView) findViewById(R.id.toolbar_title);
        this.nav_textView.setText("首页");
        setSupportActionBar(toolbar);
        setupView();
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    public void setNav_title(String nav_title) {
        nav_title = nav_title;
        this.nav_textView.setText(nav_title);
    }
}
