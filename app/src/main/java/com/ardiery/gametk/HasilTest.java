package com.ardiery.gametk;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class HasilTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_test);
        Button button = findViewById(R.id.back);
        TextView textscore = findViewById(R.id.score);
        ImageView emote = findViewById(R.id.emote);
        SharedPreferences sp = getSharedPreferences("Storage",0);
        int score = sp.getInt("score",0);
        String scorestr = Integer.toString(score);
        textscore.setText(scorestr);
        TextView motivasi = findViewById(R.id.motivasi);
        String textMotivasi ;
        if(score > 70) {
            if(score > 90 ){
                textMotivasi = "Waw Kamu Luar Biasa";
            }else if (score >80 ){
                textMotivasi = "Kamu Hebat";
            }else{
                textMotivasi = "Kamu Pintar";
            }
            emote.setImageResource(R.drawable.emote1);
        }else if(score > 40){
            if(score >60 ){
                textMotivasi = "Mantap";
            }else if (score > 50 ){
                textMotivasi = "Bagus";
            }else{
                textMotivasi = "Berlajar Lebih Giat Lagi";
            }
            emote.setImageResource(R.drawable.emote1);
        }else if(score >0 ){

            if(score > 30 ){
                textMotivasi = "Saya Harus Belajar Lagi";
            }else if (score >20 ){
                textMotivasi = "Belajar yang rajin ya";
            }else{
                textMotivasi = "";
            }
            emote.setImageResource(R.drawable.emote2);
        }else{
            textMotivasi = "";
            emote.setImageResource(R.drawable.emote3);
        }
        motivasi.setText(textMotivasi);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent;
                SharedPreferences sp = getSharedPreferences("Storage", 0);
                mainIntent = new Intent(HasilTest.this,main.class);
                SharedPreferences.Editor editor = sp.edit();
                editor.putInt("score", 0);
                editor.putBoolean("isEzam", false);
                editor.apply();
                startActivity(mainIntent);
                finish();
            }
        });
    }
}
