package com.example.snowk.exercise;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

