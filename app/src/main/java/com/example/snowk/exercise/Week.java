package com.example.snowk.exercise;

import java.util.ArrayList;

/**
 * Created by robertclark on 3/28/18.
 */

public class Week {

    ArrayList<Event> listofevents = new ArrayList<Event>();

    public void dayconstructor(){
        Day day = new Day();
        boolean event = false;

        int timebetweenevents;
        for(int i=800;i<=1439;i++){
            for(int j=0;j<listofevents.size();j++){
                if(i==listofevents.get(j).getstarttime()){
                    event = true;

                    listofevents.get(j).getlengthoftime();
                }
            }
        }
    }
}
