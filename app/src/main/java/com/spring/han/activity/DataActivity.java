package com.spring.han.activity;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.spring.han.R;

import java.util.List;

/**
 * URL 启动 APP
 *
 * 0、配置文件
 * <data android:scheme="spring"
 *       android:host="hostname"
 *       android:port="8080"
 *       android:path="/pathname/pathname">
 * </data>
 * 1、浏览器启动APP
 *     <category android:name="android.intent.category.BROWSABLE" />
 *     示例：<a href="spring://hostname:8080/pathname/pathname?query1=1&query2=true">打开APP</a>
 *
 * 2、APP启动
 *     <action android:name="android.intent.action.VIEW"></action>
 *
 *     Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("spring://hostname:8080/pathname/pathname?query1=1&query2=true"));
 *     startActivity(intent);
 *
 * @author hanhaibo
 * @version v1.0
 * @data 2019/2/19
 */
public class DataActivity extends Activity {
    private static final String TAG = "debugSpring";
    @Override
    protected void onCreate( @Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.target_layout);

        logData(getIntent().getData());
    }

    private void logData(Uri uri){
        if (uri != null) {
            // 完整的url信息
            String url = uri.toString();
            Log.i(TAG, "url:" + uri);

            // scheme部分
            String scheme = uri.getScheme();
            Log.i(TAG, "scheme:" + scheme);

            // host部分
            String host = uri.getHost();
            Log.i(TAG, "host:" + host);

            // port部分
            int port = uri.getPort();
            Log.i(TAG, "port:" + port);

            // 访问路劲
            String path = uri.getPath();
            Log.i(TAG, "path:" + path);

            List<String> pathSegments = uri.getPathSegments();

            // Query部分
            String query = uri.getQuery();
            Log.i(TAG, "query:" + query);

            //获取指定参数值
            String success = uri.getQueryParameter("success");
            Log.i(TAG, "success:" + success);
        }
    }
}
