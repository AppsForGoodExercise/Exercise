package com.example.snowk.exercise;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by robertclark on 4/4/18.
 */

public class ExerciseMasterList {

    ArrayList<Exercise> masterlist;
    public ExerciseMasterList(){

    masterlist = new ArrayList<Exercise>();


    }

    public void addexercise (Exercise e){
        masterlist.add(e);

    }
    public ArrayList getmasterlist (){
        return masterlist;

    }
    public Exercise getexercixe (int p){
        return masterlist.get(p);

    }


}
