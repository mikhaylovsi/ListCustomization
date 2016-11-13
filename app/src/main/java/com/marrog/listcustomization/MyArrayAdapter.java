package com.marrog.listcustomization;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Сергей on 13.11.2016.
 */

public class MyArrayAdapter extends ArrayAdapter<String> {

    private final Context context;
    private final String[] values;

    public MyArrayAdapter(Context context, int resource, String[] values) {
        super(context, resource, values);
        this.values = values;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View rowView;

        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.list_activity, parent, false);
        }else{
            rowView = convertView;
        }

        TextView textView = (TextView)rowView.findViewById(R.id.label);
        ImageView imageView = (ImageView)rowView.findViewById(R.id.icon);
        textView.setText(values[position]);

        imageView.setImageResource(R.mipmap.ic_accessibility_black_24dp);

        return rowView;
    }
}
