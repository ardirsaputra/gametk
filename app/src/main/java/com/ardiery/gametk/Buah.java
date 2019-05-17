package com.ardiery.gametk;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;

public class Buah extends AppCompatActivity {
    public static final String PREFS_NAME = "Storage";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buah);
        SharedPreferences sp = getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = sp.edit();
        editor.putInt("score", 0);
        editor.putBoolean("isEzam", false);
        editor.putString("onState", "list buah");
        editor.putString("Judul","Hewan");
        editor.commit();
        final String judul = sp.getString("Judul","Warna");
        final String texttombolujian1 = sp.getString("TombolUjian1","1");
        final String texttombolujian2 = sp.getString("TombolUjian2","2");
        final String texttombolujian3 = sp.getString("TombolUjian3","3");
        final String texttombolujian4 = sp.getString("TombolUjian4","4");
        final String texttombolujian5 = sp.getString("TombolUjian5","5");
        final String texttombolujian6 = sp.getString("TombolUjian6","10");
        Button mangga  = (Button) findViewById(R.id.tombolmangga);
        mangga.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v ){
                final Dialog dialog = new Dialog(Buah.this);
                dialog.setContentView(R.layout.layout_custom);
                dialog.setTitle("Mangga");
                TextView text = (TextView) dialog.findViewById(R.id.tv_desc);
                text.setText("Mangga");
                ImageView image = (ImageView) dialog.findViewById(R.id.tv_icon);
                image.setMinimumWidth(100);
                image.setMinimumHeight(120);
                image.setImageResource(R.drawable.mangga);
                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);
                dialogButton.setOnClickListener( new View.OnClickListener(){
                    public void onClick(View v){
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        Button manggis  = (Button) findViewById(R.id.tombolmanggis);
        manggis.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v ){
                final Dialog dialog = new Dialog(Buah.this);
                dialog.setContentView(R.layout.layout_custom);
                dialog.setTitle("Manggis");
                TextView text = (TextView) dialog.findViewById(R.id.tv_desc);
                text.setText("Manggis");
                ImageView image = (ImageView) dialog.findViewById(R.id.tv_icon);
                image.setMinimumWidth(100);
                image.setMinimumHeight(120);
                image.setImageResource(R.drawable.manggis);
                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);
                dialogButton.setOnClickListener( new View.OnClickListener(){
                    public void onClick(View v){
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        Button pisang  = (Button) findViewById(R.id.tombolpisang);
        pisang.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v ){
                final Dialog dialog = new Dialog(Buah.this);
                dialog.setContentView(R.layout.layout_custom);
                dialog.setTitle("Pisang");
                TextView text = (TextView) dialog.findViewById(R.id.tv_desc);
                text.setText("Pisang");
                ImageView image = (ImageView) dialog.findViewById(R.id.tv_icon);
                image.setMinimumWidth(100);
                image.setMinimumHeight(120);
                image.setImageResource(R.drawable.pisang);
                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);
                dialogButton.setOnClickListener( new View.OnClickListener(){
                    public void onClick(View v){
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        Button sirsak  = (Button) findViewById(R.id.tombolsirsak);
        sirsak.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v ){
                final Dialog dialog = new Dialog(Buah.this);
                dialog.setContentView(R.layout.layout_custom);
                dialog.setTitle("Sirsak");
                TextView text = (TextView) dialog.findViewById(R.id.tv_desc);
                text.setText("Sirsak");
                ImageView image = (ImageView) dialog.findViewById(R.id.tv_icon);
                image.setMinimumWidth(100);
                image.setMinimumHeight(120);
                image.setImageResource(R.drawable.sirsak);
                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);
                dialogButton.setOnClickListener( new View.OnClickListener(){
                    public void onClick(View v){
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        Button jeruk  = (Button) findViewById(R.id.tomboljeruk);
        jeruk.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v ){
                final Dialog dialog = new Dialog(Buah.this);
                dialog.setContentView(R.layout.layout_custom);
                dialog.setTitle("Jeruk");
                TextView text = (TextView) dialog.findViewById(R.id.tv_desc);
                text.setText("Jeruk");
                ImageView image = (ImageView) dialog.findViewById(R.id.tv_icon);
                image.setMinimumWidth(100);
                image.setMinimumHeight(120);
                image.setImageResource(R.drawable.jeruk);
                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);
                dialogButton.setOnClickListener( new View.OnClickListener(){
                    public void onClick(View v){
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        Button durian  = (Button) findViewById(R.id.tomboldurian);
        durian.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v ){
                final Dialog dialog = new Dialog(Buah.this);
                dialog.setContentView(R.layout.layout_custom);
                dialog.setTitle("Durian");
                TextView text = (TextView) dialog.findViewById(R.id.tv_desc);
                text.setText("Durian");
                ImageView image = (ImageView) dialog.findViewById(R.id.tv_icon);
                image.setMinimumWidth(100);
                image.setMinimumHeight(120);
                image.setImageResource(R.drawable.durian);
                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);
                dialogButton.setOnClickListener( new View.OnClickListener(){
                    public void onClick(View v){
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        Button anggur  = (Button) findViewById(R.id.tombolanggur);
        anggur.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v ){
                final Dialog dialog = new Dialog(Buah.this);
                dialog.setContentView(R.layout.layout_custom);
                dialog.setTitle("Anggur");
                TextView text = (TextView) dialog.findViewById(R.id.tv_desc);
                text.setText("Anggur");
                ImageView image = (ImageView) dialog.findViewById(R.id.tv_icon);
                image.setMinimumWidth(100);
                image.setMinimumHeight(120);
                image.setImageResource(R.drawable.anggur);
                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);
                dialogButton.setOnClickListener( new View.OnClickListener(){
                    public void onClick(View v){
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        Button strowbery  = (Button) findViewById(R.id.tombolstroberry);
        strowbery.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v ){
                final Dialog dialog = new Dialog(Buah.this);
                dialog.setContentView(R.layout.layout_custom);
                dialog.setTitle("StrowBery");
                TextView text = (TextView) dialog.findViewById(R.id.tv_desc);
                text.setText("Stroberi");
                ImageView image = (ImageView) dialog.findViewById(R.id.tv_icon);
                image.setMinimumWidth(100);
                image.setMinimumHeight(120);
                image.setImageResource(R.drawable.stroberry);
                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);
                dialogButton.setOnClickListener( new View.OnClickListener(){
                    public void onClick(View v){
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        Button testBuah  = (Button) findViewById(R.id.tomboltestbuah);
        testBuah.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v ){
                final Dialog dialog = new Dialog(Buah.this);
                dialog.setContentView(R.layout.activity_ujian);
                ImageView headersoal = dialog.findViewById(R.id.headersoal);
                headersoal.setImageResource(R.drawable.headerbuahbuahan);
                dialog.setTitle("Berapa Soal ?");
                Button tombolujian1 = (Button) dialog.findViewById(R.id.tomboljumlahsoal1);
                tombolujian1.setText("1");
                tombolujian1.setOnClickListener(  new View.OnClickListener() {
                    public void onClick(View v) {
                        Random angka = new Random();
                        int soal = angka.nextInt(40);
                        String stringsoal = Integer.toString(soal);
                        Intent mainIntent;
                        SharedPreferences sp = getSharedPreferences(PREFS_NAME, 0);
                        mainIntent = new Intent(Buah.this,HewanTest.class);
                        SharedPreferences.Editor editor = sp.edit();
                        editor.putString("onState", "Ujian Buah");
                        editor.putBoolean("isExam",true);
                        editor.putString("Judul","Ujian Soal");
                        editor.putString("Jumlah Soal","1");
                        editor.putString("Nomor Soal","1");
                        editor.putString("Soal",stringsoal);
                        editor.commit();
                        startActivity(mainIntent);
                    }
                });
                Button tombolujian2 = (Button) dialog.findViewById(R.id.tomboljumlahsoal2);
                tombolujian2.setText("2");
                tombolujian2.setOnClickListener(  new View.OnClickListener() {
                    public void onClick(View v) {
                        Random angka = new Random();
                        int soal = angka.nextInt(40);
                        String stringsoal = Integer.toString(soal);
                        Intent mainIntent;
                        SharedPreferences sp = getSharedPreferences(PREFS_NAME, 0);
                        mainIntent = new Intent(Buah.this,HewanTest.class);
                        SharedPreferences.Editor editor = sp.edit();
                        editor.putString("onState", "Ujian Buah");
                        editor.putBoolean("isExam",true);
                        editor.putString("Judul","Ujian Soal");
                        editor.putString("Jumlah Soal","2");
                        editor.putString("Nomor Soal","1");
                        editor.putString("Soal",stringsoal);
                        editor.commit();
                        startActivity(mainIntent);
                    }
                });
                Button tombolujian3 = (Button) dialog.findViewById(R.id.tomboljumlahsoal3);
                tombolujian3.setText("3");
                tombolujian3.setOnClickListener(  new View.OnClickListener() {
                    public void onClick(View v) {
                        Random angka = new Random();
                        int soal = angka.nextInt(40);
                        String stringsoal = Integer.toString(soal);
                        Intent mainIntent;
                        SharedPreferences sp = getSharedPreferences(PREFS_NAME, 0);
                        mainIntent = new Intent(Buah.this,HewanTest.class);
                        SharedPreferences.Editor editor = sp.edit();
                        editor.putString("onState", "Ujian Buah");
                        editor.putBoolean("isExam",true);
                        editor.putString("Judul","Ujian Soal");
                        editor.putString("Jumlah Soal","3");
                        editor.putString("Nomor Soal","1");
                        editor.putString("Soal",stringsoal);
                        editor.commit();
                        startActivity(mainIntent);
                    }
                });
                Button tombolujian4 = (Button) dialog.findViewById(R.id.tomboljumlahsoal4);
                tombolujian4.setText("4");
                tombolujian4.setOnClickListener(  new View.OnClickListener() {
                    public void onClick(View v) {
                        Random angka = new Random();
                        int soal = angka.nextInt(40);
                        String stringsoal = Integer.toString(soal);
                        Intent mainIntent;
                        SharedPreferences sp = getSharedPreferences(PREFS_NAME, 0);
                        mainIntent = new Intent(Buah.this,HewanTest.class);
                        SharedPreferences.Editor editor = sp.edit();
                        editor.putString("onState", "Ujian Buah");
                        editor.putBoolean("isExam",true);
                        editor.putString("Judul","Ujian Soal");
                        editor.putString("Jumlah Soal","4");
                        editor.putString("Nomor Soal","1");
                        editor.putString("Soal",stringsoal);
                        editor.commit();
                        startActivity(mainIntent);
                    }
                });
                Button tombolujian5 = (Button) dialog.findViewById(R.id.tomboljumlahsoal5);
                tombolujian5.setText("5");
                tombolujian5.setOnClickListener(  new View.OnClickListener() {
                    public void onClick(View v) {
                        Random angka = new Random();
                        int soal = angka.nextInt(10);
                        String stringsoal = Integer.toString(soal);
                        Intent mainIntent;
                        SharedPreferences sp = getSharedPreferences(PREFS_NAME, 0);
                        mainIntent = new Intent(Buah.this,HewanTest.class);
                        SharedPreferences.Editor editor = sp.edit();
                        editor.putString("onState", "Ujian Buah");
                        editor.putBoolean("isExam",true);
                        editor.putString("Judul","Ujian Soal");
                        editor.putString("Jumlah Soal","5");
                        editor.putString("Nomor Soal","1");
                        editor.putString("Soal",stringsoal);
                        editor.commit();
                        startActivity(mainIntent);
                    }
                });
                Button tombolujian6 = (Button) dialog.findViewById(R.id.tomboljumlahsoal6);
                tombolujian6.setText("10");
                tombolujian6.setOnClickListener(  new View.OnClickListener() {
                    public void onClick(View v) {
                        Random angka = new Random();
                        int soal = angka.nextInt(10);
                        String stringsoal = Integer.toString(soal);
                        Intent mainIntent;
                        SharedPreferences sp = getSharedPreferences(PREFS_NAME, 0);
                        mainIntent = new Intent(Buah.this,HewanTest.class);
                        SharedPreferences.Editor editor = sp.edit();
                        editor.putString("onState", "Ujian Buah");
                        editor.putBoolean("isExam",true);
                        editor.putString("Judul","Ujian Soal");
                        editor.putString("Jumlah Soal","10");
                        editor.putString("Nomor Soal","1");
                        editor.putString("Soal",stringsoal);
                        editor.commit();
                        startActivity(mainIntent);
                    }
                });

                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok2);
                dialogButton.bringToFront();
                dialogButton.setOnClickListener( new View.OnClickListener(){
                    public void onClick(View v){
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
    }
}
