package com.example.monumentalfinalversion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

import java.util.ArrayList;

public class Activity_People extends AppCompatActivity implements Interface_RV{

    ArrayList<Model_People> peopleModel = new ArrayList<>();
    int[] peopleImage = {R.drawable.p_alexander, R.drawable.p_augustus, R.drawable.p_belisarius, R.drawable.p_catherine, R.drawable.p_charlemagne, R.drawable.p_cyrus, R.drawable.p_darius_i, R.drawable.p_edward_bp, R.drawable.p_eleanor, R.drawable.p_elizabeth_i, R.drawable.p_ferdinand_magellan, R.drawable.p_frederick_barbarossa, R.drawable.p_fritz, R.drawable.p_galileo, R.drawable.p_gustavus, R.drawable.p_horatio, R.drawable.p_ivan_t, R.drawable.p_joan_of_arc, R.drawable.p_justinian_i, R.drawable.p_leo_the_great, R.drawable.p_leonardo_da_vinci, R.drawable.p_leonidas, R.drawable.p_marco_polo, R.drawable.p_marcus_aurelius, R.drawable.p_mehmed_c, R.drawable.p_napoleon, R.drawable.p_oliver_cromwell, R.drawable.p_otto_von_bismarck, R.drawable.p_peter_the_great, R.drawable.p_richard_lionheart, R.drawable.p_robert_the_bruce, R.drawable.p_saladin, R.drawable.p_suleiman, R.drawable.p_tancred, R.drawable.p_theodora, R.drawable.p_trajan, R.drawable.p_vlad_dracula, R.drawable.p_william_wallace, R.drawable.p_zenobia};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_people);

        RecyclerView recyclerView = findViewById(R.id.rv_people);

        setPeopleModel();

        Adapter_People adapterPeople = new Adapter_People(this, peopleModel, this);
        recyclerView.setAdapter(adapterPeople);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
    }

    private void setPeopleModel(){
        String[] peopleName = getResources().getStringArray(R.array.people_name);
        String[] peopleQuote = getResources().getStringArray(R.array.people_title);
        String[] peopleDetails = getResources().getStringArray(R.array.people_details);

        for (int i = 0; i < peopleName.length; i++) {
            peopleModel.add(new Model_People(
                    peopleName[i],
                    peopleQuote[i],
                    peopleDetails[i],
                    peopleImage[i]));
        }
    }

    @Override
    public void OnItemClick(int position) {
        Intent intent = new Intent(Activity_People.this, Activity_People_Page.class);

        intent.putExtra("NAME", peopleModel.get(position).getPeopleName());
        intent.putExtra("QUOTE", peopleModel.get(position).getPeopleTitle());
        intent.putExtra("DESC", peopleModel.get(position).getPeopleDetails());
        intent.putExtra("IMAGE", peopleModel.get(position).getPeopleImage());

        startActivity(intent);
    }
}