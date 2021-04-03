package com.shafay.hp.learn_android.programs.display_execute;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.shafay.hp.learn_android.R;


public class List_View extends AppCompatActivity {
    //String Array
    String[] AndroidArray = {"Donut", "Eclair", "Froyo", "Gingerbread",
            "Honeycomb", "Ice Cream Sandwich", "Jelly Bean", "KitKat", "Lollipop", "Marshmallow", "Nougat", "Oreo"};
    private int value;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        getSupportActionBar().setTitle("List View");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.mylist, AndroidArray);
        ListView listView = (ListView) findViewById(R.id.android_list);

        listView.setAdapter(adapter);

    }
}