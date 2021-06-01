package com.example.codelab;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Favourites extends AppCompatActivity {
    private static final String LOG_TAG=Favourites.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourites);
        registerForContextMenu(findViewById(R.id.view1));
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        Log.d(LOG_TAG,"id : "+v.getId());
        MenuInflater inflater=getMenuInflater();
        switch (v.getId()){
           case R.id.view1:
               Log.d(LOG_TAG,"Context menu callback is called");
               inflater.inflate(R.menu.scroll_menu,menu);
       }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.copy:
                displayToast(getString(R.string.action_copy));
                return true;
            case R.id.paste:
                displayToast(getString(R.string.action_paste));
                return true;
            default:
                displayToast("Cmon i am not free");
            return true;
        }

    }

    private void displayToast(String msg){
        Toast.makeText(this,msg, Toast.LENGTH_SHORT).show();
    }
}