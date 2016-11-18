package ca.ualberta.cs.lonelytweets;

public class NormalLonelyTweet extends LonelyTweet {

	public NormalLonelyTweet(String text) {
		super(text);
	}

	public boolean isValid() {
		if (tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 10) {
			return false;
		}

		return true;
	}

}