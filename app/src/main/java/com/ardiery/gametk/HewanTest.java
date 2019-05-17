package com.ardiery.gametk;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class HewanTest extends AppCompatActivity {
    public static String[] warna = {"Ayam","Sapi","Badak","Lebah","Kucing","Ikan","Rusa","Macan","Lebah","Kucing"};
    public static int[] warnaGambar = {
            R.drawable.ayam,0
            R.drawable.sapi,
            R.drawable.badak,1
            R.drawable.lebah,
            R.drawable.kucing,
            R.drawable.ikan,
            R.drawable.rusa,
            R.drawable.macan,
            R.drawable.lebah,
            R.drawable.kucing
    };
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warna_test);
        SharedPreferences sp = getSharedPreferences("Storage", 0);

        int scoreString = sp.getInt("score",0);
        int nomorsoal =  Integer.parseInt(sp.getString("Nomor Soal","0"));
        final int jumlahSoal = Integer.parseInt(sp.getString("Jumlah Soal","1"));
        //int[] soal = new int[jumlahSoal];

        //int[] jawaban = new int[4];
        //Random angka = new Random();
        //for(int i = 0 ; i < 4 ; i++){
        //     int a = angka.nextInt(10);
        //    jawaban[i] = warnaGambar[a];
        //}
        final TextView Nomor = findViewById(R.id.Nomor);
        Nomor.setText(FormatNomor(nomorsoal,jumlahSoal));
        TextView score  = findViewById(R.id.score);
        String textScore = Integer.toString(scoreString);
        score.setText(textScore);
        final Button jawab1 = findViewById(R.id.jawab1);
        final Button jawab2 = findViewById(R.id.jawab2);
        final Button jawab3 = findViewById(R.id.jawab3);
        final Button jawab4 = findViewById(R.id.jawab4);
        final TextView textpertanyaan = findViewById(R.id.Pertanyaan);
        int soalsekarang =  Integer.parseInt(sp.getString("Soal","1"));
        if(soalsekarang == 1 ){
            jawab1.setBackgroundResource(warnaGambar[1]);
            jawab1.setText(warna[1]);
            jawab2.setBackgroundResource(warnaGambar[2]);
            jawab2.setText(warna[2]);
            jawab3.setBackgroundResource(warnaGambar[3]);
            jawab3.setText(warna[3]);
            jawab4.setBackgroundResource(warnaGambar[4]);
            jawab4.setText(warna[4]);
            textpertanyaan.setText(warna[1]);
        }else if(soalsekarang == 2){
            jawab1.setBackgroundResource(warnaGambar[2]);
            jawab1.setText(warna[2]);
            jawab2.setBackgroundResource(warnaGambar[3]);
            jawab2.setText(warna[3]);
            jawab3.setBackgroundResource(warnaGambar[4]);
            jawab3.setText(warna[4]);
            jawab4.setBackgroundResource(warnaGambar[5]);
            jawab4.setText(warna[5]);
            textpertanyaan.setText(warna[2]);
        }else if(soalsekarang == 3){
            jawab1.setBackgroundResource(warnaGambar[3]);
            jawab1.setText(warna[3]);
            jawab2.setBackgroundResource(warnaGambar[4]);
            jawab2.setText(warna[4]);
            jawab3.setBackgroundResource(warnaGambar[5]);
            jawab3.setText(warna[5]);
            jawab4.setBackgroundResource(warnaGambar[6]);
            jawab4.setText(warna[6]);
            textpertanyaan.setText(warna[3]);
        }else if(soalsekarang == 4){
            jawab1.setBackgroundResource(warnaGambar[4]);
            jawab1.setText(warna[4]);
            jawab2.setBackgroundResource(warnaGambar[5]);
            jawab2.setText(warna[5]);
            jawab3.setBackgroundResource(warnaGambar[6]);
            jawab3.setText(warna[6]);
            jawab4.setBackgroundResource(warnaGambar[7]);
            jawab4.setText(warna[7]);
            textpertanyaan.setText(warna[4]);
        }else if(soalsekarang == 5){
            jawab1.setBackgroundResource(warnaGambar[5]);
            jawab1.setText(warna[5]);
            jawab2.setBackgroundResource(warnaGambar[6]);
            jawab2.setText(warna[6]);
            jawab3.setBackgroundResource(warnaGambar[7]);
            jawab3.setText(warna[7]);
            jawab4.setBackgroundResource(warnaGambar[8]);
            jawab4.setText(warna[8]);
            textpertanyaan.setText(warna[5]);
        }else if(soalsekarang == 6){
            jawab1.setBackgroundResource(warnaGambar[6]);
            jawab1.setText(warna[6]);
            jawab2.setBackgroundResource(warnaGambar[7]);
            jawab2.setText(warna[7]);
            jawab3.setBackgroundResource(warnaGambar[8]);
            jawab3.setText(warna[8]);
            jawab4.setBackgroundResource(warnaGambar[9]);
            jawab4.setText(warna[9]);
            textpertanyaan.setText(warna[6]);
        }else if(soalsekarang == 7){
            jawab1.setBackgroundResource(warnaGambar[7]);
            jawab1.setText(warna[7]);
            jawab2.setBackgroundResource(warnaGambar[8]);
            jawab2.setText(warna[8]);
            jawab3.setBackgroundResource(warnaGambar[9]);
            jawab3.setText(warna[9]);
            jawab4.setBackgroundResource(warnaGambar[0]);
            jawab4.setText(warna[0]);
            textpertanyaan.setText(warna[7]);
        }else if(soalsekarang == 8){
            jawab1.setBackgroundResource(warnaGambar[8]);
            jawab1.setText(warna[8]);
            jawab2.setBackgroundResource(warnaGambar[9]);
            jawab2.setText(warna[9]);
            jawab3.setBackgroundResource(warnaGambar[0]);
            jawab3.setText(warna[0]);
            jawab4.setBackgroundResource(warnaGambar[1]);
            jawab4.setText(warna[1]);
            textpertanyaan.setText(warna[8]);
        }else if(soalsekarang == 9){
            jawab1.setBackgroundResource(warnaGambar[9]);
            jawab1.setText(warna[9]);
            jawab2.setBackgroundResource(warnaGambar[0]);
            jawab2.setText(warna[0]);
            jawab3.setBackgroundResource(warnaGambar[1]);
            jawab3.setText(warna[1]);
            jawab4.setBackgroundResource(warnaGambar[2]);
            jawab4.setText(warna[2]);
            textpertanyaan.setText(warna[9]);
        }else if(soalsekarang == 0){
            jawab1.setBackgroundResource(warnaGambar[0]);
            jawab1.setText(warna[0]);
            jawab2.setBackgroundResource(warnaGambar[1]);
            jawab2.setText(warna[1]);
            jawab3.setBackgroundResource(warnaGambar[2]);
            jawab3.setText(warna[2]);
            jawab4.setBackgroundResource(warnaGambar[3]);
            jawab4.setText(warna[3]);
            textpertanyaan.setText(warna[0]);
        }else if(soalsekarang == 10){
            jawab2.setBackgroundResource(warnaGambar[0]);
            jawab2.setText(warna[0]);
            jawab3.setBackgroundResource(warnaGambar[1]);
            jawab3.setText(warna[1]);
            jawab4.setBackgroundResource(warnaGambar[2]);
            jawab4.setText(warna[2]);
            jawab1.setBackgroundResource(warnaGambar[3]);
            jawab1.setText(warna[3]);
            textpertanyaan.setText(warna[0]);
        }else if(soalsekarang == 11){
            jawab3.setBackgroundResource(warnaGambar[0]);
            jawab3.setText(warna[0]);
            jawab4.setBackgroundResource(warnaGambar[1]);
            jawab4.setText(warna[1]);
            jawab1.setBackgroundResource(warnaGambar[2]);
            jawab1.setText(warna[2]);
            jawab2.setBackgroundResource(warnaGambar[3]);
            jawab2.setText(warna[3]);
            textpertanyaan.setText(warna[0]);
        }else if(soalsekarang == 12){
            jawab4.setBackgroundResource(warnaGambar[0]);
            jawab4.setText(warna[0]);
            jawab3.setBackgroundResource(warnaGambar[1]);
            jawab3.setText(warna[1]);
            jawab2.setBackgroundResource(warnaGambar[2]);
            jawab2.setText(warna[2]);
            jawab1.setBackgroundResource(warnaGambar[3]);
            jawab1.setText(warna[3]);
            textpertanyaan.setText(warna[0]);
        }else if(soalsekarang == 13 ){
            jawab2.setBackgroundResource(warnaGambar[1]);
            jawab2.setText(warna[1]);
            jawab3.setBackgroundResource(warnaGambar[2]);
            jawab3.setText(warna[2]);
            jawab4.setBackgroundResource(warnaGambar[3]);
            jawab4.setText(warna[3]);
            jawab1.setBackgroundResource(warnaGambar[4]);
            jawab1.setText(warna[4]);
            textpertanyaan.setText(warna[1]);
        }else if(soalsekarang == 14 ){
            jawab3.setBackgroundResource(warnaGambar[1]);
            jawab3.setText(warna[1]);
            jawab4.setBackgroundResource(warnaGambar[2]);
            jawab4.setText(warna[2]);
            jawab1.setBackgroundResource(warnaGambar[3]);
            jawab1.setText(warna[3]);
            jawab2.setBackgroundResource(warnaGambar[4]);
            jawab2.setText(warna[4]);
            textpertanyaan.setText(warna[1]);
        }else if(soalsekarang == 15 ){
            jawab4.setBackgroundResource(warnaGambar[1]);
            jawab4.setText(warna[1]);
            jawab1.setBackgroundResource(warnaGambar[2]);
            jawab1.setText(warna[2]);
            jawab2.setBackgroundResource(warnaGambar[3]);
            jawab2.setText(warna[3]);
            jawab3.setBackgroundResource(warnaGambar[4]);
            jawab3.setText(warna[4]);
            textpertanyaan.setText(warna[1]);
        }else if(soalsekarang == 16){
            jawab2.setBackgroundResource(warnaGambar[2]);
            jawab2.setText(warna[2]);
            jawab3.setBackgroundResource(warnaGambar[3]);
            jawab3.setText(warna[3]);
            jawab4.setBackgroundResource(warnaGambar[4]);
            jawab4.setText(warna[4]);
            jawab1.setBackgroundResource(warnaGambar[5]);
            jawab1.setText(warna[5]);
            textpertanyaan.setText(warna[2]);
        }else if(soalsekarang == 17){
            jawab3.setBackgroundResource(warnaGambar[2]);
            jawab3.setText(warna[2]);
            jawab4.setBackgroundResource(warnaGambar[3]);
            jawab4.setText(warna[3]);
            jawab1.setBackgroundResource(warnaGambar[4]);
            jawab1.setText(warna[4]);
            jawab2.setBackgroundResource(warnaGambar[5]);
            jawab2.setText(warna[5]);
            textpertanyaan.setText(warna[2]);
        }else if(soalsekarang == 18){
            jawab4.setBackgroundResource(warnaGambar[2]);
            jawab4.setText(warna[2]);
            jawab1.setBackgroundResource(warnaGambar[3]);
            jawab1.setText(warna[3]);
            jawab2.setBackgroundResource(warnaGambar[4]);
            jawab2.setText(warna[4]);
            jawab3.setBackgroundResource(warnaGambar[5]);
            jawab3.setText(warna[5]);
            textpertanyaan.setText(warna[2]);
        }else if(soalsekarang == 19){
            jawab2.setBackgroundResource(warnaGambar[3]);
            jawab2.setText(warna[3]);
            jawab3.setBackgroundResource(warnaGambar[4]);
            jawab3.setText(warna[4]);
            jawab4.setBackgroundResource(warnaGambar[5]);
            jawab4.setText(warna[5]);
            jawab1.setBackgroundResource(warnaGambar[6]);
            jawab1.setText(warna[6]);
            textpertanyaan.setText(warna[3]);
        }else if(soalsekarang == 20){
            jawab3.setBackgroundResource(warnaGambar[3]);
            jawab3.setText(warna[3]);
            jawab4.setBackgroundResource(warnaGambar[4]);
            jawab4.setText(warna[4]);
            jawab1.setBackgroundResource(warnaGambar[5]);
            jawab1.setText(warna[5]);
            jawab2.setBackgroundResource(warnaGambar[6]);
            jawab2.setText(warna[6]);
            textpertanyaan.setText(warna[3]);
        }else if(soalsekarang == 21){
            jawab4.setBackgroundResource(warnaGambar[3]);
            jawab4.setText(warna[3]);
            jawab1.setBackgroundResource(warnaGambar[4]);
            jawab1.setText(warna[4]);
            jawab2.setBackgroundResource(warnaGambar[5]);
            jawab2.setText(warna[5]);
            jawab3.setBackgroundResource(warnaGambar[6]);
            jawab3.setText(warna[6]);
            textpertanyaan.setText(warna[3]);
        }else if(soalsekarang == 22){
            jawab2.setBackgroundResource(warnaGambar[4]);
            jawab2.setText(warna[4]);
            jawab3.setBackgroundResource(warnaGambar[5]);
            jawab3.setText(warna[5]);
            jawab4.setBackgroundResource(warnaGambar[6]);
            jawab4.setText(warna[6]);
            jawab1.setBackgroundResource(warnaGambar[7]);
            jawab1.setText(warna[7]);
            textpertanyaan.setText(warna[4]);
        }else if(soalsekarang == 23){
            jawab3.setBackgroundResource(warnaGambar[4]);
            jawab3.setText(warna[4]);
            jawab4.setBackgroundResource(warnaGambar[5]);
            jawab4.setText(warna[5]);
            jawab1.setBackgroundResource(warnaGambar[6]);
            jawab1.setText(warna[6]);
            jawab2.setBackgroundResource(warnaGambar[7]);
            jawab2.setText(warna[7]);
            textpertanyaan.setText(warna[4]);
        }else if(soalsekarang == 24){
            jawab4.setBackgroundResource(warnaGambar[4]);
            jawab4.setText(warna[4]);
            jawab1.setBackgroundResource(warnaGambar[5]);
            jawab1.setText(warna[5]);
            jawab2.setBackgroundResource(warnaGambar[6]);
            jawab2.setText(warna[6]);
            jawab3.setBackgroundResource(warnaGambar[7]);
            jawab3.setText(warna[7]);
            textpertanyaan.setText(warna[4]);
        }else if(soalsekarang == 25){
            jawab2.setBackgroundResource(warnaGambar[4]);
            jawab2.setText(warna[4]);
            jawab3.setBackgroundResource(warnaGambar[5]);
            jawab3.setText(warna[5]);
            jawab4.setBackgroundResource(warnaGambar[6]);
            jawab4.setText(warna[6]);
            jawab1.setBackgroundResource(warnaGambar[7]);
            jawab1.setText(warna[7]);
            textpertanyaan.setText(warna[5]);
        }else if(soalsekarang == 26){
            jawab3.setBackgroundResource(warnaGambar[4]);
            jawab3.setText(warna[4]);
            jawab4.setBackgroundResource(warnaGambar[5]);
            jawab4.setText(warna[5]);
            jawab1.setBackgroundResource(warnaGambar[6]);
            jawab1.setText(warna[6]);
            jawab2.setBackgroundResource(warnaGambar[7]);
            jawab2.setText(warna[7]);
            textpertanyaan.setText(warna[5]);
        }else if(soalsekarang == 27){
            jawab4.setBackgroundResource(warnaGambar[4]);
            jawab4.setText(warna[4]);
            jawab1.setBackgroundResource(warnaGambar[5]);
            jawab1.setText(warna[5]);
            jawab2.setBackgroundResource(warnaGambar[6]);
            jawab2.setText(warna[6]);
            jawab3.setBackgroundResource(warnaGambar[7]);
            jawab3.setText(warna[7]);
            textpertanyaan.setText(warna[5]);
        }else if(soalsekarang == 28){
            jawab2.setBackgroundResource(warnaGambar[4]);
            jawab2.setText(warna[4]);
            jawab3.setBackgroundResource(warnaGambar[5]);
            jawab3.setText(warna[5]);
            jawab4.setBackgroundResource(warnaGambar[6]);
            jawab4.setText(warna[6]);
            jawab1.setBackgroundResource(warnaGambar[7]);
            jawab1.setText(warna[7]);
            textpertanyaan.setText(warna[6]);
        }else if(soalsekarang == 29){
            jawab3.setBackgroundResource(warnaGambar[4]);
            jawab3.setText(warna[4]);
            jawab4.setBackgroundResource(warnaGambar[5]);
            jawab4.setText(warna[5]);
            jawab1.setBackgroundResource(warnaGambar[6]);
            jawab1.setText(warna[6]);
            jawab2.setBackgroundResource(warnaGambar[7]);
            jawab2.setText(warna[7]);
            textpertanyaan.setText(warna[6]);
        }else if(soalsekarang == 30){
            jawab4.setBackgroundResource(warnaGambar[4]);
            jawab4.setText(warna[4]);
            jawab1.setBackgroundResource(warnaGambar[5]);
            jawab1.setText(warna[5]);
            jawab2.setBackgroundResource(warnaGambar[6]);
            jawab2.setText(warna[6]);
            jawab3.setBackgroundResource(warnaGambar[7]);
            jawab3.setText(warna[7]);
            textpertanyaan.setText(warna[6]);
        }else if(soalsekarang == 31){
            jawab2.setBackgroundResource(warnaGambar[7]);
            jawab2.setText(warna[7]);
            jawab3.setBackgroundResource(warnaGambar[8]);
            jawab3.setText(warna[8]);
            jawab4.setBackgroundResource(warnaGambar[9]);
            jawab4.setText(warna[9]);
            jawab1.setBackgroundResource(warnaGambar[0]);
            jawab1.setText(warna[0]);
            textpertanyaan.setText(warna[7]);
        }else if(soalsekarang == 32){
            jawab3.setBackgroundResource(warnaGambar[7]);
            jawab3.setText(warna[7]);
            jawab4.setBackgroundResource(warnaGambar[8]);
            jawab4.setText(warna[8]);
            jawab1.setBackgroundResource(warnaGambar[9]);
            jawab1.setText(warna[9]);
            jawab2.setBackgroundResource(warnaGambar[0]);
            jawab2.setText(warna[0]);
            textpertanyaan.setText(warna[7]);
        }else if(soalsekarang == 33){
            jawab4.setBackgroundResource(warnaGambar[7]);
            jawab4.setText(warna[7]);
            jawab1.setBackgroundResource(warnaGambar[8]);
            jawab1.setText(warna[8]);
            jawab2.setBackgroundResource(warnaGambar[9]);
            jawab2.setText(warna[9]);
            jawab3.setBackgroundResource(warnaGambar[0]);
            jawab3.setText(warna[0]);
            textpertanyaan.setText(warna[7]);
        }else if(soalsekarang == 34){
            jawab2.setBackgroundResource(warnaGambar[8]);
            jawab2.setText(warna[8]);
            jawab3.setBackgroundResource(warnaGambar[9]);
            jawab3.setText(warna[9]);
            jawab4.setBackgroundResource(warnaGambar[0]);
            jawab4.setText(warna[0]);
            jawab1.setBackgroundResource(warnaGambar[1]);
            jawab1.setText(warna[1]);
            textpertanyaan.setText(warna[8]);
        }else if(soalsekarang == 35){
            jawab3.setBackgroundResource(warnaGambar[8]);
            jawab3.setText(warna[8]);
            jawab4.setBackgroundResource(warnaGambar[9]);
            jawab4.setText(warna[9]);
            jawab1.setBackgroundResource(warnaGambar[0]);
            jawab1.setText(warna[0]);
            jawab2.setBackgroundResource(warnaGambar[1]);
            jawab2.setText(warna[1]);
            textpertanyaan.setText(warna[8]);
        }else if(soalsekarang == 36){
            jawab4.setBackgroundResource(warnaGambar[8]);
            jawab4.setText(warna[8]);
            jawab1.setBackgroundResource(warnaGambar[9]);
            jawab1.setText(warna[9]);
            jawab2.setBackgroundResource(warnaGambar[0]);
            jawab2.setText(warna[0]);
            jawab3.setBackgroundResource(warnaGambar[1]);
            jawab3.setText(warna[1]);
            textpertanyaan.setText(warna[8]);
        }else if(soalsekarang == 37){
            jawab2.setBackgroundResource(warnaGambar[9]);
            jawab2.setText(warna[9]);
            jawab3.setBackgroundResource(warnaGambar[0]);
            jawab3.setText(warna[0]);
            jawab4.setBackgroundResource(warnaGambar[1]);
            jawab4.setText(warna[1]);
            jawab1.setBackgroundResource(warnaGambar[2]);
            jawab1.setText(warna[2]);
            textpertanyaan.setText(warna[9]);
        }else if(soalsekarang == 38){
            jawab3.setBackgroundResource(warnaGambar[9]);
            jawab3.setText(warna[9]);
            jawab4.setBackgroundResource(warnaGambar[0]);
            jawab4.setText(warna[0]);
            jawab1.setBackgroundResource(warnaGambar[1]);
            jawab1.setText(warna[1]);
            jawab2.setBackgroundResource(warnaGambar[2]);
            jawab2.setText(warna[2]);
            textpertanyaan.setText(warna[9]);
        }else if(soalsekarang == 39){
            jawab4.setBackgroundResource(warnaGambar[9]);
            jawab4.setText(warna[9]);
            jawab1.setBackgroundResource(warnaGambar[0]);
            jawab1.setText(warna[0]);
            jawab2.setBackgroundResource(warnaGambar[1]);
            jawab2.setText(warna[1]);
            jawab3.setBackgroundResource(warnaGambar[2]);
            jawab3.setText(warna[2]);
            textpertanyaan.setText(warna[9]);
        }
        else if(soalsekarang == 40){
            jawab1.setBackgroundResource(warnaGambar[9]);
            jawab1.setText(warna[9]);
            jawab2.setBackgroundResource(warnaGambar[0]);
            jawab2.setText(warna[0]);
            jawab3.setBackgroundResource(warnaGambar[1]);
            jawab3.setText(warna[1]);
            jawab4.setBackgroundResource(warnaGambar[3]);
            jawab4.setText(warna[3]);
            textpertanyaan.setText(warna[3]);
        }
        jawab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String soal = (String) String.valueOf(textpertanyaan.getText());
                String jawaban = (String) String.valueOf(jawab1.getText());
                SharedPreferences sp = getSharedPreferences("Storage", 0);
                int jumlah_soal = Integer.parseInt(sp.getString("Jumlah Soal","0"));
                int nomor_soal = Integer.parseInt(sp.getString("Nomor Soal","0"));

                if(soal.equals(jawaban)){
                    SharedPreferences.Editor editor = sp.edit();
                    int scoresementara = sp.getInt("score",0);
                    int pertambahanscore;

                    if (jumlah_soal == 1 ){
                        pertambahanscore = 100;
                    }else if (jumlah_soal == 2 ){
                        pertambahanscore = 50;
                    }else if (jumlah_soal == 3 ){
                        pertambahanscore = 33;
                    }else if (jumlah_soal == 4 ){
                        pertambahanscore = 25;
                    }else if (jumlah_soal == 5 ){
                        pertambahanscore = 20;
                    }else{
                        pertambahanscore = 10;
                    }

                    int jumlahscore = scoresementara + pertambahanscore;
                    if(jumlahscore == 99 ){
                        jumlahscore = 100;
                    }
                    editor.putInt("score", jumlahscore);
                    editor.putString("Judul", "Hasil Test Warna");
                    editor.apply();
                    if(nomor_soal == jumlah_soal ){
                        Intent mainIntent;
                        mainIntent = new Intent(HewanTest.this,HasilTest.class);
                        startActivity(mainIntent);
                        finish();
                    }else{
                        SharedPreferences.Editor storageedit = sp.edit();
                        Random angka = new Random();
                        //for(int i = 0 ; i < 4 ; i++){
                        int a = angka.nextInt(40);
                        //    jawaban[i] = warnaGambar[a];
                        String Soalbaru = Integer.toString(a);
                        storageedit.putString("Soal",Soalbaru);
                        String nomorselanjutnaya = Integer.toString(nomor_soal+1);
                        storageedit.putString("Nomor Soal", nomorselanjutnaya);
                        storageedit.apply();
                        Intent mainIntent;
                        mainIntent = new Intent(HewanTest.this,HewanTest.class);
                        startActivity(mainIntent);
                        finish();
                    }
                }else{
                    if(nomor_soal == jumlah_soal ){
                        Intent mainIntent;
                        mainIntent = new Intent(HewanTest.this,HasilTest.class);
                        startActivity(mainIntent);
                        finish();
                    }else{
                        SharedPreferences.Editor storageedit = sp.edit();
                        Random angka = new Random();
                        int a = angka.nextInt(40);
                        String Soalbaru = Integer.toString(a);
                        storageedit.putString("Soal",Soalbaru);
                        String nomorselanjutnya = Integer.toString(nomor_soal+1);
                        storageedit.putString("Nomor Soal", nomorselanjutnya);
                        Intent mainIntent;
                        mainIntent = new Intent(HewanTest.this,HewanTest.class);
                        startActivity(mainIntent);
                        finish();
                        storageedit.apply();
                    }
                }
            }
        });
        jawab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String soal = (String) String.valueOf(textpertanyaan.getText());
                String jawaban = (String) String.valueOf(jawab4.getText());
                SharedPreferences sp = getSharedPreferences("Storage", 0);
                int jumlah_soal = Integer.parseInt(sp.getString("Jumlah Soal","0"));
                int nomor_soal = Integer.parseInt(sp.getString("Nomor Soal","0"));

                if(soal.equals(jawaban)){
                    SharedPreferences.Editor editor = sp.edit();
                    int scoresementara = sp.getInt("score",0);
                    int pertambahanscore;

                    if (jumlah_soal == 1 ){
                        pertambahanscore = 100;
                    }else if (jumlah_soal == 2 ){
                        pertambahanscore = 50;
                    }else if (jumlah_soal == 3 ){
                        pertambahanscore = 33;
                    }else if (jumlah_soal == 4 ){
                        pertambahanscore = 25;
                    }else if (jumlah_soal == 5 ){
                        pertambahanscore = 20;
                    }else{
                        pertambahanscore = 10;
                    }

                    int jumlahscore = scoresementara + pertambahanscore;
                    if(jumlahscore == 99 ){
                        jumlahscore = 100;
                    }
                    editor.putInt("score", jumlahscore);
                    editor.putString("Judul", "Hasil Test Warna");
                    editor.apply();
                    if(nomor_soal == jumlah_soal ){
                        Intent mainIntent;
                        mainIntent = new Intent( HewanTest.this,HasilTest.class);
                        startActivity(mainIntent);
                        finish();
                    }else{
                        SharedPreferences.Editor storageedit = sp.edit();
                        Random angka = new Random();
                        //for(int i = 0 ; i < 4 ; i++){
                        int a = angka.nextInt(40);
                        //    jawaban[i] = warnaGambar[a];
                        String Soalbaru = Integer.toString(a);
                        storageedit.putString("Soal",Soalbaru);
                        String nomorselanjutnaya = Integer.toString(nomor_soal+1);
                        storageedit.putString("Nomor Soal", nomorselanjutnaya);
                        storageedit.apply();
                        Intent mainIntent;
                        mainIntent = new Intent(HewanTest.this,HewanTest.class);
                        startActivity(mainIntent);
                        finish();
                    }
                }else{
                    if(nomor_soal == jumlah_soal ){
                        Intent mainIntent;
                        mainIntent = new Intent(HewanTest.this,HasilTest.class);
                        startActivity(mainIntent);
                        finish();
                    }else{
                        SharedPreferences.Editor storageedit = sp.edit();
                        Random angka = new Random();
                        int a = angka.nextInt(40);
                        String Soalbaru = Integer.toString(a);
                        storageedit.putString("Soal",Soalbaru);
                        String nomorselanjutnya = Integer.toString(nomor_soal+1);
                        storageedit.putString("Nomor Soal", nomorselanjutnya);
                        Intent mainIntent;
                        mainIntent = new Intent(HewanTest.this,HewanTest.class);
                        startActivity(mainIntent);
                        finish();
                        storageedit.apply();
                    }
                }
            }
        });
        jawab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String soal = (String) String.valueOf(textpertanyaan.getText());
                String jawaban = (String) String.valueOf(jawab3.getText());
                SharedPreferences sp = getSharedPreferences("Storage", 0);
                int jumlah_soal = Integer.parseInt(sp.getString("Jumlah Soal","0"));
                int nomor_soal = Integer.parseInt(sp.getString("Nomor Soal","0"));

                if(soal.equals(jawaban)){
                    SharedPreferences.Editor editor = sp.edit();
                    int scoresementara = sp.getInt("score",0);
                    int pertambahanscore;

                    if (jumlah_soal == 1 ){
                        pertambahanscore = 100;
                    }else if (jumlah_soal == 2 ){
                        pertambahanscore = 50;
                    }else if (jumlah_soal == 3 ){
                        pertambahanscore = 33;
                    }else if (jumlah_soal == 4 ){
                        pertambahanscore = 25;
                    }else if (jumlah_soal == 5 ){
                        pertambahanscore = 20;
                    }else{
                        pertambahanscore = 10;
                    }

                    int jumlahscore = scoresementara + pertambahanscore;
                    if(jumlahscore == 99 ){
                        jumlahscore = 100;
                    }
                    editor.putInt("score", jumlahscore);
                    editor.putString("Judul", "Hasil Test Warna");
                    editor.apply();
                    if(nomor_soal == jumlah_soal ){
                        Intent mainIntent;
                        mainIntent = new Intent(HewanTest.this,HasilTest.class);
                        startActivity(mainIntent);
                        finish();
                    }else{
                        SharedPreferences.Editor storageedit = sp.edit();
                        Random angka = new Random();
                        //for(int i = 0 ; i < 4 ; i++){
                        int a = angka.nextInt(40);
                        //    jawaban[i] = warnaGambar[a];
                        String Soalbaru = Integer.toString(a);
                        storageedit.putString("Soal",Soalbaru);
                        String nomorselanjutnaya = Integer.toString(nomor_soal+1);
                        storageedit.putString("Nomor Soal", nomorselanjutnaya);
                        storageedit.apply();
                        Intent mainIntent;
                        mainIntent = new Intent(HewanTest.this,HewanTest.class);
                        startActivity(mainIntent);
                        finish();
                    }
                }else{
                    if(nomor_soal == jumlah_soal ){
                        Intent mainIntent;
                        mainIntent = new Intent(HewanTest.this,HasilTest.class);
                        startActivity(mainIntent);
                        finish();
                    }else{
                        SharedPreferences.Editor storageedit = sp.edit();
                        Random angka = new Random();
                        int a = angka.nextInt(40);
                        String Soalbaru = Integer.toString(a);
                        storageedit.putString("Soal",Soalbaru);
                        String nomorselanjutnya = Integer.toString(nomor_soal+1);
                        storageedit.putString("Nomor Soal", nomorselanjutnya);
                        Intent mainIntent;
                        mainIntent = new Intent(HewanTest.this,HewanTest.class);
                        startActivity(mainIntent);
                        finish();
                        storageedit.apply();
                    }
                }
            }
        });
        jawab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String soal = (String) String.valueOf(textpertanyaan.getText());
                String jawaban = (String) String.valueOf(jawab2.getText());
                SharedPreferences sp = getSharedPreferences("Storage", 0);
                int jumlah_soal = Integer.parseInt(sp.getString("Jumlah Soal","0"));
                int nomor_soal = Integer.parseInt(sp.getString("Nomor Soal","0"));

                if(soal.equals(jawaban)){
                    SharedPreferences.Editor editor = sp.edit();
                    int scoresementara = sp.getInt("score",0);
                    int pertambahanscore;

                    if (jumlah_soal == 1 ){
                        pertambahanscore = 100;
                    }else if (jumlah_soal == 2 ){
                        pertambahanscore = 50;
                    }else if (jumlah_soal == 3 ){
                        pertambahanscore = 33;
                    }else if (jumlah_soal == 4 ){
                        pertambahanscore = 25;
                    }else if (jumlah_soal == 5 ){
                        pertambahanscore = 20;
                    }else{
                        pertambahanscore = 10;
                    }

                    int jumlahscore = scoresementara + pertambahanscore;
                    if(jumlahscore == 99 ){
                        jumlahscore = 100;
                    }
                    editor.putInt("score", jumlahscore);
                    editor.putString("Judul", "Hasil Test Warna");
                    editor.apply();
                    if(nomor_soal == jumlah_soal ){
                        Intent mainIntent;
                        mainIntent = new Intent(HewanTest.this,HasilTest.class);
                        startActivity(mainIntent);
                        finish();
                    }else{
                        SharedPreferences.Editor storageedit = sp.edit();
                        Random angka = new Random();
                        //for(int i = 0 ; i < 4 ; i++){
                        int a = angka.nextInt(40);
                        //    jawaban[i] = warnaGambar[a];
                        String Soalbaru = Integer.toString(a);
                        storageedit.putString("Soal",Soalbaru);
                        String nomorselanjutnaya = Integer.toString(nomor_soal+1);
                        storageedit.putString("Nomor Soal", nomorselanjutnaya);
                        storageedit.apply();
                        Intent mainIntent;
                        mainIntent = new Intent(HewanTest.this,HewanTest.class);
                        startActivity(mainIntent);
                        finish();
                    }
                }else{
                    if(nomor_soal == jumlah_soal ){
                        Intent mainIntent;
                        mainIntent = new Intent(HewanTest.this,HasilTest.class);
                        startActivity(mainIntent);
                        finish();
                    }else{
                        SharedPreferences.Editor storageedit = sp.edit();
                        Random angka = new Random();
                        int a = angka.nextInt(40);
                        String Soalbaru = Integer.toString(a);
                        storageedit.putString("Soal",Soalbaru);
                        String nomorselanjutnya = Integer.toString(nomor_soal+1);
                        storageedit.putString("Nomor Soal", nomorselanjutnya);
                        Intent mainIntent;
                        mainIntent = new Intent(HewanTest.this,HewanTest.class);
                        startActivity(mainIntent);
                        finish();
                        storageedit.apply();
                    }
                }
            }
        });
    }

    private String FormatNomor(int nomorsoal, int jumlahSoal) {
        String string;
        String nomorsoalstring = Integer.toString(nomorsoal);
        String jumlahsoalstring = Integer.toString(jumlahSoal);
        string = nomorsoalstring + " / " + jumlahsoalstring;
        return string;
    }
    public static String ToString(CharSequence a){
        return String.valueOf(a);
    }
    public static String ToString(int a){
        return Integer.toString(a);
    }
    public static String ToString(float a){
        return String.valueOf(a);
    }
}