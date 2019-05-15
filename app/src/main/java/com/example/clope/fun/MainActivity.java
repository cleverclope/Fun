package com.example.clope.fun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Switch;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG="mytag";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater= getMenuInflater();
        menuInflater.inflate(R.menu.newmenus,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                Log.d(TAG, "settings_accessed");
                return true;

            case R.id.help:
                Log.d(TAG, "help_details");
                return true;
            case R.id.invitefriends:
                Log.d(TAG, "online");
                return true;
            default:
                return super.onOptionsItemSelected(item);
    }
    }
    public void func(View V){
        Intent intent= new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
    public void fun(View V){
        Intent intent= new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}
