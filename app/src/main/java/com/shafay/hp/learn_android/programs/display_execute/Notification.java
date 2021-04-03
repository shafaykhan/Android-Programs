package com.shafay.hp.learn_android.programs.display_execute;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.view.View;
import android.widget.Toast;

import com.shafay.hp.learn_android.R;

public class Notification extends AppCompatActivity {
    private static final int uniqueID = 45612;
    String NOTIFICATION_CHANNEL_ID = "my_channel_id_01";
    NotificationCompat.Builder notification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Notification");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_notification);
        notification = new NotificationCompat.Builder(this,NOTIFICATION_CHANNEL_ID);
        notification.setAutoCancel(true);
    }

    public void btnclicked(View view){
        //Build the notification
        notification.setSmallIcon(R.drawable.notification);
        notification.setTicker("Notification");
        notification.setWhen(System.currentTimeMillis());
        notification.setContentTitle("Simple Notification");
        notification.setContentText("This is the example of simple notification...");

        Intent intent = new Intent(this, Notification.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        notification.setContentIntent(pendingIntent);

        //Builds notification and issues it
        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nm.notify(uniqueID, notification.build());

    }
    public void check(View view){
        Toast.makeText(this, "Notification Shown", Toast.LENGTH_SHORT).show();
    }
}
