package com.example.unkown.xoapp;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

import views.HomeAdapter;

/**
 * Created by duhongxing on 2018/8/27.
 */

public class HomeFragment extends Fragment {
    private View rootView;
    private RecyclerView recyclerView;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.home_fragment,container, false);
        recyclerView = rootView.findViewById(R.id.id_main_recylist);
        String[] words = {"ace", "boom", "crew", "dog", "eon"};
        List<String> list = Arrays.asList(words);
        GridLayoutManager layoutManager = new GridLayoutManager(getContext(),2);
         recyclerView.setLayoutManager(layoutManager);
         recyclerView.setBackgroundColor(0xF2F2F2);
         recyclerView.setAdapter(new HomeAdapter(getContext(),list) {

         });
         return rootView;
    }
}
