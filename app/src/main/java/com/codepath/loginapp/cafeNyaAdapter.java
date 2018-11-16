package com.codepath.loginapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.codepath.loginapp.models.cafeNya;

import java.util.List;

public class cafeNyaAdapter extends ArrayAdapter<cafeNya> {
    private List<cafeNya> cafeNyaList;
    private Context context;

    public cafeNyaAdapter(Context context, int resource, List <cafeNya> cafeNyaList) {
        super(context, resource, cafeNyaList);
        this.cafeNyaList = cafeNyaList;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.customlayout, null);
        }
        cafeNya cafeNya = cafeNyaList.get(position);
        TextView drinks = convertView.findViewById(R.id.textView_drink);
        TextView desc = convertView.findViewById((R.id.textView_desc));
        drinks.setText(cafeNya.getDRINKS());
        desc.setText(cafeNya.getDESC());
        return convertView;
    }
}
