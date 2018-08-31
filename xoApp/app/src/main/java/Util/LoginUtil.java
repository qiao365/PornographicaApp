package Util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by duhongxing on 2018/8/28.
 */

public class LoginUtil {
   public static void saveUserInfo(Context context, String key, Object object){
       SharedPreferences sp = context.getSharedPreferences("user", Context.MODE_PRIVATE);
       SharedPreferences.Editor editor = sp.edit();
       if (object instanceof String) {
           editor.putString(key, (String) object);
       } else if (object instanceof Integer) {
           editor.putInt(key, (Integer) object);
       } else if (object instanceof Boolean) {
           editor.putBoolean(key, (Boolean) object);
       } else {
           editor.putString(key, object.toString());
       }
       editor.commit();
   }

   public static Object getUserInfo(Context context,String key,Object defaultObject) {
       SharedPreferences sp = context.getSharedPreferences("user", Context.MODE_PRIVATE);
       if (defaultObject instanceof String) {
           return sp.getString(key, (String) defaultObject);
       } else if (defaultObject instanceof Integer) {
           return sp.getInt(key, (Integer) defaultObject);
       } else if (defaultObject instanceof Boolean) {
           return sp.getBoolean(key, (Boolean) defaultObject);
       } else if (defaultObject instanceof Float) {
           return sp.getFloat(key, (Float) defaultObject);
       } else if (defaultObject instanceof Long) {
           return sp.getLong(key, (Long) defaultObject);
       }
       return null;
   }
}
