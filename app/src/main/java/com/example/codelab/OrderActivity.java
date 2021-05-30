package com.example.codelab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Intent intent=getIntent();
        String orderMessage=intent.getStringExtra(MainActivity.orderTextExtra);
        TextView textView=(TextView)findViewById(R.id.ordertext);
        textView.setText(orderMessage);

        Spinner spinner=(Spinner)findViewById(R.id.label_spinner);
        if(spinner!=null){
            spinner.setOnItemSelectedListener(this);
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                    R.array.labels_array, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource
                    (android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
        }
    }
    private void displayToast(String message){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }
    public void ondeliveryMethod(View view){
        RadioButton delivery=(RadioButton)view;
        String deliveryMethod=delivery.getText().toString();
        displayToast(deliveryMethod);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            String location=parent.getItemAtPosition(position).toString();
            displayToast(location);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}