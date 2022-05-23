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

public class Adapter_Music extends RecyclerView.Adapter<Adapter_Music.MyViewHolder>{

    private final Interface_RV interface_rv;

    Context context;
    ArrayList<Model_Music> musicModel;



    public Adapter_Music(Context context, ArrayList<Model_Music> musicModel, Interface_RV interface_rv){
        this.context = context;
        this.musicModel = musicModel;
        this.interface_rv = interface_rv;
    }

    @NonNull
    @Override
    public Adapter_Music.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.rv_music_row, parent, false);
        return new  Adapter_Music.MyViewHolder(view, interface_rv);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_Music.MyViewHolder holder, int position) {
        holder.music_title.setText(musicModel.get(position).getMusicName());
        holder.music_composer.setText(musicModel.get(position).getMusicComposer());
    }

    @Override
    public int getItemCount() {
        return musicModel.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView music_title;
        TextView music_composer;


        public MyViewHolder(@NonNull View itemView, Interface_RV interface_rv) {
            super(itemView);

            music_title = itemView.findViewById(R.id.rv_music_title);
            music_composer = itemView.findViewById(R.id.rv_music_composer);

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
