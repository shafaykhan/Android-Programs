package com.shafay.hp.learn_android.programs.display_execute;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import com.jmedeisis.draglinearlayout.DragLinearLayout;
import com.shafay.hp.learn_android.R;

public class Drag_Drop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drag_drop);

        getSupportActionBar().setTitle("Drag Drop Widget ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        DragLinearLayout dragLinearLayout = (DragLinearLayout) findViewById(R.id.container);
        // set all children draggable except the first (the header)
        for(int i = 0; i < dragLinearLayout.getChildCount(); i++){
            View child = dragLinearLayout.getChildAt(i);
            dragLinearLayout.setViewDraggable(child, child); // the child is its own drag handle
        }
    }
}
