package com.shafay.hp.learn_android.programs.display_execute;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.shafay.hp.learn_android.R;

public class Menu_View extends AppCompatActivity {

    String contacts[]={"Iron-Man","Captain-America","Thor","Hulk","Black Widow","Spiderman","Black Panther","Doctor Strange","Star-Lord",};
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        getSupportActionBar().setTitle("Menu View");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView=(ListView)findViewById(R.id.listView);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,contacts);
        listView.setAdapter(adapter);
        //  ListView  for Context menu
        registerForContextMenu(listView);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Select The Action");
        menu.add(0, v.getId(), 0, "Call");
        menu.add(0, v.getId(), 0, "SMS");
    }
    @Override
    public boolean onContextItemSelected(MenuItem item){
        if(item.getTitle()=="Call"){
            Toast.makeText(getApplicationContext(),"calling ",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="SMS"){
            Toast.makeText(getApplicationContext(),"sending sms ",Toast.LENGTH_LONG).show();
        }else{
            return false;
        }
        return true;
    }
}
