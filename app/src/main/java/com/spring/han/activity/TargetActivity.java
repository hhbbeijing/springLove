package com.spring.han.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.spring.han.R;

/**
 * @author hanhaibo
 * @version v1.0
 * @data 2019/2/19
 */
public class TargetActivity extends Activity {
    @Override
    protected void onCreate( @Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.target_layout);
    }
}
