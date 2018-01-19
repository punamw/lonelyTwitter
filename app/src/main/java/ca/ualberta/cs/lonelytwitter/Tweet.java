package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
import java.util.List;

/**
 * Created by PunamWoosaree on 2018-01-18.
 */

public abstract class Tweet implements Tweetable {

    private String message;
    private Date date;
    private List<currentMood> moods;

    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
    }

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public String getMessage(){
        return this.message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140){
            throw new TweetTooLongException();
        }
        else {
            this.message = message;
        }
    }

    public abstract Boolean isImportant();
    
    public void add_mood(currentMood){
        this.moods.add(mood);
    }
}
