package com.codepath.loginapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class stream extends AppCompatActivity {
    ListView listView;

    String[] DRINKS = {"Nya~Tea"};
    String[] DESCRIPTIONS = {"Milk Tea Bubble Tea"};
    int[] IMAGES = {R.drawable.kittycafe};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stream);
//
//        MyListAdapter adapter = new MyListAdapter(this, DRINKS, DESCRIPTIONS, IMAGES);
//        list = (ListView) findViewById(R.id.listItem);
//        list.setAdapter(adapter);
//
//
////

    }
}
