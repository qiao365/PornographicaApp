package com.example.unkown.xoapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.rengwuxian.materialedittext.MaterialEditText;

/**
 * Created by duhongxing on 2018/8/27.
 */

public class LoginFragment extends Fragment {
    private View rooterView;
    private MaterialEditText userInput;
    private MaterialEditText passInput;
    private Button registerBtn;
    private Button loginBtn;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        rooterView = inflater.inflate(R.layout.login_fragment,container,false);
        passInput = rooterView.findViewById(R.id.passlogin_edit);
        userInput = rooterView.findViewById(R.id.userlogin_edit);
        registerBtn = rooterView.findViewById(R.id.log_register_btn);
        loginBtn = rooterView.findViewById(R.id.login_btn);
        return rooterView;
    }
}
