package com.example.unkown.xoapp;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by duhongxing on 2018/8/27.
 */

public class LoginActivity extends Activity {
    private LoginFragment loginFragment;
    private RegisterFragment registerFragment;
    Fragment currentFragment;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setupView();
    }

    public void setupView(){
        loginFragment = new LoginFragment();
        registerFragment = new RegisterFragment();
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        hideFragmentsAndShowFragmet(transaction,loginFragment);
    }

    protected void hideFragmentsAndShowFragmet(FragmentTransaction transaction, Fragment fragment) {
        if (loginFragment.isAdded() == true) {
            transaction.hide(loginFragment);
        }
        if (registerFragment.isAdded() == true) {
            transaction.hide(registerFragment);
        }
        if (fragment.isAdded() == false) {
            transaction.add(R.id.id_login_content, fragment);
        }
        currentFragment = fragment;
        transaction.show(fragment).commit();
    }

}
