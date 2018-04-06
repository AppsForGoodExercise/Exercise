package com.example.snowk.exercise;

/**
 * Created by robertclark on 4/4/18.
 */

public class Exercise {
    String title;
    String difficulty;
    int numberoftimes;
    int amountoftime;
    int caloric;
    public Exercise(String name, String intensity, int reps, int time, int calories){
        title = name;
        difficulty = intensity;
        numberoftimes = reps;
        amountoftime = time;
        caloric = calories;

    }
}
