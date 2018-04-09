package com.example.snowk.exercise;


import java.util.List;

/**
 * Created by robertclark on 4/4/18.
 */

public class ExerciseMasterList {

    List<Exercise> masterlist;
    public ExerciseMasterList(){

   List<Exercise> Exercisemasterlist=masterlist;


    }

    public void addexercise (Exercise e){
        masterlist.add(e);

    }


}
