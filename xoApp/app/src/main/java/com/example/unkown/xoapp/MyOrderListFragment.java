package com.example.unkown.xoapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import views.MyOrderListAdapter;

/**
 * Created by duhongxing on 2018/8/30.
 */

public class MyOrderListFragment extends Fragment {
  private View rootView;
  private ListView orderListView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.myorder_list_fragment,container,false);
        orderListView = rootView.findViewById(R.id.id_order_list);
//        orderListView.setAdapter(new MyOrderListAdapter());
        return rootView;
    }
}
