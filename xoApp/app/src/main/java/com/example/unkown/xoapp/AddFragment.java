package com.example.unkown.xoapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import org.angmarch.views.NiceSpinner;

/**
 * Created by duhongxing on 2018/8/27.
 */

public class AddFragment extends Fragment {
    private View rootView;
    private NiceSpinner ageSpinner;
    private NiceSpinner contactTypeSpinner;
    private NiceSpinner provinceSpinner;
    private NiceSpinner areaSpinner;
    private Button addBtn;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.add_fragment,container, false);
        ageSpinner = rootView.findViewById(R.id.id_age_spinner);
        contactTypeSpinner = rootView.findViewById(R.id.id_province_type);
        provinceSpinner = rootView.findViewById(R.id.id_province_type);
        areaSpinner = rootView.findViewById(R.id.id_area_type);
        addBtn = rootView.findViewById(R.id.id_add_btn);

        ageSpinner.setBackgroundResource(R.drawable.spinner_style_line);
        contactTypeSpinner.setBackgroundResource(R.drawable.spinner_style_line);
        provinceSpinner.setBackgroundResource(R.drawable.spinner_style_line);
        areaSpinner.setBackgroundResource(R.drawable.spinner_style_line);
        return rootView;
    }

}
