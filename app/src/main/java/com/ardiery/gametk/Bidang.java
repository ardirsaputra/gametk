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

public class Bidang extends AppCompatActivity {
    public static final String PREFS_NAME = "Storage";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bidang);
        SharedPreferences sp = getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = sp.edit();
        editor.putInt("score", 0);
        editor.putBoolean("isEzam", false);
        editor.putString("onState", "list bidang");
        editor.putString("Judul","Bidang");
        editor.commit();
        final String judul = sp.getString("Judul","Bidang");
        final String texttombolujian1 = sp.getString("TombolUjian1","1");
        final String texttombolujian2 = sp.getString("TombolUjian2","2");
        final String texttombolujian3 = sp.getString("TombolUjian3","3");
        final String texttombolujian4 = sp.getString("TombolUjian4","4");
        final String texttombolujian5 = sp.getString("TombolUjian5","5");
        final String texttombolujian6 = sp.getString("TombolUjian6","10");
        Button persegipanjang  = (Button) findViewById(R.id.tombolpersegipanjang);
        persegipanjang.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v ){
                final Dialog dialog = new Dialog(Bidang.this);
                dialog.setContentView(R.layout.layout_custom);
                dialog.setTitle("Persegi Panjang");
                TextView text = (TextView) dialog.findViewById(R.id.tv_desc);
                text.setText("Persegi Panjang");
                ImageView image = (ImageView) dialog.findViewById(R.id.tv_icon);
                image.setMinimumWidth(100);
                image.setMinimumHeight(120);
                image.setImageResource(R.drawable.persegipanjang);
                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);
                dialogButton.setOnClickListener( new View.OnClickListener(){
                    public void onClick(View v){
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        Button persegi  = (Button) findViewById(R.id.tombolpersegi);
        persegi.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v ){
                final Dialog dialog = new Dialog(Bidang.this);
                dialog.setContentView(R.layout.layout_custom);
                dialog.setTitle("Persegi");
                TextView text = (TextView) dialog.findViewById(R.id.tv_desc);
                text.setText("Persegi");
                ImageView image = (ImageView) dialog.findViewById(R.id.tv_icon);
                image.setMinimumWidth(100);
                image.setMinimumHeight(120);
                image.setImageResource(R.drawable.persegi);
                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);
                dialogButton.setOnClickListener( new View.OnClickListener(){
                    public void onClick(View v){
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        Button segitiga  = (Button) findViewById(R.id.tombolsegitiga);
        segitiga.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v ){
                final Dialog dialog = new Dialog(Bidang.this);
                dialog.setContentView(R.layout.layout_custom);
                dialog.setTitle("Segitiga");
                TextView text = (TextView) dialog.findViewById(R.id.tv_desc);
                text.setText("Segitiga");
                ImageView image = (ImageView) dialog.findViewById(R.id.tv_icon);
                image.setMinimumWidth(100);
                image.setMinimumHeight(120);
                image.setImageResource(R.drawable.segitiga);
                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);
                dialogButton.setOnClickListener( new View.OnClickListener(){
                    public void onClick(View v){
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        Button segilima  = (Button) findViewById(R.id.tombolsegilima);
        segilima.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v ){
                final Dialog dialog = new Dialog(Bidang.this);
                dialog.setContentView(R.layout.layout_custom);
                dialog.setTitle("Segilima");
                TextView text = (TextView) dialog.findViewById(R.id.tv_desc);
                text.setText("Segilima");
                ImageView image = (ImageView) dialog.findViewById(R.id.tv_icon);
                image.setMinimumWidth(100);
                image.setMinimumHeight(120);
                image.setImageResource(R.drawable.segilima);
                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);
                dialogButton.setOnClickListener( new View.OnClickListener(){
                    public void onClick(View v){
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        Button segienam  = (Button) findViewById(R.id.tombolsegienam);
        segienam.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v ){
                final Dialog dialog = new Dialog(Bidang.this);
                dialog.setContentView(R.layout.layout_custom);
                dialog.setTitle("Segienam");
                TextView text = (TextView) dialog.findViewById(R.id.tv_desc);
                text.setText("Segienam");
                ImageView image = (ImageView) dialog.findViewById(R.id.tv_icon);
                image.setMinimumWidth(100);
                image.setMinimumHeight(120);
                image.setImageResource(R.drawable.segienam);
                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);
                dialogButton.setOnClickListener( new View.OnClickListener(){
                    public void onClick(View v){
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        Button layanglayang  = (Button) findViewById(R.id.tombollayanglayang);
        layanglayang.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v ){
                final Dialog dialog = new Dialog(Bidang.this);
                dialog.setContentView(R.layout.layout_custom);
                dialog.setTitle("Layang -Layang");
                TextView text = (TextView) dialog.findViewById(R.id.tv_desc);
                text.setText("Layang - Layang");
                ImageView image = (ImageView) dialog.findViewById(R.id.tv_icon);
                image.setMinimumWidth(100);
                image.setMinimumHeight(120);
                image.setImageResource(R.drawable.layanglayang);
                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);
                dialogButton.setOnClickListener( new View.OnClickListener(){
                    public void onClick(View v){
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        Button ketupat  = (Button) findViewById(R.id.tombolketupat);
        ketupat.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v ){
                final Dialog dialog = new Dialog(Bidang.this);
                dialog.setContentView(R.layout.layout_custom);
                dialog.setTitle("Ketupat");
                TextView text = (TextView) dialog.findViewById(R.id.tv_desc);
                text.setText("Ketupat");
                ImageView image = (ImageView) dialog.findViewById(R.id.tv_icon);
                image.setMinimumWidth(100);
                image.setMinimumHeight(120);
                image.setImageResource(R.drawable.ketupat);
                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);
                dialogButton.setOnClickListener( new View.OnClickListener(){
                    public void onClick(View v){
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        Button lingkaran  = (Button) findViewById(R.id.tombollingkaran);
        lingkaran.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v ){
                final Dialog dialog = new Dialog(Bidang.this);
                dialog.setContentView(R.layout.layout_custom);
                dialog.setTitle("Lingkaran");
                TextView text = (TextView) dialog.findViewById(R.id.tv_desc);
                text.setText("Lingkaran");
                ImageView image = (ImageView) dialog.findViewById(R.id.tv_icon);
                image.setMinimumWidth(120);
                image.setMinimumHeight(120);
                image.setImageResource(R.drawable.lingkaran);
                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);
                dialogButton.setOnClickListener( new View.OnClickListener(){
                    public void onClick(View v){
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        Button lonjong  = (Button) findViewById(R.id.tombollonjong);
        lonjong.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v ){
                final Dialog dialog = new Dialog(Bidang.this);
                dialog.setContentView(R.layout.layout_custom);
                dialog.setTitle("Lonjong");
                TextView text = (TextView) dialog.findViewById(R.id.tv_desc);
                text.setText("Lonjong");
                ImageView image = (ImageView) dialog.findViewById(R.id.tv_icon);
                image.setMinimumWidth(120);
                image.setMinimumHeight(120);
                image.setImageResource(R.drawable.lonjong);
                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);
                dialogButton.setOnClickListener( new View.OnClickListener(){
                    public void onClick(View v){
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        Button trapesium  = (Button) findViewById(R.id.tomboltrapesium);
        trapesium.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v ){
                final Dialog dialog = new Dialog(Bidang.this);
                dialog.setContentView(R.layout.layout_custom);
                dialog.setTitle("Trapesium");
                TextView text = (TextView) dialog.findViewById(R.id.tv_desc);
                text.setText("Trapesium");
                ImageView image = (ImageView) dialog.findViewById(R.id.tv_icon);
                image.setMinimumWidth(120);
                image.setMinimumHeight(120);
                image.setImageResource(R.drawable.trapesium);
                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);
                dialogButton.setOnClickListener( new View.OnClickListener(){
                    public void onClick(View v){
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        Button testBidang= (Button) findViewById(R.id.tomboltestbidang);
        testBidang.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v ){
                final Dialog dialog = new Dialog(Bidang.this);
                dialog.setContentView(R.layout.activity_ujian);
                ImageView headersoal = dialog.findViewById(R.id.headersoal);
                headersoal.setImageResource(R.drawable.headerbentukbenda);
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
                        mainIntent = new Intent(Bidang.this,BidangTest.class);
                        SharedPreferences.Editor editor = sp.edit();
                        editor.putString("onState", "Ujian Bidang");
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
                        mainIntent = new Intent(Bidang.this,BidangTest.class);
                        SharedPreferences.Editor editor = sp.edit();
                        editor.putString("onState", "Ujian Bidang");
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
                        mainIntent = new Intent(Bidang.this,BidangTest.class);
                        SharedPreferences.Editor editor = sp.edit();
                        editor.putString("onState", "Ujian Biidang");
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
                tombolujian4.setText("5");
                tombolujian4.setOnClickListener(  new View.OnClickListener() {
                    public void onClick(View v) {
                        Random angka = new Random();
                        int soal = angka.nextInt(40);
                        String stringsoal = Integer.toString(soal);
                        Intent mainIntent;
                        SharedPreferences sp = getSharedPreferences(PREFS_NAME, 0);
                        mainIntent = new Intent(Bidang.this,BidangTest.class);
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
                Button tombolujian5 = (Button) dialog.findViewById(R.id.tomboljumlahsoal5);
                tombolujian5.setText("10");
                tombolujian5.setOnClickListener(  new View.OnClickListener() {
                    public void onClick(View v) {
                        Random angka = new Random();
                        int soal = angka.nextInt(40);
                        String stringsoal = Integer.toString(soal);
                        Intent mainIntent;
                        SharedPreferences sp = getSharedPreferences(PREFS_NAME, 0);
                        mainIntent = new Intent(Bidang.this,BidangTest.class);
                        SharedPreferences.Editor editor = sp.edit();
                        editor.putString("onState", "Ujian Bidang");
                        editor.putBoolean("isExam",true);
                        editor.putString("Judul","Ujian Soal");
                        editor.putString("Jumlah Soal","10");
                        editor.putString("Nomor Soal","1");
                        editor.putString("Soal",stringsoal);
                        editor.commit();
                        startActivity(mainIntent);
                    }
                });
                Button tombolujian6 = (Button) dialog.findViewById(R.id.tomboljumlahsoal6);
                tombolujian6.setText("20");
                tombolujian6.setOnClickListener(  new View.OnClickListener() {
                    public void onClick(View v) {
                        Random angka = new Random();
                        int soal = angka.nextInt(40);
                        String stringsoal = Integer.toString(soal);
                        Intent mainIntent;
                        SharedPreferences sp = getSharedPreferences(PREFS_NAME, 0);
                        mainIntent = new Intent(Bidang.this,BidangTest.class);
                        SharedPreferences.Editor editor = sp.edit();
                        editor.putString("onState", "Ujian Bidang");
                        editor.putBoolean("isExam",true);
                        editor.putString("Judul","Ujian Soal");
                        editor.putString("Jumlah Soal","20");
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
