package ca.ualberta.cs.lonelytwitter.test;

import java.util.Date;

import ca.ualberta.cs.lonelytwitter.ImportantTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import android.test.ActivityInstrumentationTestCase2;

public class LonelyTweetModelTest extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	public LonelyTweetModelTest() {
		super(LonelyTwitterActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	public void testSampleCode() {
		assertTrue("This is not true.", "hi".equals("hi"));
		assertFalse("This is not false.", false);
		assertSame("5 equals 5", 5, 5);
		//fail("This is a failing test.");	//this is used to indicate a failure
	}
	
	public void testEquals() {
		NormalTweetModel tweet1 = new NormalTweetModel("Hi", new Date(31224));
		NormalTweetModel tweet2 = new NormalTweetModel("Hi", new Date(31223));
		assertFalse("Different timestamps", tweet1.equals(tweet2));
		ImportantTweetModel tweet3 = new ImportantTweetModel("Hi", new Date(31224));
		ImportantTweetModel tweet4 = new ImportantTweetModel("Hello", new Date(31224));
		assertFalse("Different text", tweet3.equals(tweet4));
		ImportantTweetModel tweet5 = new ImportantTweetModel("Hi", new Date(31224));
		NormalTweetModel tweet6 = new NormalTweetModel("Hi", new Date(31224));
		assertFalse("Different types", tweet5.equals(tweet6));
	}

}