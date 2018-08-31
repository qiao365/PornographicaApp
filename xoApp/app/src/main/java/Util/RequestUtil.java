package Util;
import java.lang.reflect.Type;

import consts.RequestConst;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
/**
 * Created by duhongxing on 2018/8/31.
 */

public class RequestUtil {
   public static <T>T addRequest(final Class<T> requestInterface) {
       Retrofit retrofit = new Retrofit.Builder()
               .baseUrl(RequestConst.httpHost) // 设置 网络请求 Url
               .addConverterFactory(GsonConverterFactory.create())
               .build();
       T request = retrofit.create(requestInterface);
       return request;
   }
}
