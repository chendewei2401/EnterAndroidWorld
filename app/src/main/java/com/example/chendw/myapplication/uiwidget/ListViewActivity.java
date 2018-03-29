package com.example.chendw.myapplication.uiwidget;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.chendw.myapplication.R;

public class ListViewActivity extends AppCompatActivity {

    private static final String TAG = "ListViewActivity";

    private String[] data = {
            "Apple", "Banana", "Orange", "Watermelon", "Pear",
            "Grape", "Pineapple", "Strawberry", "Cherry", "Mango",
            "Apple", "Banana", "Orange", "Watermelon", "Pear",
            "Grape", "Pineapple", "Strawberry", "Cherry", "Mango"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ListViewActivity.this,
                android.R.layout.simple_list_item_1, data);
        ListView listView = findViewById(R.id.myList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Log.e(TAG, "onItemClick: position=" + position);
                        Intent intent = new Intent(ListViewActivity.this, CustomListViewActivity.class);
                        startActivity(intent);
                    }
                }
        );
    }
}
