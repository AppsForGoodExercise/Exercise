package com.example.snowk.exercise;

/**
 * Created by robertclark on 3/28/18.
 */

public class Event {
    private  String titleofevent;
    private  int timeofeventstart;
    private int timeofeventstop;
    public Event(String title, int timestart, int timestop){
          titleofevent=title;
         timeofeventstart = timestart;
         timeofeventstop = timestop;
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

}
