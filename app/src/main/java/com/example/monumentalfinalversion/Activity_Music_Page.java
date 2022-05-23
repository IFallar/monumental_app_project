package com.example.monumentalfinalversion;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity_Music_Page extends AppCompatActivity {

    MediaPlayer mediaPlayer = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_music_page);

        this.setFinishOnTouchOutside(false);

        String name = getIntent().getStringExtra("NAME");
        String title = getIntent().getStringExtra("QUOTE");
        String desc = getIntent().getStringExtra("DESC");
        int file = getIntent().getIntExtra("FILE", 0);

        TextView page_name = findViewById(R.id.page_music_title);
        TextView page_title = findViewById(R.id.page_music_composer);


        page_name.setText(name);
        page_title.setText(title);

        mediaPlayer = MediaPlayer.create(Activity_Music_Page.this, file);
        mediaPlayer.start();

        ImageButton play = findViewById(R.id.btn_music_play);
        ImageButton pause = findViewById(R.id.btn_music_pause);
        ImageButton stop = findViewById(R.id.btn_music_stop);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer = MediaPlayer.create(Activity_Music_Page.this, file);
                mediaPlayer.start();
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.pause();
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.stop();
            }
        });

    }



}