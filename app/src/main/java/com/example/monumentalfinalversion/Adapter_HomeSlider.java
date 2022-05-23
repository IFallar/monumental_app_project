package com.example.monumentalfinalversion;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.android.material.slider.Slider;
import com.smarteist.autoimageslider.SliderViewAdapter;

public class Adapter_HomeSlider extends SliderViewAdapter<Adapter_HomeSlider.Holder> {

    int[] images;

    public Adapter_HomeSlider(int[] images){

        this.images = images;

    }

    @Override
    public Adapter_HomeSlider.Holder onCreateViewHolder(ViewGroup parent) {

        View view  = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.home_slider_item, parent, false);


        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Adapter_HomeSlider.Holder viewHolder, int position) {

        viewHolder.imageView.setImageResource((images[position]));

    }

    @Override
    public int getCount() {
        return images.length;
    }

    public class Holder extends SliderViewAdapter.ViewHolder{

        ImageView imageView;

        public Holder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.slider_item_actual);
        }

    }

}
