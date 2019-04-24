package com.ardiery.gametk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = findViewById(R.id.mulai);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent mainIntent;
                mainIntent = new Intent(MainActivity.this,main.class);
                startActivity(mainIntent);
            }
        });
    }
}
