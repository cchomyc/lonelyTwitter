package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.IntentReaderActivity;
import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;
import ca.ualberta.cs.lonelytwitter.R;

public class IntentReaderActivityTest extends
		ActivityInstrumentationTestCase2<IntentReaderActivity> {

	public IntentReaderActivityTest() {
		super(IntentReaderActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	public void testSendText() {
		String text = "Hello World!";
		int code = IntentReaderActivity.NORMAL;
		IntentReaderActivity activity = startWithText(text, code);
		assertEquals("Is the text correct?", text, activity.getText());
	}
	
	public void testReverseText() {
		String text = "Hello";
		String reverse = "olleH";
		IntentReaderActivity activity = startWithText(text, IntentReaderActivity.REVERSE);
		assertEquals("Reverse transform correct?", reverse, activity.getText());
	}
	
	public void testDoubleText() {
		String text = "Hello";
		IntentReaderActivity activity = startWithText(text, IntentReaderActivity.DOUBLE);
		assertEquals("Double transform correct?", text + text, activity.getText());
	}
	
	public void testDisplayText() {
		String text = "Hello World!";
		IntentReaderActivity activity = startWithText(text, IntentReaderActivity.NORMAL);
		assertEquals("Correct text?", text, activity.getText());
		TextView view = (TextView)activity.findViewById(R.id.intentText);
		assertEquals("Displaying correct text?", text, view.getText().toString());
	}
	
	private IntentReaderActivity startWithText(String text, int code) {
		Intent intent = new Intent();
		intent.putExtra(IntentReaderActivity.TEXT_KEY, text);
		intent.putExtra(IntentReaderActivity.TRANSFORM_KEY, code);
		setActivityIntent(intent);
		return (IntentReaderActivity)getActivity();
	}
}