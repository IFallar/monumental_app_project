package com.example.monumentalfinalversion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import java.util.ArrayList;

public class Activity_GW_Music extends AppCompatActivity implements Interface_RV{

    ArrayList<Model_Music> musicModel = new ArrayList<>();
    MediaPlayer mediaPlayer = null;

    int[] musicFile = {R.raw.ode_to_joy, R.raw.song_for_the_morning_star, R.raw.seikilos_epitaph, R.raw.fifth_symphony, R.raw.silent_night, R.raw.moonlight_sonata, R.raw.overture, R.raw.magnum_mysterium, R.raw.salve_regina, R.raw.young_persons_guide_to_the_orchestra};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_gw_music);

        RecyclerView recyclerView = findViewById(R.id.rv_music);

        setMusicModel();

        Adapter_Music adapterMusic = new Adapter_Music(this, musicModel, this);
        recyclerView.setAdapter(adapterMusic);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setMusicModel(){
        String[] musicName = getResources().getStringArray(R.array.music_title);
        String[] MusicComposer = getResources().getStringArray(R.array.music_composer);
        String[] musicDetails = getResources().getStringArray(R.array.music_details);

        for (int i = 0; i < musicName.length; i++) {
            musicModel.add(new Model_Music(
                    musicName[i],
                    MusicComposer[i],
                    musicDetails[i],
                    musicFile[i]));
        }
    }

    @Override
    public void OnItemClick(int position) {
        Intent intent = new Intent(Activity_GW_Music.this, Activity_Music_Page.class);

        intent.putExtra("NAME", musicModel.get(position).getMusicName());
        intent.putExtra("QUOTE", musicModel.get(position).getMusicComposer());
        intent.putExtra("DESC", musicModel.get(position).getMusicDetails());
        intent.putExtra("FILE", musicModel.get(position).getMusicFile());

        startActivity(intent);

    }
}