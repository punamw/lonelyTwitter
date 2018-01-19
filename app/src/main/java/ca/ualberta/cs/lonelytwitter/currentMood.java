package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by PunamWoosaree on 2018-01-18.
 */

public abstract class currentMood implements moodable{

    private String mood;
    private Date date;

    public currentMood(String mood){
        this.mood = mood;
        this.date = new Date();
    }

    public currentMood(String mood, Date date){
        this.mood = mood;
        this.date = date;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public String getMood(){
        return this.mood;
    }

}
