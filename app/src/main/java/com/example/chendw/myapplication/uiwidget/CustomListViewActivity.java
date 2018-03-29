package com.example.chendw.myapplication.uiwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.example.chendw.myapplication.R;
import com.example.chendw.myapplication.adapter.FruitAdapter;
import com.example.chendw.myapplication.dto.Fruit;

import java.util.ArrayList;
import java.util.List;

public class CustomListViewActivity extends AppCompatActivity {

    private static final String TAG = "CustomListViewActivity";

    private List<Fruit> fruits = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        Log.e(TAG, "onCreate: test");

        initFruits();

        FruitAdapter fruitAdapter = new FruitAdapter(CustomListViewActivity.this,
                R.layout.activity_custom_list_view, fruits);
        ListView listView = findViewById(R.id.fruit_list);
        listView.setAdapter(fruitAdapter);
    }

    private void initFruits() {
        for (int i = 0; i < 10; i++) {
            Fruit apple = new Fruit("Apple" + i, R.drawable.ic_launcher_foreground);
            fruits.add(apple);
        }
    }
}
