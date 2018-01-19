package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by PunamWoosaree on 2018-01-18.
 */

public class happy extends currentMood {
    public happy (String mood){
        super(mood);
    }

    public happy (String mood, Date date){
        super(mood,date);
    }

    @Override
    public Boolean isHappy(){
        return Boolean.TRUE;
    }
}
