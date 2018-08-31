package com.example.unkown.xoapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.gson.JsonObject;
import com.rengwuxian.materialedittext.MaterialEditText;

import Requests.LoginRequest;
import Requests.RegisterRequest;
import Util.RequestUtil;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by duhongxing on 2018/8/27.
 */

public class RegisterFragment extends Fragment {
    private View rooterView;
    private MaterialEditText userInput;
    private MaterialEditText passInput;
    private MaterialEditText twoPassInput;
    private MaterialEditText registerInput;//验证码
    private ImageView validateImageView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        rooterView = inflater.inflate(R.layout.register_fragment,container,true);
        userInput = rooterView.findViewById(R.id.user_edit);
        passInput = rooterView.findViewById(R.id.password_edit);
        twoPassInput = rooterView.findViewById(R.id.twopassword_edit);
        registerInput = rooterView.findViewById(R.id.register_code_edit);
        validateImageView = rooterView.findViewById(R.id.id_register_validateImg);
        return rooterView;
    }

    public boolean validateField() {
        if (userInput.getText().length() <= 0) {
            return false;
        }
        if (passInput.getText().length() <= 0){
            return false;
        }

        if (registerInput.getText().length() <= 0){
            return false;
        }
        return true;
    }

    public void registClick(){
        if (!validateField()){
            return;
        }
        final RegisterRequest request = (RegisterRequest) RequestUtil.addRequest(RegisterRequest.class);
        Call<JsonObject> call = request.getRegisteCall("","","","");
        call.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {

            }
            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {

            }
        });
    }

}
