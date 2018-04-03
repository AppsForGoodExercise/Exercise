package com.example.snowk.exercise;

/**
 * Created by robertclark on 4/3/18.
 */

public class ExerciseEvent {

    String titleofexercise;
    int timeofexercisestart;
    int timeofexercisestop;
    int calories;
    int difficulty;
    public ExerciseEvent(String title, int timestart, int timestop,int intensity, int cloric){
        titleofexercise=title;
        timeofexercisestart = timestart;
        timeofexercisestop = timestop;
        difficulty = intensity;
        calories = cloric;
    }

    public String getTitleofExercise(){
        return titleofexercise;
        }

    public int getsexercisestarttime(){
        return timeofexercisestart;

    }

    public int gettimeofexercisestop(){

        return timeofexercisestop;
    }



}
