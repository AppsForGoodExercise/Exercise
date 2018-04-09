package com.example.snowk.exercise;

import android.app.Notification;
import android.app.NotificationManager;
import android.graphics.BitmapFactory;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //notification code
        button = (Button) findViewById (R.id.notifyButton);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view){
                NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(MainActivity.this)
                        .setSmallIcon(android.R.drawable.stat_notify_error)
                        .setLargeIcon(BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher))
                        .setContentTitle("ExerTime")
                        .setContentText("Time to exercise...");
                notificationBuilder.setDefaults(
                        Notification.DEFAULT_SOUND |
                        Notification.DEFAULT_LIGHTS |
                        Notification.DEFAULT_VIBRATE );
                NotificationManagerCompat notificationManager = NotificationManagerCompat.from(MainActivity.this);
                notificationManager.notify(1, notificationBuilder.build());
            }
        });


        InputStream is = (InputStream) getResources().openRawResource(R.raw.exerciselist);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));

        String line = "";
        ExerciseMasterList masterlists= new ExerciseMasterList();
        try {
            while ((line = reader.readLine()) != null) {
                //Split line by ","
                String[] fields = line.split(",");
                 Exercise exercise = new Exercise(fields[0], fields[1], Integer.parseInt(fields[2]),Integer.parseInt(fields[3]),Integer.parseInt(fields[4]));
                 masterlists.addexercise(exercise);
            }
        }
        catch (IOException e){
            Log.e("MainActivity", "Error reading data from file on line " + line );
        }
    }

    public void classclass(View v) {
    }

    public void classclass2(View v) {

    }

}

