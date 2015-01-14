package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class NotableTweet extends LonelyTweetModel {
	private User user;  //user that favorited/retweeted the tweet
	
	public NotableTweet(User u, String text, Date timestamp) {
		super(text, timestamp);
		user = u;
	}
	
	public User getNotableUser() {
		return user;
	}
}
