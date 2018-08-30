package com.example.unkown.xoapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.rengwuxian.materialedittext.MaterialEditText;

/**
 * Created by duhongxing on 2018/8/27.
 */

public class RegisterFragment extends Fragment {
    private View rooterView;
    private MaterialEditText userInput;
    private MaterialEditText passInput;
    private MaterialEditText twoPassInput;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        rooterView = inflater.inflate(R.layout.register_fragment,container,true);
        userInput = rooterView.findViewById(R.id.user_edit);
        passInput = rooterView.findViewById(R.id.password_edit);
        twoPassInput = rooterView.findViewById(R.id.twopassword_edit);
        return rooterView;
    }
}
