package com.shafay.hp.learn_android.programs.display_execute;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.shafay.hp.learn_android.R;

import java.util.ArrayList;
import java.util.List;

public class Json_Parsing extends AppCompatActivity {
    String json_string = "{\n" +
            "  \"title\":\"Json Parser Example\",\n" +
            "  \"array\":[\n" +
            "    {\n" +
            "    \"Mobile Brand\":\"Google\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Mobile Brand\":\"Apple\"\n" +
            "    },\n" +
            "    {\n" +
            "    \"Mobile Brand\":\"Samsung\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Mobile Brand\" : \"Huawei\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Mobile Brand\": \"LG\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Mobile Brand\":\"Blacberry\"\n" +
            "    },\n" +
            "    {\n" +
            "    \"Mobile Brand\":\"Nokia\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Mobile Brand\" : \"Oppo\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Mobile Brand\": \"Vivo\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Mobile Brand\":\"Mi\"\n" +
            "    },\n" +
            "    {\n" +
            "    \"Mobile Brand\":\"Oneplus\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Mobile Brand\" : \"Sony\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Mobile Brand\": \"Motorola\"\n" +
            "    }\n" +
            "    ],\n" +
            "    \"nested\":{\n" +
            "    \"flag\": true,\n" +
            "    \"random_number\":1\n" +
            "    }\n" +
            "}";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json_parsing);

        getSupportActionBar().setTitle("Json Json Parsing");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        try {

            ListView listView = (ListView) findViewById(R.id.list_view);

            List<String> items = new ArrayList<>();
            JSONObject root = new JSONObject(json_string);

            JSONArray array= root.getJSONArray("array");

            this.setTitle(root.getString("title"));

            for(int i=0;i<array.length();i++)
            {
                JSONObject object= array.getJSONObject(i);
                items.add(object.getString("Mobile Brand"));
            }

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, items);

            if (listView != null) {
                listView.setAdapter(adapter);
            }

            JSONObject nested= root.getJSONObject("nested");
            Log.d("TAG","flag value "+nested.getBoolean("flag"));

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
