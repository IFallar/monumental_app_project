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

public class Adapter_Wonders extends RecyclerView.Adapter<Adapter_Wonders.MyViewHolder> {

    private final Interface_RV interface_rv;

    Context context;
    ArrayList<Model_Wonders> wondersModel;

    public Adapter_Wonders(Context context, ArrayList<Model_Wonders> wondersModel, Interface_RV interface_rv){
        this.context = context;
        this.wondersModel = wondersModel;
        this.interface_rv = interface_rv;
    }

    @NonNull
    @Override
    public Adapter_Wonders.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.rv_wonders_row, parent, false);
        return new  Adapter_Wonders.MyViewHolder(view, interface_rv);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_Wonders.MyViewHolder holder, int position) {

        holder.wonder_item_label.setText(wondersModel.get(position).getWondersName());
        holder.wonder_item_img.setImageResource(wondersModel.get(position).getWondersImage());

    }

    @Override
    public int getItemCount() {
        return wondersModel.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView wonder_item_img;
        TextView wonder_item_label;


        public MyViewHolder(@NonNull View itemView, Interface_RV interface_rv) {
            super(itemView);

            wonder_item_img = itemView.findViewById(R.id.rv_wonder_item_img);
            wonder_item_label = itemView.findViewById(R.id.rv_wonder_item_label);

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
