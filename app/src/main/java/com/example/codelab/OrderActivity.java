package com.example.codelab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

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
    private void displayToast(String message){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }
    public void ondeliveryMethod(View view){
        RadioButton delivery=(RadioButton)view;
        String deliveryMethod=delivery.getText().toString();
        displayToast(deliveryMethod);
    }
}