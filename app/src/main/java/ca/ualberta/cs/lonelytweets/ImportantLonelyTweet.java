package ca.ualberta.cs.lonelytweets;

import android.util.Log;

/**
 * Created by insanekillah on 2016-11-17.
 */
public class ImportantLonelyTweet extends LonelyTweet {

    public ImportantLonelyTweet(String text) {
        super(text);
    }

	@Override
    public String toString() {
        Log.i("ImportantTweet toString", getTweetDate() + " | " + getTweetBody().toUpperCase());
        return getTweetDate() + " | " + getTweetBody().toUpperCase();
    }

	public boolean isValid() {
		if (tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 20) {
			return false;
		}

		return true;
	}

}
