package com.ardiery.gametk;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;

public class Hewan extends AppCompatActivity {
    public static final String PREFS_NAME = "Storage";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hewan);
        SharedPreferences sp = getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = sp.edit();
        editor.putInt("score", 0);
        editor.putBoolean("isEzam", false);
        editor.putString("onState", "list hewan");
        editor.putString("Judul","Hewan");
        editor.commit();
        final String judul = sp.getString("Judul","Warna");
        final String texttombolujian1 = sp.getString("TombolUjian1","1");
        final String texttombolujian2 = sp.getString("TombolUjian2","2");
        final String texttombolujian3 = sp.getString("TombolUjian3","3");
        final String texttombolujian4 = sp.getString("TombolUjian4","4");
        final String texttombolujian5 = sp.getString("TombolUjian5","5");
        final String texttombolujian6 = sp.getString("TombolUjian6","10");
        Button sapi  = (Button) findViewById(R.id.tombolsapi);
        sapi.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v ){
                final Dialog dialog = new Dialog(Hewan.this);
                dialog.setContentView(R.layout.layout_custom);
                dialog.setTitle("Sapi");
                TextView text = (TextView) dialog.findViewById(R.id.tv_desc);
                text.setText("Sapi");
                ImageView image = (ImageView) dialog.findViewById(R.id.tv_icon);
                image.setMinimumWidth(100);
                image.setMinimumHeight(120);
                image.setImageResource(R.drawable.sapi);
                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);
                dialogButton.setOnClickListener( new View.OnClickListener(){
                    public void onClick(View v){
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        Button ayam  = (Button) findViewById(R.id.tombolayam);
        ayam.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v ){
                final Dialog dialog = new Dialog(Hewan.this);
                dialog.setContentView(R.layout.layout_custom);
                dialog.setTitle("Ayam");
                TextView text = (TextView) dialog.findViewById(R.id.tv_desc);
                text.setText("Ayam");
                ImageView image = (ImageView) dialog.findViewById(R.id.tv_icon);
                image.setMinimumWidth(100);
                image.setMinimumHeight(120);
                image.setImageResource(R.drawable.ayam);
                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);
                dialogButton.setOnClickListener( new View.OnClickListener(){
                    public void onClick(View v){
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        Button badak  = (Button) findViewById(R.id.tombolbadak);
        badak.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v ){
                final Dialog dialog = new Dialog(Hewan.this);
                dialog.setContentView(R.layout.layout_custom);
                dialog.setTitle("Badak");
                TextView text = (TextView) dialog.findViewById(R.id.tv_desc);
                text.setText("Badak");
                ImageView image = (ImageView) dialog.findViewById(R.id.tv_icon);
                image.setMinimumWidth(100);
                image.setMinimumHeight(120);
                image.setImageResource(R.drawable.badak);
                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);
                dialogButton.setOnClickListener( new View.OnClickListener(){
                    public void onClick(View v){
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        Button ikan  = (Button) findViewById(R.id.tombolikan);
        ikan.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v ){
                final Dialog dialog = new Dialog(Hewan.this);
                dialog.setContentView(R.layout.layout_custom);
                dialog.setTitle("Ikan");
                TextView text = (TextView) dialog.findViewById(R.id.tv_desc);
                text.setText("Ikan");
                ImageView image = (ImageView) dialog.findViewById(R.id.tv_icon);
                image.setMinimumWidth(100);
                image.setMinimumHeight(120);
                image.setImageResource(R.drawable.ikan);
                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);
                dialogButton.setOnClickListener( new View.OnClickListener(){
                    public void onClick(View v){
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        Button kucing  = (Button) findViewById(R.id.tombolkucing);
        kucing.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v ){
                final Dialog dialog = new Dialog(Hewan.this);
                dialog.setContentView(R.layout.layout_custom);
                dialog.setTitle("Kucing");
                TextView text = (TextView) dialog.findViewById(R.id.tv_desc);
                text.setText("Kucing");
                ImageView image = (ImageView) dialog.findViewById(R.id.tv_icon);
                image.setMinimumWidth(100);
                image.setMinimumHeight(120);
                image.setImageResource(R.drawable.kucing);
                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);
                dialogButton.setOnClickListener( new View.OnClickListener(){
                    public void onClick(View v){
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        Button macan  = (Button) findViewById(R.id.tombolmacan);
        macan.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v ){
                final Dialog dialog = new Dialog(Hewan.this);
                dialog.setContentView(R.layout.layout_custom);
                dialog.setTitle("Macan");
                TextView text = (TextView) dialog.findViewById(R.id.tv_desc);
                text.setText("Macan");
                ImageView image = (ImageView) dialog.findViewById(R.id.tv_icon);
                image.setMinimumWidth(100);
                image.setMinimumHeight(120);
                image.setImageResource(R.drawable.macan);
                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);
                dialogButton.setOnClickListener( new View.OnClickListener(){
                    public void onClick(View v){
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        Button lebah  = (Button) findViewById(R.id.tombollebah);
        lebah.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v ){
                final Dialog dialog = new Dialog(Hewan.this);
                dialog.setContentView(R.layout.layout_custom);
                dialog.setTitle("Lebah");
                TextView text = (TextView) dialog.findViewById(R.id.tv_desc);
                text.setText("Lebah");
                ImageView image = (ImageView) dialog.findViewById(R.id.tv_icon);
                image.setMinimumWidth(100);
                image.setMinimumHeight(120);
                image.setImageResource(R.drawable.lebah);
                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);
                dialogButton.setOnClickListener( new View.OnClickListener(){
                    public void onClick(View v){
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        Button rusa  = (Button) findViewById(R.id.tombolrusa);
        rusa.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v ){
                final Dialog dialog = new Dialog(Hewan.this);
                dialog.setContentView(R.layout.layout_custom);
                dialog.setTitle("Rusa");
                TextView text = (TextView) dialog.findViewById(R.id.tv_desc);
                text.setText("Rusa");
                ImageView image = (ImageView) dialog.findViewById(R.id.tv_icon);
                image.setMinimumWidth(100);
                image.setMinimumHeight(120);
                image.setImageResource(R.drawable.rusa);
                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);
                dialogButton.setOnClickListener( new View.OnClickListener(){
                    public void onClick(View v){
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        Button testhewan  = (Button) findViewById(R.id.tomboltesthewan);
        testhewan.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v ){
                final Dialog dialog = new Dialog(Hewan.this);
                dialog.setContentView(R.layout.activity_ujian);
                ImageView headersoal = dialog.findViewById(R.id.headersoal);
                headersoal.setImageResource(R.drawable.headerbinatang);
                dialog.setTitle("Berapa Soal ?");
                Button tombolujian1 = (Button) dialog.findViewById(R.id.tomboljumlahsoal1);
                tombolujian1.setText("1");
                tombolujian1.setOnClickListener(  new View.OnClickListener() {
                    public void onClick(View v) {
                        Random angka = new Random();
                        int soal = angka.nextInt(10);
                        String stringsoal = Integer.toString(soal);
                        Intent mainIntent;
                        SharedPreferences sp = getSharedPreferences(PREFS_NAME, 0);
                        mainIntent = new Intent(Hewan.this,HewanTest.class);
                        SharedPreferences.Editor editor = sp.edit();
                        editor.putString("onState", "Ujian Hewan");
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
                        int soal = angka.nextInt(10);
                        String stringsoal = Integer.toString(soal);
                        Intent mainIntent;
                        SharedPreferences sp = getSharedPreferences(PREFS_NAME, 0);
                        mainIntent = new Intent(Hewan.this,HewanTest.class);
                        SharedPreferences.Editor editor = sp.edit();
                        editor.putString("onState", "Ujian Hewan");
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
                        int soal = angka.nextInt(10);
                        String stringsoal = Integer.toString(soal);
                        Intent mainIntent;
                        SharedPreferences sp = getSharedPreferences(PREFS_NAME, 0);
                        mainIntent = new Intent(Hewan.this,HewanTest.class);
                        SharedPreferences.Editor editor = sp.edit();
                        editor.putString("onState", "Ujian Hewan");
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
                        int soal = angka.nextInt(10);
                        String stringsoal = Integer.toString(soal);
                        Intent mainIntent;
                        SharedPreferences sp = getSharedPreferences(PREFS_NAME, 0);
                        mainIntent = new Intent(Hewan.this,HewanTest.class);
                        SharedPreferences.Editor editor = sp.edit();
                        editor.putString("onState", "Ujian Hewan");
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
                        mainIntent = new Intent(Hewan.this,HewanTest.class);
                        SharedPreferences.Editor editor = sp.edit();
                        editor.putString("onState", "Ujian Hewan");
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
                        mainIntent = new Intent(Hewan.this,HewanTest.class);
                        SharedPreferences.Editor editor = sp.edit();
                        editor.putString("onState", "Ujian Hewan");
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
