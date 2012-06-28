package com.globant.labs.android.pnp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.style.TextAppearanceSpan;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DisplayMessageActivity extends Activity {
	
	private String messageValue;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// Create the text view
//		TextView textView = (TextView) findViewById(R.id.message_view);		
//	    TextView textView = new TextView(this);
//	    textView.setTextSize(40);
//	    textView.setTypeface(Typeface.SANS_SERIF, Typeface.ITALIC);
//	    textView.setText(message);
//	    textView.setGravity(Gravity.LEFT);
	    
	    //Create another button to return to first activity
//		Button button = (Button) findViewById(R.id.button_return);
//	    Button button = new Button(this);
//	    button.setText("Return to first activity");
//	    button.setWidth(105);
//	    button.setGravity(Gravity.CENTER_HORIZONTAL);
//	    LayoutParams buttonLayout = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
//	    button.setLayoutParams(buttonLayout);
//	    button.setLines(2);
//	    button.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(), CalendarApiPocActivity.class);
//                startActivityIfNeeded(intent, 0);
//            }
//        });
	    
//	    LinearLayout layout = new LinearLayout(this);
//	    layout.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.FILL_PARENT));
//	    layout.setOrientation(LinearLayout.VERTICAL);
//	    layout.addView(textView, new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
//	    layout.addView(button, buttonLayout);
	    
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
