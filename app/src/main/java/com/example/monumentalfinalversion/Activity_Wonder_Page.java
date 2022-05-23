package com.example.monumentalfinalversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity_Wonder_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_wonder_page);

        String name = getIntent().getStringExtra("NAME");
        String quote = getIntent().getStringExtra("QUOTE");
        String desc = getIntent().getStringExtra("DESC");
        int image = getIntent().getIntExtra("IMAGE", 0);

        TextView page_name = findViewById(R.id.page_wonder_title);
        TextView page_quote = findViewById(R.id.page_wonder_quote);
        TextView page_detail = findViewById(R.id.page_wonder_details);
        ImageView page_image = findViewById(R.id.page_wonder_img);

        page_name.setText(name);
        page_quote.setText(quote);
        page_detail.setText(desc);
        page_image.setImageResource(image);

    }
}