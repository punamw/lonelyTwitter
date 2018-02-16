package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by PunamWoosaree on 2018-02-15.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest()
    {
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet()
    {
      TweetList tweets = new TweetList();

      Tweet tweet = new NormalTweet("adding a normal tweet");
      tweets.add(tweet);

      assertTrue(tweets.hasTweet(tweet));
    }

    public void testHasTweet(){
        TweetList tweets = new TweetList();

        Tweet tweet = new NormalTweet("adding a normal tweet");

        assertFalse(tweets.hasTweet(tweet));

        tweets.add(tweet);

        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();

        Tweet tweet = new NormalTweet("adding a normal tweet");

        tweets.add(tweet);

        Tweet returnedTweet = tweets.getTweet(0);

        assertEquals(returnedTweet.getDate(), tweet.getDate());
    }

    public void testDeleteTweet(){
        TweetList tweets = new TweetList();

        Tweet tweet = new NormalTweet("adding a normal tweet");

        tweets.add(tweet);

        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }

//adding a comment for test purposes
    public void testGetCount(){
        TweetList tweets = new TweetList();

        Tweet tweet = new NormalTweet("adding a normal tweet");

        tweets.add(tweet);

        int tweetSize = tweets.getSize();

        assertEquals(tweetSize, 1);
    }

    public void testAddTweet(){
        Throwable ex;
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a normal Tweet");
        Tweet tweet2 = new NormalTweet("adding a normal Tweet");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
        //Source: https://stackoverflow.com/questions/156503/how-do-you-assert-that-a-certain-exception-is-thrown-in-junit-4-tests
        //Accessed on February 15, 2018
        try{
            tweets.add(tweet2);
        } catch (IllegalArgumentException e){
            ex = e;
            assertTrue(ex instanceof IllegalArgumentException);
        }
    }


}
