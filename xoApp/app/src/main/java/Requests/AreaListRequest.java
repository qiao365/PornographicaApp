package Requests;

import org.json.JSONObject;

import consts.RequestConst;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by duhongxing on 2018/8/31.
 */

public interface AreaListRequest {
    @GET(RequestConst.areaListUrl)
    Call<JSONObject> getAreaListCall();
}
