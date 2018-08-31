package Requests;

import com.google.gson.JsonObject;

import consts.RequestConst;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by duhongxing on 2018/8/31.
 */

public interface LoginRequest {
    @Headers({"Authorization:Basic cWluZ3lpc2U6Z1gxZkJhdDNiVg=="})
    @POST("/qingyi/account/login")
    @FormUrlEncoded
    Call<JsonObject> getCallLogin(@Field("grant_type") String grant_type, @Field("username")String username, @Field("password") String password,@Field("captcha")String captcha);
}
