package com.example.snowk.exercise;

import android.util.Log;

import org.omg.CORBA.portable.InputStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by robertclark on 4/3/18.
 */

public class ExerciseEvent {

    String titleofexercise;
    int timeofexercisestart;
    int timeofexercisestop;
    Exercise Eventexercise;
    public ExerciseEvent(Exercise e, int timestart, int timestop){
         Eventexercise = e;
        timeofexercisestart = timestart;
        timeofexercisestop = timestop;

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
