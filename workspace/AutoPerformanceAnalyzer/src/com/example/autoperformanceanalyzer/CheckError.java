package com.example.autoperformanceanalyzer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class CheckError extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_check_error);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.check_error, menu);
		return true;
	}
	 public void sendClearCode(View view) {
	        // Do something in response to button
	    	Intent intent = new Intent(this, ClearCode.class);
	    	//EditText editText = (EditText) findViewById(R.id.History);
	    	//String message = editText.getText().toString();
	    	//intent.putExtra(EXTRA_MESSAGE, message);
	    	startActivity(intent);
	    }
	 public void returnDisplayMode(View view) {
	        // Do something in response to button
	    	Intent intent = new Intent(this, DisplayModeActivity.class);
	    	//EditText editText = (EditText) findViewById(R.id.History);
	    	//String message = editText.getText().toString();
	    	//intent.putExtra(EXTRA_MESSAGE, message);
	    	startActivity(intent);
	    }
	 
}
