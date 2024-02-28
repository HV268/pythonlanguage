package com.example.python_language_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.Transliterator;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class basic1 extends AppCompatActivity {

    ListView lst_v;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic1);
        getSupportActionBar().setTitle("Basics");

        lst_v= findViewById(R.id.list1);

        List<String>list=new ArrayList<>();
        list.add("Introduction");
        list.add("Python Variables");
        list.add("Python Data Types");
        list.add("Python Keywords");
        list.add("Python Operators");
        list.add("Python Comments");
        list.add("Python Conditional Statements");
        list.add("Python Loops");
        list.add("Python Jump Statements");
        list.add("Python Strings");
        list.add("Python List");
        list.add("Python Tuples");
        list.add("Python Sets");
        list.add("Python Dictionary");
        list.add("Python Functions");
        list.add("Python Files I/O");
        list.add("Python Arrays");





        ArrayAdapter arrayAdapter =new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        lst_v.setAdapter(arrayAdapter);
        lst_v.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if(i == 0){
                    Intent intent = new Intent(basic1.this,inroduction.class);
                    startActivity(intent);
                } else if (i == 1) {
                    Intent intent = new Intent(basic1.this,variables.class);
                    startActivity(intent);

                } else if (i== 2) {
                    Intent intent= new Intent(basic1.this,data_types.class);
                    startActivity(intent);

                } else if (i==3) {
                    Intent intent= new Intent(basic1.this,keywords.class);
                    startActivity(intent);
                } else if (i==4) {
                    Intent intent= new Intent(basic1.this,operators.class);
                    startActivity(intent);

                } else if (i==5) {
                    Intent intent= new Intent(basic1.this,comments.class);
                    startActivity(intent);

                }else if (i==6){
                    Intent intent= new Intent(basic1.this,conditional_statements.class);
                    startActivity(intent);
                }else if (i==7){
                    Intent intent= new Intent(basic1.this,loops.class);
                    startActivity(intent);
                }else if (i==8){
                    Intent intent= new Intent(basic1.this,jumping_statements.class);
                    startActivity(intent);
                }else if (i==9){
                    Intent intent= new Intent(basic1.this,strings.class);
                    startActivity(intent);
                }else if (i==10){
                    Intent intent= new Intent(basic1.this,list.class);
                    startActivity(intent);
                }else if (i==11){
                    Intent intent= new Intent(basic1.this,tuples.class);
                    startActivity(intent);
                }else if (i==12){
                    Intent intent= new Intent(basic1.this,sets.class);
                    startActivity(intent);
                }else if (i==13){
                    Intent intent= new Intent(basic1.this,dictionary.class);
                    startActivity(intent);
                }else if (i==14){
                    Intent intent= new Intent(basic1.this,functions.class);
                    startActivity(intent);
                }else if (i==15){
                    Intent intent= new Intent(basic1.this,files.class);
                    startActivity(intent);
                }else if (i==16){
                    Intent intent= new Intent(basic1.this,arrays.class);
                    startActivity(intent);
                }
            }
        });






    }
}