package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by PunamWoosaree on 2018-01-18.
 */

public class sad {
    public sad (String mood){
        super(mood);
    }

    public sad (String mood, Date date){
        super(mood,date);
    }

    @Override
    public Boolean sad(){
        return Boolean.FALSE;
    }

}
