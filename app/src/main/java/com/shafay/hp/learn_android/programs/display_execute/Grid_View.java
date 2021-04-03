package com.shafay.hp.learn_android.programs.display_execute;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import com.shafay.hp.learn_android.R;

import java.util.ArrayList;
import java.util.List;

public class Grid_View extends AppCompatActivity {
    List<String> list;
    GridView grid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);


        getSupportActionBar().setTitle("Grid View");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        list=new ArrayList<String>();
        grid=(GridView) findViewById(R.id.gridView1);

        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");
        list.add("Item 5");
        list.add("Item 6");
        list.add("Item 7");
        list.add("Item 8");
        list.add("Item 9");
        list.add("Item 10");
        list.add("Item 11");
        list.add("Item 12");

        ArrayAdapter<String> adp=new ArrayAdapter<String> (this, android.R.layout.simple_dropdown_item_1line,list);
        grid.setAdapter(adp);

        grid.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                    long arg3) {
                // TODO Auto-generated method stub

                Toast.makeText(getBaseContext(), list.get(arg2),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
