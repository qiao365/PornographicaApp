package Requests;

import com.google.gson.JsonObject;

import consts.RequestConst;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by duhongxing on 2018/8/31.
 */

public interface RegisterRequest {
    @POST(RequestConst.loginRequest)
    @FormUrlEncoded
    Call<JsonObject> getRegisteCall(@Field("account") String account, @Field("password")String password, @Field("tip") String tip,@Field("captcha") String captcha);
}
