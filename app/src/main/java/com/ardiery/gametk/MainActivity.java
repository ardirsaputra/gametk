package com.ardiery.gametk;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Map;

public class MainActivity extends AppCompatActivity {
    public static final String PREFS_NAME = "Storage";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = findViewById(R.id.mulai);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent mainIntent;
                SharedPreferences sp = getSharedPreferences(PREFS_NAME, 0);
                mainIntent = new Intent(MainActivity.this,main.class);
                SharedPreferences.Editor editor = sp.edit();
                editor.putInt("score", 0);
                editor.putBoolean("isEzam", false);
                startActivity(mainIntent);
            }
        });
    }
}
