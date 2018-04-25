package com.example.snowk.exercise;

/**
 * Created by robertclark on 3/28/18.
 */

public class Event {
    private  String titleofevent;
    private  int timeofeventstart;
    private int timeofeventstop;
    private int eventdate;

    public Event(int date, String title, int timestart, int timestop){
         titleofevent=title;
         timeofeventstart = timestart;
         timeofeventstop = timestop;
         eventdate = date;
    }


    public String getTitleofEvent(){
        return titleofevent;
    }

    public int getstarttime(){
        return timeofeventstart;
    }

    public int gettimeofeventstop(){
        return timeofeventstop;
    }
    public int getlengthoftime(){
        return timeofeventstop-timeofeventstart;
    }

}
