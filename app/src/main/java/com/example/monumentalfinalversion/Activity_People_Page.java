package com.example.monumentalfinalversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity_People_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_people_page);

        String name = getIntent().getStringExtra("NAME");
        String title = getIntent().getStringExtra("QUOTE");
        String desc = getIntent().getStringExtra("DESC");
        int image = getIntent().getIntExtra("IMAGE", 0);

        TextView page_name = findViewById(R.id.page_people_name);
        TextView page_title = findViewById(R.id.page_people_title);
        TextView page_detail = findViewById(R.id.page_people_details);
        ImageView page_image = findViewById(R.id.page_people_image);

        page_name.setText(name);
        page_title.setText(title);
        page_detail.setText(desc);
        page_image.setImageResource(image);
    }
}