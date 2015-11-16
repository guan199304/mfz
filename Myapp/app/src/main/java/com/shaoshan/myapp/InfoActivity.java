package com.shaoshan.myapp;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Administrator on 2015/10/22.
 */
public class InfoActivity extends ActionBarActivity {
//    TextView tv = (TextView) findViewById(R.id.tv_info);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);

        TextView tv = (TextView) findViewById(R.id.tv_info);

        tv.setMovementMethod(ScrollingMovementMethod.getInstance());

    }
}
