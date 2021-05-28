package com.example.codelab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Intent intent=getIntent();
        String orderMessage=intent.getStringExtra(MainActivity.orderTextExtra);
        TextView textView=(TextView)findViewById(R.id.ordertext);
        textView.setText(orderMessage);
    }
}