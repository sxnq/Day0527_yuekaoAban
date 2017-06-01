package com.bwie.day0527_yuekaoaban;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.bwie.day0527_yuekaoaban.newsdrag.ChannelActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = new Intent(this, ChannelActivity.class);
        startActivity(i);

    }
}
