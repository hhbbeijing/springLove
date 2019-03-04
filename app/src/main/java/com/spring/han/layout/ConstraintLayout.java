package com.spring.han.layout;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.spring.han.R;
import com.spring.han.constant.SpringLog;


/**
 *
 * Activity的生命周期
 *
 * @author hanhaibo
 * @version v1.0
 * @data 2019/2/18
 */
public class ConstraintLayout extends Activity {

    private TextView textView1;
    private TextView textView;

    private String TEXT_VIEW_KEY = "TEXT_VIEW_KEY";
    private String TEXT_VIEW_KEY_COUNT = "TEXT_VIEW_KEY_COUNT";

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // recovering the instance state
        if (savedInstanceState != null) {
            SpringLog.print(SpringLog.TAG,"--->savedInstanceState != null");

        }
        setContentView(R.layout.constraint_layout);
        SpringLog.print(SpringLog.TAG,"--->onCreate");

        textView1 = (TextView) findViewById(R.id.id_textView_1);
        textView = (TextView) findViewById(R.id.id_textView_3);

    }

    @Override
    protected void onStart() {
        super.onStart();
        SpringLog.print(SpringLog.TAG,"--->onStart");


    }

    @Override
    protected void onResume() {
        super.onResume();
        SpringLog.print(SpringLog.TAG,"--->onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        SpringLog.print(SpringLog.TAG,"--->onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        SpringLog.print(SpringLog.TAG,"--->onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        SpringLog.print(SpringLog.TAG,"--->onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        SpringLog.print(SpringLog.TAG,"--->onDestroy");
    }

    /*
    * 1、只存储基本类型和简单的小对象，如String。
    * 2、被调用时机：横竖屏切换、分屏
    *
    * */
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString(TEXT_VIEW_KEY, "onSaveInstanceState");
        outState.putInt(TEXT_VIEW_KEY_COUNT, Integer.parseInt(textView1.getText().toString())+1);
        super.onSaveInstanceState(outState);
    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        textView1.setText(String.valueOf(savedInstanceState.getInt(TEXT_VIEW_KEY_COUNT,0)));
        textView.setText(savedInstanceState.getString(TEXT_VIEW_KEY) + String.valueOf(savedInstanceState.getInt(TEXT_VIEW_KEY_COUNT,0)));
    }
}


