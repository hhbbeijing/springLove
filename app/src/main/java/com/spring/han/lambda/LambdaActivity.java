package com.spring.han.lambda;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.spring.han.R;

/**
 *
 * Lambda：匿名函数
 * 官网：https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html
 * 作用：
 *      1、允许把函数作为一个方法的参数；
 *      2、使用 Lambda 表达式可以使代码变的更加简洁紧凑。
 *      我们实际上传递了一个对象给方法，使用lambda不再需要创建对象，我们只需要把lambda代码传递给方法。
 * 条件：JDK1.8 或 通过gradle安装对应插件
 *
 *
 *
 * @author hanhaibo
 * @version v1.0
 * @data 2019/3/4
 */
public class LambdaActivity extends AppCompatActivity {

    private TextView id_textView_lambda;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lambda_layout);

        id_textView_lambda = findViewById(R.id.id_textView_lambda);


        //1、无参数
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        }).start();
        new Thread(() -> {
            Log.d("debug","--> 无参数");
        }).start();

        //2、有参数
//        id_textView_lambda.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
        id_textView_lambda.setOnClickListener((v) -> {
            id_textView_lambda.setText(String.valueOf(v.getId()));
        });
    }

}
