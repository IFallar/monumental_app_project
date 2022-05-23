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

public class Adapter_Art extends RecyclerView.Adapter<Adapter_Art.MyViewHolder>{

    private final Interface_RV interface_rv;

    Context context;
    ArrayList<Model_Art> artModel;

    public Adapter_Art(Context context, ArrayList<Model_Art> artModel, Interface_RV interface_rv){
        this.context = context;
        this.artModel = artModel;
        this.interface_rv = interface_rv;
    }

    @NonNull
    @Override
    public Adapter_Art.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.rv_art_row, parent, false);
        return new Adapter_Art.MyViewHolder(view, interface_rv);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_Art.MyViewHolder holder, int position) {
        holder.artName.setText(artModel.get(position).getArtName());
        holder.artist.setText(artModel.get(position).getArtist());
        holder.artActual.setImageResource(artModel.get(position).getArtImage());
    }

    @Override
    public int getItemCount() {
        return artModel.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView artName;
        TextView artist;
        ImageView artActual;


        public MyViewHolder(@NonNull View itemView, Interface_RV interface_rv) {
            super(itemView);

            artName = itemView.findViewById(R.id.rv_art_name);
            artist = itemView.findViewById(R.id.rv_art_maker);
            artActual = itemView.findViewById(R.id.rv_art_img);

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
