package com.example.snowk.exercise;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class MainActivity extends AppCompatActivity {
    public String path = Environment.getExternalStorageDirectory().getAbsolutePath()+"week.csv";
    public Day day = new Day();

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Date g = Calendar.getInstance().getTime();
        System.out.println("Current time => " + g);

        Date date = new Date();   // given date
        Calendar calendar = GregorianCalendar.getInstance(); // creates a new calendar instance
        calendar.setTime(date);   // assigns calendar to given date

        int x = calendar.get(Calendar.HOUR_OF_DAY); // gets hour in 24h format
        calendar.get(Calendar.HOUR);        // gets hour in 12h format
        String p = calendar.get(Calendar.DAY_OF_MONTH)+""+calendar.get(Calendar.MONTH)+""+calendar.get(Calendar.YEAR);
        int y = calendar.get(Calendar.MINUTE);
        int numberday = Integer.parseInt(p);
        //Robert's Code
        InputStream is = (InputStream) getResources().openRawResource(R.raw.exerciselist);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));

        String line = "";
        ExerciseMasterList masterlists = new ExerciseMasterList();












        try {
            File file = new File("week.csv");
            FileWriter fw = new FileWriter(file);
            PrintWriter pw = new PrintWriter(fw);

            pw.println("Line 1");
            pw.println("Line 3");

            pw.close();
            while ((line = reader.readLine()) != null) {
                //Split line by ","

                String[] fields = line.split(",");
                Exercise exercise = new Exercise(fields[0], fields[1], Integer.parseInt(fields[2]), Integer.parseInt(fields[3]), Integer.parseInt(fields[4]));
                masterlists.addexercise(exercise);
            }
        } catch (IOException e) {
            Log.e("MainActivity", "Error reading data from file on line " + line);
        }
        for (int r =0; r<masterlists.getmasterlist().size();r++){
            System.out.println(masterlists.getexercixe(r).getname());
        }


         day = new Day(numberday, null, masterlists);






        //notification button
        //this is disconnected for now
       // Button buttonExercise = findViewById(R.id.notify);
       // Button buttonExercise = findViewById(R.id.notify);
        //Button buttonExercise = findViewById(R.id.notify);
        //notification button--this is disconnected for now
       /* Button buttonExercise = findViewById(R.id.notify);
       // buttonExercise.setOnClickListener(new View.OnClickListener() {
       //     @Override
        //    public void onClick(View view) {
         //       notificationpopup();
         //   }
       // });
*/

        //profile button
        Button butprofile = findViewById(R.id.profileButton);
        butprofile.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                profile();
            }
        });

        //today's score button
        Button scorebut = findViewById(R.id.scoreBut);
        scorebut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                todayscore();
            }
        });

        //next exercise button
        Button nextEx = findViewById(R.id.dateButton);
        nextEx.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                nextExercise();
            }
        });


        //exercise List button
        Button exerList = findViewById(R.id.exerciseList);
        exerList.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                exerciseList();
            }
        });


        Calendar c = (Calendar) Calendar.getInstance();
        c.add(Calendar.SECOND, 5);
        startAlarm(c);
    }



    //code for connecting
    public void notificationpopup() {
        Intent noti = new Intent(this, notificationActivity.class);
        startActivity(noti);

    }

    //connecting profile button
    public void profile() {
        Intent pro = new Intent(this, profile.class);
        startActivity(pro);

    }

    //next exercise
    public void nextExercise() {
        Intent exer = new Intent(this, nextExercise.class);
        Log.e("MainActivity", "hi " );

        Date date = new Date();   // given date
        Calendar calendar = GregorianCalendar.getInstance(); // creates a new calendar instance
        calendar.setTime(date);   // assigns calendar to given date
        int x = calendar.get(Calendar.HOUR_OF_DAY); // gets hour in 24h format
        calendar.get(Calendar.HOUR);        // gets hour in 12h format
        calendar.get(Calendar.MONTH);
        int y = calendar.get(Calendar.MINUTE);

        int time = x*60+y;

        String  answer = ""+day.getalltheexercises()+"";


        exer.putExtra("NameofExercise", answer);



        startActivity(exer);
    }

    public void todayscore() {
        Intent tod = new Intent(this, todayScore.class);
        startActivity(tod);
    }

    public void exerciseList() {
        Intent exerList= new Intent(this, exercisecompleteList.class);
        startActivity(exerList);
    }



    public void hamburger (View V){
        Log.e("MainActivity", "hi " );

        System.out.println("HEYYEAG");
        Date date = new Date();   // given date
        Calendar calendar = GregorianCalendar.getInstance(); // creates a new calendar instance
        calendar.setTime(date);   // assigns calendar to given date



        int x = calendar.get(Calendar.HOUR_OF_DAY); // gets hour in 24h format
        calendar.get(Calendar.HOUR);        // gets hour in 12h format
        calendar.get(Calendar.MONTH);
        int y = calendar.get(Calendar.MINUTE);

        int time = x*60+y;

           String  answer = ""+day.getalltheexercises()+"";


            Intent intent = new Intent(this, NewExerciseActivity.class);

            intent.putExtra("Hi", answer);
            startActivity(intent);

    }

    //alarmManager code

    public void startAlarm(Calendar c){

        AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);

        Intent intent = new Intent(this, AlarmReceiver.class);
        PendingIntent broadcast = PendingIntent.getBroadcast(this,1,intent,0);

        alarmManager.set(AlarmManager.RTC_WAKEUP, c.getTimeInMillis(),broadcast);
    }

}