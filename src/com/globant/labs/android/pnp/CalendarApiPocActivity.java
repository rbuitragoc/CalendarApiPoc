package com.globant.labs.android.pnp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CalendarApiPocActivity extends Activity {
	
	public final static String EXTRA_MESSAGE = "com.globant.labs.android.pnp.MESSAGE";
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    /** Called when the user selects the Send button */
    public void sendMessage(View view) {
    	Intent intent = new Intent(this, DisplayMessageActivity.class);
    	EditText editText = (EditText) findViewById(R.id.edit_message);
    	String message = editText.getText().toString();
    	intent.putExtra(EXTRA_MESSAGE, message);
    	startActivity(intent);
    }

	@Override
	protected void onStart() {
		super.onStart();
		EditText editText = (EditText) findViewById(R.id.edit_message);
    	if (getIntent() != null && getIntent().getExtras() != null) {
			String message = "" + getIntent().getExtras().get(EXTRA_MESSAGE);
			editText.setText(message);
		}
	}
    
    
}