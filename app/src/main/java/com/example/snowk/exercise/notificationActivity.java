package com.example.snowk.exercise;
import android.app.Notification;
import android.graphics.BitmapFactory;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Jennifer on 4/9/2018.
 */


public class notificationActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification);

        Bundle bundle = getIntent().getExtras();
        button = (Button) findViewById(R.id.notifyButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(notificationActivity.this)
                        .setSmallIcon(android.R.drawable.stat_notify_error)
                        .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher))
                        .setContentTitle("ExerTime")
                        .setContentText("Time to exercise!");
                notificationBuilder.setDefaults(
                        Notification.DEFAULT_SOUND | Notification.DEFAULT_LIGHTS | Notification.DEFAULT_VIBRATE);
                NotificationManagerCompat notificationManager = NotificationManagerCompat.from(notificationActivity.this);
                notificationManager.notify(1, notificationBuilder.build());

            }
        });
    }
}



