package com.example.monumentalfinalversion;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter_People extends RecyclerView.Adapter<Adapter_People.MyViewHolder> {

    private final Interface_RV interface_rv;

    Context context;
    ArrayList<Model_People> modelPeople;

    public Adapter_People(Context context, ArrayList<Model_People> modelPeople, Interface_RV interface_rv){
        this.context = context;
        this.modelPeople = modelPeople;
        this.interface_rv = interface_rv;
    }

    @NonNull
    @Override
    public Adapter_People.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.rv_people_row, parent, false);
        return new  Adapter_People.MyViewHolder(view, interface_rv);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_People.MyViewHolder holder, int position) {

        holder.people_item_name.setText(modelPeople.get(position).getPeopleName());
        holder.people_item_img.setImageResource(modelPeople.get(position).getPeopleImage());

    }

    @Override
    public int getItemCount() {
        return modelPeople.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView people_item_img;
        TextView people_item_name;


        public MyViewHolder(@NonNull View itemView, Interface_RV interface_rv) {
            super(itemView);

            people_item_img = itemView.findViewById(R.id.rv_people_item_img);
            people_item_name = itemView.findViewById(R.id.rv_people_item_name);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (interface_rv != null){
                        int pos = getAdapterPosition();

                        if (pos != RecyclerView.NO_POSITION){
                            interface_rv.OnItemClick(pos);
                        }
                    }
                }
            });

        }
    }

}
