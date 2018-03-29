package com.example.chendw.myapplication.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.chendw.myapplication.R;
import com.example.chendw.myapplication.dto.Fruit;

import java.util.List;

/**
 * Created by chendw on 2018/3/29.
 */

public class FruitAdapter extends ArrayAdapter<Fruit> {

    private int resourceId;

    public FruitAdapter(@NonNull Context context, int resource, @NonNull List<Fruit> objects) {
        super(context, resource, objects);
        this.resourceId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Fruit fruit = getItem(position);

        View view;
        ViewHolder viewHolder;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.fruiteImage = view.findViewById(R.id.fruitImage);
            viewHolder.fruiteName = view.findViewById(R.id.fruitText);
            view.setTag(viewHolder);
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.fruiteImage.setImageResource(fruit.getImageId());
        viewHolder.fruiteName.setText(fruit.getName());
        return view;
    }
}

class ViewHolder {
    ImageView fruiteImage;
    TextView fruiteName;
}
