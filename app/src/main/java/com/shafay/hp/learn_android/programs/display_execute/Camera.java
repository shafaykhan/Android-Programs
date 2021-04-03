package com.shafay.hp.learn_android.programs.display_execute;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.shafay.hp.learn_android.R;

public class Camera extends AppCompatActivity {
    private static final int CAMERA_REQUEST = 1888;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        getSupportActionBar().setTitle("Camera");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imageView = this.findViewById(R.id.imageView1);
        Button photoButton = this.findViewById(R.id.button1);

        photoButton.setOnClickListener(v -> {
            Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(cameraIntent, CAMERA_REQUEST);
        });
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == CAMERA_REQUEST) {
            if (data != null && data.getExtras() != null) {
                Bitmap photo = (Bitmap) data.getExtras().get("data");
                imageView.setImageBitmap(photo);
            } else {
                imageView.setVisibility(View.INVISIBLE);
            }
        }
    }

}


