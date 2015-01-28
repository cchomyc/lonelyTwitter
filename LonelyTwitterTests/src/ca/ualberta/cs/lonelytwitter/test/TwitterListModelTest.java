package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import ca.ualberta.cs.lonelytwitter.TwitterListModel;
import android.test.ActivityInstrumentationTestCase2;

public class TwitterListModelTest extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity> {
	
	TwitterListModel tweets;

	public TwitterListModelTest() {
		super(LonelyTwitterActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		tweets = new TwitterListModel();
	}
	
	public void testCounts() {
		NormalTweetModel tweet = new NormalTweetModel("Hello");
		tweets.addTweet(tweet);
		assertEquals("Count should be 1.", tweets.getCount(), 1);
	}
	
	public void testAddTweets() {	//method name must begin with test
		NormalTweetModel tweet = new NormalTweetModel("Hello");
		tweets.addTweet(tweet);
		assertNotNull("The tweets list is not initialised.", tweets.getTweets());
		assertEquals("There should be one tweet.", tweets.getTweets().size(), 1);
		try {
			tweets.addTweet(tweet);
		} catch (IllegalArgumentException e) {
			
		}
		assertEquals("Should be 1 tweet.", 1, tweets.getCount());
	}

}
