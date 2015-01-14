package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Retweet extends NotableTweet {
	
	public Retweet(User u, String text, Date timestamp) {
		super(u, text, timestamp);
	}
	
	@Override
	public Date getTimestamp() {
		// TODO Auto-generated method stub
		return null;
	}

}