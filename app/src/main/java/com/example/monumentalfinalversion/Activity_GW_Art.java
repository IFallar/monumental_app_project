package com.example.monumentalfinalversion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Activity_GW_Art extends AppCompatActivity implements Interface_RV{

    ArrayList<Model_Art> artModel = new ArrayList<>();

    int[] artImg = {R.drawable.art_01, R.drawable.art_02, R.drawable.art_03, R.drawable.art_04,
                    R.drawable.art_05, R.drawable.art_06, R.drawable.art_07, R.drawable.art_08,
                    R.drawable.art_09, R.drawable.art_10, R.drawable.art_11, R.drawable.art_12,
                    R.drawable.art_13, R.drawable.art_14, R.drawable.art_15, R.drawable.art_16};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gw_art);
        RecyclerView recyclerView = findViewById(R.id.rv_art);

        setArtModel();

        Adapter_Art adapterArt = new Adapter_Art(this, artModel, this);
        recyclerView.setAdapter(adapterArt);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setArtModel(){
        String[] artName = getResources().getStringArray(R.array.art_name);
        String[] artist = getResources().getStringArray(R.array.artist);

        for (int i = 0; i < artName.length; i++) {
            artModel.add(new Model_Art(
                    artName[i],
                    artist[i],
                    artImg[i]));
        }
    }

    @Override
    public void OnItemClick(int position) {

    }
}