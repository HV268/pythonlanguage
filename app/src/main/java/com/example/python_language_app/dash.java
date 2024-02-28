package com.example.python_language_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.View;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import android.app.AlertDialog;
import android.content.Context;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.Toast;


public class dash extends AppCompatActivity {

    private HorizontalScrollView horizontalScrollView;
    private Handler scrolHandler = new Handler();
    private Runnable scrolRunnable;
    private int scrolSpeed = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash);
        getSupportActionBar().setTitle("Content");

       horizontalScrollView = findViewById(R.id.horizontal1);

       setupAutoScrolling();



        if (!isNetworkConnected()) {
            showNoInternetDialog();
        }

    }

    private void setupAutoScrolling() {

        scrolRunnable = new Runnable() {
            @Override
            public void run() {

                horizontalScrollView.smoothScrollBy(scrolSpeed,0);
                scrolHandler.postDelayed(this,20);
            }
        };
        scrolHandler.postDelayed(scrolRunnable,500);
    }

    @Override
    protected void onPause(){
        super.onPause();
        scrolHandler.removeCallbacks(scrolRunnable);
    }

    @Override
    protected void onResume(){
        super.onResume();
        scrolHandler.postDelayed(scrolRunnable,1000);
    }


    public void basic1(View view) {
        Intent intent = new Intent(dash.this,basic1.class);
        startActivity(intent);
    }

    public void oop1(View view) {
        Intent intent = new Intent(dash.this,oop1.class);
        startActivity(intent);
    }

    public void related1(View view) {
        Intent intent = new Intent(dash.this,related1.class);
        startActivity(intent);
    }

    public void program1(View view) {
        Intent intent = new Intent(dash.this,program1.class);
        startActivity(intent);
    }

    public void benefits1(View view) {
        Intent intent = new Intent(dash.this,benefits1.class);
        startActivity(intent);
    }


    public void interview1(View view) {
        Intent intent = new Intent(dash.this,interview_1.class);
        startActivity(intent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    private boolean isNetworkConnected() {
        ConnectivityManager Connectivitymanager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = Connectivitymanager.getActiveNetworkInfo();
        return activeNetwork != null && activeNetwork.isConnectedOrConnecting();
    }

    private void showNoInternetDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("No Internet Connection")
                .setMessage("Dear User you are not connected to internet ")
                .setPositiveButton(android.R.string.ok, null)
                .setCancelable(false)
                .show();
}


    public void history1(View view) {
        Intent intent = new Intent(dash.this,history.class);
        startActivity(intent);
    }

    public void install1(View view) {
        Intent intent = new Intent(dash.this,instal.class);
        startActivity(intent);
    }

    public void c(View view) {
        Toast.makeText(this,"Will be come soon!!",Toast.LENGTH_SHORT).show();
    }

    public void c_plus(View view) {
        Toast.makeText(this,"Will be come soon!!",Toast.LENGTH_SHORT).show();
    }

    public void java(View view) {
        Toast.makeText(this,"Will be come soon!!",Toast.LENGTH_SHORT).show();
    }

    public void html1(View view) {
        Toast.makeText(this,"Will be come soon!!",Toast.LENGTH_SHORT).show();
    }

    public void css1(View view) {
        Toast.makeText(this,"Will be come soon!!",Toast.LENGTH_SHORT).show();
    }
}