package com.example.codelab;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class DialogActivity extends AppCompatActivity {
    private static final String LOG_TAG=DialogActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
    }

    public void onClickShowAlert(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        AlertDialog alertDialog=builder.setTitle("I am the title")
                .setIcon(R.drawable.ic_launcher_background)
                .setMessage("Hey you want to come in ?")
                .setNegativeButton("Cancel",(dialog, which) -> {
                                 displayToast("You Cancelled ");
                })
                .setPositiveButton("Accept",(dialog, which) -> {
                    displayToast("You Accepted");
                })
                .show();
    }
    private void displayToast(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }
}