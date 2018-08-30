package com.example.unkown.xoapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by duhongxing on 2018/8/27.
 */

public class MineFragment extends Fragment {
    private View rootView;
    private TextView acountText;
    private TextView acountYueText;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.mine_fragment,container, false);
        acountText = rootView.findViewById(R.id.id_acount_text);
        acountYueText = rootView.findViewById(R.id.id_count_text);
        acountYueText.setText("0");
        acountText.setText("Xiao****1994");
        return rootView;
    }
}
