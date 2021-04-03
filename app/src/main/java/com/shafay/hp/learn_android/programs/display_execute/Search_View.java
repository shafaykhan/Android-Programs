package com.shafay.hp.learn_android.programs.display_execute;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.shafay.hp.learn_android.R;

import java.util.ArrayList;

public class Search_View extends AppCompatActivity {
    SearchView searchView;
    ListView listView;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_view);
        searchView = (SearchView) findViewById(R.id.searchView);
        listView = (ListView) findViewById(R.id.searchlist);

        getSupportActionBar().setTitle("Search View");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        list = new ArrayList<>();
        list.add("January");
        list.add("February");
        list.add("March");
        list.add("April");
        list.add("May");
        list.add("June");
        list.add("July");
        list.add("August");
        list.add("September");
        list.add("October");
        list.add("November");
        list.add("December");
        list.add("Sunday");
        list.add("Monday");
        list.add("Tuesday");
        list.add("Wednesday");
        list.add("Thursday");
        list.add("Friday");
        list.add("Saturday");

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                if (!isBlank(query)) {
                    adapter.getFilter().filter(query);
                } else {
                    Toast.makeText(Search_View.this, "No Match found", Toast.LENGTH_LONG).show();
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });


    }

    private boolean isBlank(String value) {
        return value == null || value.trim().length() == 0;
    }
}
