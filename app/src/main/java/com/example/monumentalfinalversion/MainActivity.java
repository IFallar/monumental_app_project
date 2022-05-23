package com.example.monumentalfinalversion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;

import com.smarteist.autoimageslider.SliderView;

public class MainActivity extends AppCompatActivity {

    SliderView sliderView;
    int slider_images[] = {R.drawable.g_wonder_01, R.drawable.g_wonder_06, R.drawable.g_wonder_11, R.drawable.g_wonder_15, R.drawable.g_wonder_16, R.drawable.g_wonder_20};

    ImageButton wonders_btn, art_btn, people_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        sliderView = findViewById(R.id.home_slider);

        Adapter_HomeSlider adapter_homeSlider = new Adapter_HomeSlider(slider_images);

        sliderView.setSliderAdapter(adapter_homeSlider);
        sliderView.startAutoCycle();

        //BUTTONS

        wonders_btn = findViewById(R.id.img_btn_wonders);
        art_btn = findViewById(R.id.img_btn_art);
        people_btn = findViewById(R.id.img_btn_people);

        wonders_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity_Wonders.class);
                MainActivity.this.startActivity(intent);
            }
        });

        art_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity_Art.class);
                MainActivity.this.startActivity(intent);
            }
        });

        people_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity_People.class);
                MainActivity.this.startActivity(intent);
            }
        });

    }
}