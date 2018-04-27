package com.example.snowk.exercise;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;


//Rahul 04/23/
public class AlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent){

        NotificationCompat.Builder builder = new NotificationCompat.Builder(context)
                .setContentTitle("Exercise")
                .setContentText("Time to Exercise")
                .setAutoCancel(true)
                .setSmallIcon(android.R.drawable.stat_notify_error);
       //         .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));
        builder.setDefaults(Notification.DEFAULT_SOUND | Notification.DEFAULT_LIGHTS | Notification.DEFAULT_VIBRATE);

        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(1, builder.build());

    }
}
