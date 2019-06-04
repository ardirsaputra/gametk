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
        final Button warna = (Button) findViewById(R.id.warna);
        warna.setOnClickListener(  new View.OnClickListener() {
            public void onClick(View v) {
                Intent mainIntent;
                SharedPreferences sp = getSharedPreferences(PREFS_NAME, 0);
                mainIntent = new Intent(main.this,Warna.class);
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("onState", "warna");
                editor.putString("Judul","Warna");
                editor.putString("Jumlah Soal","0");
                editor.putString("TombolUjian1","1");
                editor.putString("TombolUjian2","2");
                editor.putString("TombolUjian3","3");
                editor.putString("TombolUjian4","4");
                editor.putString("TombolUjian5","5");
                editor.putString("TombolUjian6","10");
                editor.apply();
                startActivity(mainIntent);
            }
        });
        final Button hewan = (Button) findViewById(R.id.hewan);
        hewan.setOnClickListener(  new View.OnClickListener() {
            public void onClick(View v) {
                Intent mainIntent;
                SharedPreferences sp = getSharedPreferences(PREFS_NAME, 0);
                mainIntent = new Intent(main.this,Hewan.class);
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("onState", "Hewan");
                editor.putString("Judul","Hewan");
                editor.putString("Jumlah Soal","0");
                editor.putString("TombolUjian1","1");
                editor.putString("TombolUjian2","2");
                editor.putString("TombolUjian3","3");
                editor.putString("TombolUjian4","4");
                editor.putString("TombolUjian5","5");
                editor.putString("TombolUjian6","10");
                editor.apply();
                startActivity(mainIntent);
            }
        });
        final Button bidang = (Button) findViewById(R.id.bidang);
        bidang.setOnClickListener(  new View.OnClickListener() {
            public void onClick(View v) {
                Intent mainIntent;
                SharedPreferences sp = getSharedPreferences(PREFS_NAME, 0);
                mainIntent = new Intent(main.this,Bidang.class);
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("onState", "Bidang");
                editor.putString("Judul","Bidang");
                editor.putString("Jumlah Soal","0");
                editor.putString("TombolUjian1","1");
                editor.putString("TombolUjian2","2");
                editor.putString("TombolUjian3","3");
                editor.putString("TombolUjian4","4");
                editor.putString("TombolUjian5","5");
                editor.putString("TombolUjian6","10");
                editor.apply();
                startActivity(mainIntent);
            }
        });
        final Button buah = (Button) findViewById(R.id.buah);
        buah.setOnClickListener(  new View.OnClickListener() {
            public void onClick(View v) {
                Intent mainIntent;
                SharedPreferences sp = getSharedPreferences(PREFS_NAME, 0);
                mainIntent = new Intent(main.this,Buah.class);
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("onState", "Buah");
                editor.putString("Judul","Buah");
                editor.putString("Jumlah Soal","0");
                editor.putString("TombolUjian1","1");
                editor.putString("TombolUjian2","2");
                editor.putString("TombolUjian3","3");
                editor.putString("TombolUjian4","4");
                editor.putString("TombolUjian5","5");
                editor.putString("TombolUjian6","10");
                editor.apply();
                startActivity(mainIntent);
            }
        });
    }
}
