package com.ardiery.gametk;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Map;

public class main extends AppCompatActivity {
    public static final String PREFS_NAME = "Storage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        SharedPreferences sp = getSharedPreferences(PREFS_NAME, 0);
        //int score = sp.getInt("score",0);
        //boolean isExam = sp.getBoolean("isExam",false);
        Map data = sp.getAll();
        //boolean isExam = data.containsKey("isExam");
        //String exam ;
        //if(isExam){
        //    exam = "Sedang Ujian";
        //}else{
        //    exam = "Tidak Sedang Ujian";
       // }
        final Button warna = (Button) findViewById(R.id.warna);
        warna.setOnClickListener(  new View.OnClickListener() {
            public void onClick(View v) {
                Intent mainIntent;
                SharedPreferences sp = getSharedPreferences(PREFS_NAME, 0);
                mainIntent = new Intent(main.this,Warna.class);
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("onstate", "warna");
                startActivity(mainIntent);
            }
        });
        //String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        //TextView textView = findViewById(R.id.statusexam);
        //textView.setText(exam);
    }
}
