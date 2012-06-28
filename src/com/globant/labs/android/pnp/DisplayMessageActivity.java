package com.globant.labs.android.pnp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DisplayMessageActivity extends Activity {
	
	private String messageValue;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity2);
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		Intent intent = getIntent();
		String message = intent.getStringExtra(CalendarApiPocActivity.EXTRA_MESSAGE);
		TextView textView = (TextView) findViewById(R.id.message_view);
		textView.setText(message);
		messageValue = message;
	}

	public void returnToMainActivity(View view) {
		Intent intent = new Intent(this, CalendarApiPocActivity.class);
		intent.putExtra(CalendarApiPocActivity.EXTRA_MESSAGE, messageValue);
		startActivityIfNeeded(intent, 0);
		
	}
}
