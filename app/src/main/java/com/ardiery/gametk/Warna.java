package com.ardiery.gametk;

import android.app.Dialog;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Map;

public class Warna extends AppCompatActivity {
    public static final String PREFS_NAME = "Storage";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warna);
        SharedPreferences sp = getSharedPreferences(PREFS_NAME, 0);
        Map data = sp.getAll();
        Button merah  = (Button) findViewById(R.id.tombolmerah);
        merah.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v ){
                final Dialog dialog = new Dialog(Warna.this);
                dialog.setContentView(R.layout.layout_custom);
                dialog.setTitle("Merah");
                TextView text = (TextView) dialog.findViewById(R.id.tv_desc);
                text.setText("Merah");
                ImageView image = (ImageView) dialog.findViewById(R.id.tv_icon);
                image.setMinimumWidth(100);
                image.setMinimumHeight(100);
                image.setImageResource(R.color.merah);
                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);
                dialogButton.setOnClickListener( new View.OnClickListener(){
                    public void onClick(View v){
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        Button pink  = (Button) findViewById(R.id.tombolpink);
        pink.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v ){
                final Dialog dialog = new Dialog(Warna.this);
                dialog.setContentView(R.layout.layout_custom);
                dialog.setTitle("Pink");
                TextView text = (TextView) dialog.findViewById(R.id.tv_desc);
                text.setText("Pink");
                ImageView image = (ImageView) dialog.findViewById(R.id.tv_icon);
                image.setImageResource(R.color.pink);
                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);
                dialogButton.setOnClickListener( new View.OnClickListener(){
                    public void onClick(View v){
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        Button jingga  = (Button) findViewById(R.id.tomboljingga);
        jingga.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v ){
                final Dialog dialog = new Dialog(Warna.this);
                dialog.setContentView(R.layout.layout_custom);
                dialog.setTitle("Jingga");
                TextView text = (TextView) dialog.findViewById(R.id.tv_desc);
                text.setText("Jingga");
                ImageView image = (ImageView) dialog.findViewById(R.id.tv_icon);
                image.setImageResource(R.color.jingga);
                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);
                dialogButton.setOnClickListener( new View.OnClickListener(){
                    public void onClick(View v){
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        Button kuning  = (Button) findViewById(R.id.tombolkuning);
        kuning.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v ){
                final Dialog dialog = new Dialog(Warna.this);
                dialog.setContentView(R.layout.layout_custom);
                dialog.setTitle("Kuning");
                TextView text = (TextView) dialog.findViewById(R.id.tv_desc);
                text.setText("Kuning");
                ImageView image = (ImageView) dialog.findViewById(R.id.tv_icon);
                image.setImageResource(R.color.kuning);
                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);
                dialogButton.setOnClickListener( new View.OnClickListener(){
                    public void onClick(View v){
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        Button hijau  = (Button) findViewById(R.id.tombolhijau);
        hijau.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v ){
                final Dialog dialog = new Dialog(Warna.this);
                dialog.setContentView(R.layout.layout_custom);
                dialog.setTitle("Hijau");
                TextView text = (TextView) dialog.findViewById(R.id.tv_desc);
                text.setText("Hijau");
                ImageView image = (ImageView) dialog.findViewById(R.id.tv_icon);
                image.setImageResource(R.color.hijau);
                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);
                dialogButton.setOnClickListener( new View.OnClickListener(){
                    public void onClick(View v){
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        Button biru  = (Button) findViewById(R.id.tombolbiru);
        biru.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v ){
                final Dialog dialog = new Dialog(Warna.this);
                dialog.setContentView(R.layout.layout_custom);
                dialog.setTitle("Biru");
                TextView text = (TextView) dialog.findViewById(R.id.tv_desc);
                text.setText("Biru");
                ImageView image = (ImageView) dialog.findViewById(R.id.tv_icon);
                image.setImageResource(R.color.biru);
                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);
                dialogButton.setOnClickListener( new View.OnClickListener(){
                    public void onClick(View v){
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        Button ungu  = (Button) findViewById(R.id.tombolungu);
        ungu.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v ){
                final Dialog dialog = new Dialog(Warna.this);
                dialog.setContentView(R.layout.layout_custom);
                dialog.setTitle("Pink");
                TextView text = (TextView) dialog.findViewById(R.id.tv_desc);
                text.setText("Pink");
                ImageView image = (ImageView) dialog.findViewById(R.id.tv_icon);
                image.setImageResource(R.color.ungu);
                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);
                dialogButton.setOnClickListener( new View.OnClickListener(){
                    public void onClick(View v){
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        Button putih  = (Button) findViewById(R.id.tombolputih);
        putih.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v ){
                final Dialog dialog = new Dialog(Warna.this);
                dialog.setContentView(R.layout.layout_custom);
                dialog.setTitle("Putih");
                TextView text = (TextView) dialog.findViewById(R.id.tv_desc);
                text.setText("Putih");
                ImageView image = (ImageView) dialog.findViewById(R.id.tv_icon);
                image.setImageResource(R.color.putih);
                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);
                dialogButton.setOnClickListener( new View.OnClickListener(){
                    public void onClick(View v){
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        Button abuabu  = (Button) findViewById(R.id.tombolabu_abu);
        abuabu.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v ){
                final Dialog dialog = new Dialog(Warna.this);
                dialog.setContentView(R.layout.layout_custom);
                dialog.setTitle("Abu - abu");
                TextView text = (TextView) dialog.findViewById(R.id.tv_desc);
                text.setText("Abu - abu");
                ImageView image = (ImageView) dialog.findViewById(R.id.tv_icon);
                image.setImageResource(R.color.abu_abu);
                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);
                dialogButton.setOnClickListener( new View.OnClickListener(){
                    public void onClick(View v){
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        Button hitam  = (Button) findViewById(R.id.tombolhitam);
        hitam.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v ){
                final Dialog dialog = new Dialog(Warna.this);
                dialog.setContentView(R.layout.layout_custom);
                dialog.setTitle("Hitam");
                TextView text = (TextView) dialog.findViewById(R.id.tv_desc);
                text.setText("Hitam");
                ImageView image = (ImageView) dialog.findViewById(R.id.tv_icon);
                image.setImageResource(R.color.hitam);
                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);
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
