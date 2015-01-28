package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TwitterListModel {
	private int count;
	private ArrayList<LonelyTweetModel> tweetList;

	public TwitterListModel() {
		count = 0;
		tweetList = new ArrayList<LonelyTweetModel>();
	}

	public int getCount() {
		return count;
	}

	public ArrayList<LonelyTweetModel> getTweets() {
		return tweetList;
	}

	public void addTweet(LonelyTweetModel tweet) {
		for (int i = 0; i < tweetList.size(); i++) {
			if (tweetList.get(i).equals(tweet)) {
				throw new IllegalArgumentException("Same Tweet!");
			}
		}
		tweetList.add(tweet);
		count += 1;
	}

}