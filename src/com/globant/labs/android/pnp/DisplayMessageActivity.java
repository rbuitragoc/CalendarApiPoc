package com.globant.labs.android.pnp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.style.TextAppearanceSpan;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.TextView;

public class DisplayMessageActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Intent intent = getIntent();
		String message = intent.getStringExtra(CalendarApiPocActivity.EXTRA_MESSAGE);
		
		// Create the text view
	    TextView textView = new TextView(this);
	    textView.setTextSize(40);
	    textView.setTypeface(Typeface.SANS_SERIF, 2);
	    textView.setText(message);
	    textView.setGravity(Gravity.LEFT);
	    	        
	    setContentView(textView, new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
	    
	    //Create another button to return to first activity
	    Button button = new Button(this);
	    button.setText("Return to first activity");
	    button.setWidth(105);
	    button.setGravity(Gravity.CENTER_HORIZONTAL);
	    button.setLines(2);
	    button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CalendarApiPocActivity.class);
                startActivityIfNeeded(intent, 0);
            }
        });
	    
	    addContentView(button, new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
	}
}
