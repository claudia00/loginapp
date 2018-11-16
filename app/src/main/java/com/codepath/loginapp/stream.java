package com.codepath.loginapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.codepath.loginapp.models.cafeNya;

import java.util.ArrayList;
import java.util.List;

public class stream extends AppCompatActivity {
//    String[] DRINKS = {"Nya~Tea"};
//    String[] DESCRIPTIONS = {"Milk Tea Bubble Tea"};
//    int[] IMAGES = {R.drawable.kittycafe};
    private ListView listView;
    private List<cafeNya> cafeNyaList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stream);

//        MyListAdapter adapter = new MyListAdapter(this, DRINKS, DESCRIPTIONS, IMAGES);
//        list = (ListView) findViewById(R.id.listItem);
//        list.setAdapter(adapter);

        cafeNyaList = new ArrayList<>();

        getGenericdata();

        cafeNyaAdapter cafeNyaAdapter = new cafeNyaAdapter(this, R.layout.customlayout, cafeNyaList);
        listView =(ListView) findViewById(R.id.listItem);
        listView.setAdapter(cafeNyaAdapter);
    }
    private void getGenericdata(){
        cafeNyaList.add(new cafeNya("Nya~Tea", "Classic bubbleTea"));
        cafeNyaList.add(new cafeNya("Taro", "The purple bubbleTea"));
        cafeNyaList.add(new cafeNya("Red Bean", "The savory bubbleTea"));
        cafeNyaList.add(new cafeNya("Green Tea", "The healthy boost bubbleTea"));
        cafeNyaList.add(new cafeNya("Passion Fruit", "The tropical bubbleTea"));
        cafeNyaList.add(new cafeNya("Lychee", "The pretty sweet but too sweet flavor"));
        cafeNyaList.add(new cafeNya("Coffee", "This will keep you up all night drink"));
        cafeNyaList.add(new cafeNya("Honeydew", "The honey to your bubbleTea"));



    }
}
