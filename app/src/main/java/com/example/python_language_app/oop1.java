package com.example.python_language_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class oop1 extends AppCompatActivity {

    ListView lst_v;

    String topic1[]={
       "Python OOPs Introduction","Python Class & Object", "Python Constructors","Python Inheritance","Python Polymorphism","Data Abstraction in Python"
    };

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oop1);
        getSupportActionBar().setTitle("OOPs");

       lst_v = findViewById(R.id.list2);

        ArrayAdapter<String>arr;
        arr=new ArrayAdapter<String>(this,R.layout.list_oop,topic1);
        lst_v.setAdapter(arr);

        lst_v.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Intent intent =new Intent(oop1.this,oop_intro.class);
                    startActivity(intent);
                }else if(i==1){
                    Intent intent =new Intent(oop1.this,class_object.class);
                    startActivity(intent);
                }else if(i==2){
                    Intent intent =new Intent(oop1.this,constructors.class);
                    startActivity(intent);
                }else if(i==3){
                    Intent intent =new Intent(oop1.this,inheritance.class);
                    startActivity(intent);
                }else if(i==4){
                    Intent intent =new Intent(oop1.this,polymorphism.class);
                    startActivity(intent);
                }else if(i==5){
                    Intent intent =new Intent(oop1.this,abstraction.class);
                    startActivity(intent);
                }
            }
        });




    }
}