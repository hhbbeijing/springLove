package com.spring.han.constant;

import android.util.Log;

/**
 * @author hanhaibo
 * @version v1.0
 * @data 2019/2/20
 */
public class SpringLog {
    public static final String TAG = "debugSpring";
    public static final boolean DEBUG = true;

    public static void print(String msg) {
        print((String)null, msg, (Throwable)null);
    }

    public static void print(Throwable throwable) {
        print((String)null, (String)null, throwable);
    }

    public static void print(String tag, String msg) {
        print(tag, msg, (Throwable)null);
    }

    public static void print(String tag, Throwable throwable) {
        print(tag, (String)null, throwable);
    }

    public static void print(String pattern, Object... args) {
        print((String)null, String.format(pattern, args), (Throwable)null);
    }

    public static void print(String tag, String msg, Throwable throwable) {
        if(DEBUG) {
            String var3 = "LakalaDebug";
            if(tag != null) {
                var3 = tag;
            }

            if(msg != null) {
                int maxLeng = 2000;
                int leng = msg.length();
                if(leng<maxLeng || leng == maxLeng){
                    Log.d(var3, msg);
                }else{
                    while (msg.length()>maxLeng){
                        String logContent = msg.substring(0, maxLeng);
                        Log.d(var3, logContent);
                        msg = msg.substring(maxLeng, msg.length());
                    }
                    Log.d(var3, msg);
                }

            }

            if(throwable != null) {
                Log.e(var3, throwable.toString());
            }

        }
    }
}
