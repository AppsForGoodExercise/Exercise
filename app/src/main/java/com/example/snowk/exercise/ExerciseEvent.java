package com.example.snowk.exercise;

import android.util.Log;


/**
 * Created by robertclark on 4/3/18.
 */

public class ExerciseEvent {

    private String titleofexercise;
    private int timeofexercisestart;
    private int timeofexercisestop;
    Exercise Eventexercise;

    public ExerciseEvent(Exercise e, int timestart, int timestop){
         Eventexercise = e;
        timeofexercisestart = timestart;
        timeofexercisestop = timestop;

    }

    public String getTitleofExercise(){return titleofexercise; }

    public int getsexercisestarttime(){
        return timeofexercisestart;
    }

    public int gettimeofexercisestop(){

        return timeofexercisestop;
    }





}
