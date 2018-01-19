package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by PunamWoosaree on 2018-01-18.
 */

public class sad extends currentMood {
    public sad (String mood){
        super(mood);
    }

    public sad (String mood, Date date){
        super(mood,date);
    }

    @Override
    public Boolean isHappy(){
        return Boolean.FALSE;
    }

}
