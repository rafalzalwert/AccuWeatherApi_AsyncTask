package com.example.zalwe.restapiasynctask;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TemperatureAdapter extends ArrayAdapter<Temperature> {
    public TemperatureAdapter(@NonNull Context context, ArrayList<Temperature> weatherArrayList) {
        super(context, 0, weatherArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Temperature weather = getItem(position);

        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TextView dateTextView = convertView.findViewById(R.id.tvDate);
        TextView minTextView = convertView.findViewById(R.id.tvLowTemperature);
        TextView maxTextView = convertView.findViewById(R.id.tvHighTemperature);
        TextView linkTextView = convertView.findViewById(R.id.tvLink);

        dateTextView.setText(weather.getDate());
        minTextView.setText(weather.getMinTemperature());
        maxTextView.setText(weather.getMaxTemperature());
        linkTextView.setText(weather.getLink());

        return convertView;

    }
}