package com.example.services;

import android.content.Context;
import android.content.SharedPreferences.Editor;

public class Config {
    public  static final String KEY="token";
    public static final String APP_ID="com.example.services";
    
    public static String getCatheToken(Context context)
    {
         return context.getSharedPreferences(APP_ID, Context.MODE_PRIVATE).getString(KEY, null);
    }
    
    public static void configToken(Context context,String token)
    {
    	Editor e=context.getSharedPreferences(APP_ID, Context.MODE_PRIVATE).edit();
    	e.putString(KEY, token);
    	e.commit();
    }
}
