package com.shafay.hp.learn_android.programs.display_execute;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.shafay.hp.learn_android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class SwipeRefreshLayoutExecute extends AppCompatActivity {

    SwipeRefreshLayout swipeRefreshLayout;
    ListView listView;
    ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Python", "Javascript", "Java",
            "Kotlin", "Go", "R", "Swift", "Php", "C", "Ruby"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe_refresh_layout_exceute);

        getSupportActionBar().setTitle("Swipe Refresh Layout");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        swipeRefreshLayout = findViewById(R.id.simpleSwipeRefreshLayout);
        listView = findViewById(R.id.listViewSwipeRefreshLayout);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(adapter);
        // implement setOnRefreshListener event on SwipeRefreshLayout
        swipeRefreshLayout.setOnRefreshListener(() -> {
            // cancel the Visual indication of a refresh
            swipeRefreshLayout.setRefreshing(false);
            shuffleItems();
        });

    }

    public void shuffleItems() {
        // shuffle the ArrayList items and set the adapter
        Collections.shuffle(arrayList, new Random(System.currentTimeMillis()));
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(adapter);
    }
}