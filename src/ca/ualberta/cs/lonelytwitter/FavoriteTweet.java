package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class FavoriteTweet extends NotableTweet {
	
	public FavoriteTweet(User u, String text, Date timestamp) {
		super(u, text, timestamp);
	}

	@Override
	public Date getTimestamp() {
		// TODO Auto-generated method stub
		return null;
	}
}