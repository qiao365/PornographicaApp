package com.example.unkown.xoapp;

import android.app.Fragment;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.ahmadrosid.svgloader.SvgLoader;
import com.google.gson.JsonObject;
import com.rengwuxian.materialedittext.MaterialEditText;
import com.squareup.picasso.Picasso;

import Requests.LoginRequest;
import Util.RequestUtil;
import consts.RequestConst;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by duhongxing on 2018/8/27.
 */

public class LoginFragment extends Fragment {
    private View rooterView;
    private MaterialEditText userInput;
    private MaterialEditText passInput;
    private MaterialEditText codeInput;
    private Button registerBtn;
    private Button loginBtn;
    private ImageView validateImg;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        rooterView = inflater.inflate(R.layout.login_fragment, container, false);
        passInput = rooterView.findViewById(R.id.passlogin_edit);
        userInput = rooterView.findViewById(R.id.userlogin_edit);
        registerBtn = rooterView.findViewById(R.id.log_register_btn);
        loginBtn = rooterView.findViewById(R.id.login_btn);
        codeInput = rooterView.findViewById(R.id.code_edit);
        validateImg = rooterView.findViewById(R.id.id_login_validateImg);
        validateImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Picasso.with(getActivity())
                        .load(RequestConst.imgloadUrl)
                         .into(validateImg);
            }
        });

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginClick();
            }
        });
        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerClick();
            }
        });
        setInitDatas();
        return rooterView;
    }

    public void setInitDatas(){
//        RequestConst.httpHost+"/qingyi/account/recaptcha/captcha.jpg"
//        SvgLoader.pluck()
//                .with(getActivity())
//                .load(RequestConst.imgloadUrl,validateImg);
        Picasso.with(getActivity())
                .load(RequestConst.imgloadUrl)
                .resize(60,40)
                .into(validateImg);
    }

    public boolean validateField() {
        if (userInput.getText().length() <= 0) {
            return false;
        }
        if (passInput.getText().length() <= 0){
            return false;
        }
        if (codeInput.getText().length() <= 0){
            return false;
        }
        return true;
     }

    public void loginClick(){
//        if (!validateField()){
//            return;
//        }
        final LoginRequest request = (LoginRequest)RequestUtil.addRequest(LoginRequest.class);
        Call<JsonObject> call = request.getCallLogin("password","uu","65e21","9865");
        call.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                System.out.println("eewe");
            }
            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                System.out.println("eewe");

            }
        });
    }
    public void registerClick(){




    }
}
