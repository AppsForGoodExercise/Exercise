package com.example.snowk.exercise;

import java.util.ArrayList;

/**
 * Created by robertclark on 4/17/18.
 */

public class fifteenminutezone {
    ArrayList<Event> listofevents = new ArrayList<Event>();
    public int timeofbeginning;
    public boolean isthereanexercise;
    public boolean isthereaneventhere;
    public Exercise exerewise;

    public  fifteenminutezone(int timestart, boolean exercisehere, boolean eventhere, Exercise g){
        timeofbeginning = timestart;
        isthereanexercise = exercisehere;
        isthereaneventhere = eventhere;
        exerewise = g;

     }
     public void exercisepresent(boolean r){
         isthereanexercise  = r;
     }
    public boolean isthereanexercisehere(){
        return   isthereanexercise;
    }

    public boolean isthereanevent(){
        return  isthereaneventhere;
    }
    public int gettimestart(){
        return timeofbeginning;
    }
    public Exercise getExercise(){
        return  exerewise;
    }

    public void setexercise(Exercise r){
        exerewise  = r;
    }
}
