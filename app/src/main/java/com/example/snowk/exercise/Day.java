package com.example.snowk.exercise;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by robertclark on 3/28/18.
 */

public class Day {
    public List<Event> events;
    public int size = events.size();
    public int date;
    public Day( int date, String[] titlesoe, int[] starttimes, int[] stoptimes) {
        date = date;
        events = new ArrayList<Event>();
        if(titlesoe.length==starttimes.length) {
            for(int p = 0;p<stoptimes.length;p++)
                for(int i=0;i<=titlesoe.length-1;i++) {
                    Event newevent = new Event(titlesoe[i],starttimes[p],stoptimes[i]);
                    events.add(newevent);

                }
        }

    }
    public boolean isEmpty() {
        if(size==0) {
            return true;
        }
        else return false;
    }


    public Event geteventlocation(int location){
        return events.get(location);
    }

    public Event geteventstartime(int timeofbeginning){
        boolean checker;
        Event nevent=null;
        for( int i = 0; i<=events.size(); i++ ) {
            if(timeofbeginning == events.get(i).getstarttime()){
                checker = true;
                  nevent = events.get(i);
                break;
            }

        }

            return nevent;
    }

    public Event geteventstoptime(int timeofbeginning){
        boolean checker;
        Event nevent=null;
        for( int i = 0; i<=events.size(); i++ ) {
            if(timeofbeginning == events.get(i).gettimeofeventstop()){
                checker = true;
                nevent = events.get(i);
                break;
            }

        }

        return nevent;
    }

    public Event geteventtitle(String titleofevent){
        boolean checker;
        Event nevent=null;
        for( int i = 0; i<=events.size(); i++ ) {
            if(titleofevent.equals(events.get(i).getTitleofEvent())){
                checker = true;
                nevent = events.get(i);
                break;
            }

        }

        return nevent;
    }

    public void addevent(String titleofevent,int starttime, int endtime){
       Event addevent= new Event(titleofevent, starttime,endtime);
       events.add(addevent);
    }

    public boolean eventat(int starttime, int stoptime) {
        boolean checker=false;
        for(int i = 0;i<=events.size();i++){
        if(events.get(i).getstarttime()>=starttime||events.get(i).gettimeofeventstop()<=stoptime) {
             checker=true;
             break;

        }
        else if(events.get(i).gettimeofeventstop()<=stoptime&&events.get(i).gettimeofeventstop()>=starttime) {
                checker=true;
                break;

            }
        else checker = false;}

        return checker;

    }

    public int getDate(){
        return date;
    }

    public int timebetweenevents(int j){
        return (events.get(j+1).getstarttime()-events.get(j).gettimeofeventstop());
    }

    }

