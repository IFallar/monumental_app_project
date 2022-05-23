package com.example.monumentalfinalversion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class Activity_Art extends AppCompatActivity {

    Button art, music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_art);

        art = findViewById(R.id.btn_art);
        music = findViewById(R.id.btn_music);

        art.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_Art.this, Activity_GW_Art.class);
                Activity_Art.this.startActivity(intent);
            }
        });

        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Activity_Art.this, Activity_GW_Music.class);
                Activity_Art.this.startActivity(intent);

            }
        });

    }
}