package com.example.codelab;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.support.v4.app.DialogFragment;
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

    public void onDatePicked(View view) {
        DialogFragment newFrag=new DatePickerFragment();
        newFrag.show(getSupportFragmentManager(),"Date Picker");
    }

    public void processDatePickerResult(int year, int month, int day) {
        String month_string = Integer.toString(month+1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);
        String dateMessage = (month_string +
                "/" + day_string + "/" + year_string);
        Toast.makeText(this, "Date: " + dateMessage,
                Toast.LENGTH_SHORT).show();

    }

    public void onTimePicked(View view) {
        DialogFragment dialog=new TimePickerFragment();
        dialog.show(getSupportFragmentManager(),"Time picker");
    }

    public void showTime(int hourOfDay, int minute) {
        Toast.makeText(this, "Hours: " + hourOfDay+" Minutes: "+minute,
                Toast.LENGTH_SHORT).show();
    }
}