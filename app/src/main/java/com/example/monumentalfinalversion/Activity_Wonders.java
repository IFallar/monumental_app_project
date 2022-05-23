package com.example.monumentalfinalversion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

import java.util.ArrayList;

public class Activity_Wonders extends AppCompatActivity implements Interface_RV{

    ArrayList<Model_Wonders> wondersModel = new ArrayList<>();
    int[] wondersImage = {R.drawable.wonder_01, R.drawable.wonder_02, R.drawable.wonder_03, R.drawable.wonder_04, R.drawable.wonder_05, R.drawable.wonder_06, R.drawable.wonder_07, R.drawable.wonder_08, R.drawable.wonder_09, R.drawable.wonder_10, R.drawable.wonder_11, R.drawable.wonder_12, R.drawable.wonder_13, R.drawable.wonder_14, R.drawable.wonder_15, R.drawable.wonder_16, R.drawable.wonder_17, R.drawable.wonder_18, R.drawable.wonder_19, R.drawable.wonder_20, R.drawable.wonder_21, R.drawable.wonder_22, R.drawable.wonder_23, R.drawable.wonder_24, R.drawable.wonder_25, R.drawable.wonder_26, R.drawable.wonder_27, R.drawable.wonder_28, R.drawable.wonder_29, R.drawable.wonder_30, R.drawable.wonder_31, R.drawable.wonder_32, R.drawable.wonder_33, R.drawable.wonder_34};

    int[] wondersImageGradiented = {R.drawable.g_wonder_01, R.drawable.g_wonder_02, R.drawable.g_wonder_03, R.drawable.g_wonder_04, R.drawable.g_wonder_05, R.drawable.g_wonder_06, R.drawable.g_wonder_07, R.drawable.g_wonder_08, R.drawable.g_wonder_09, R.drawable.g_wonder_10, R.drawable.g_wonder_11, R.drawable.g_wonder_12, R.drawable.g_wonder_13, R.drawable.g_wonder_14, R.drawable.g_wonder_15, R.drawable.g_wonder_16, R.drawable.g_wonder_17, R.drawable.g_wonder_18, R.drawable.g_wonder_19, R.drawable.g_wonder_20, R.drawable.g_wonder_21, R.drawable.g_wonder_22, R.drawable.g_wonder_23, R.drawable.g_wonder_24, R.drawable.g_wonder_25, R.drawable.g_wonder_26, R.drawable.g_wonder_27, R.drawable.g_wonder_28, R.drawable.g_wonder_29, R.drawable.g_wonder_30, R.drawable.g_wonder_31, R.drawable.g_wonder_32, R.drawable.g_wonder_33, R.drawable.g_wonder_34};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_wonders);

        RecyclerView recyclerView = findViewById(R.id.rv_wonders);

        setWondersModel();

        Adapter_Wonders adapterWonders = new Adapter_Wonders(this, wondersModel, this);
        recyclerView.setAdapter(adapterWonders);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    //SETTING UP THE MODEL

    private void setWondersModel(){
        String[] wondersName = getResources().getStringArray(R.array.world_wonders);
        String[] wondersQuote = getResources().getStringArray(R.array.world_wonders_quote);
        String[] wondersDetails = getResources().getStringArray(R.array.world_wonders_desc);

        for (int i = 0; i < wondersName.length; i++) {
            wondersModel.add(new Model_Wonders(
                    wondersName[i],
                    wondersQuote[i],
                    wondersDetails[i],
                    wondersImage[i],
                    wondersImageGradiented[i]));
        }
    }

    @Override
    public void OnItemClick(int position) {
        Intent intent = new Intent(Activity_Wonders.this, Activity_Wonder_Page.class);

        intent.putExtra("NAME", wondersModel.get(position).getWondersName());
        intent.putExtra("QUOTE", wondersModel.get(position).getWondersQuote());
        intent.putExtra("DESC", wondersModel.get(position).getWondersDetails());
        intent.putExtra("IMAGE", wondersModel.get(position).getWondersImageGradient());

        startActivity(intent);
    }

}