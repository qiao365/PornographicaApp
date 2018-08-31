package Requests;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by duhongxing on 2018/8/31.
 */

public interface LoginRequest {
    @Headers({"Accept:application/json",
            "Content-Type:application/x-www-form-urlencoded;charset=utf-8",
            "Authorization:Basic cHJvbW9zZXJ2ZXI6ZTYxOTcyMDViYTZmOWM2"})
    @POST("/promo/token")
    @FormUrlEncoded
    Call<JsonObject> getCall2(@Field("grant_type") String grant_type, @Field("username")String username, @Field("password") String password);
}
