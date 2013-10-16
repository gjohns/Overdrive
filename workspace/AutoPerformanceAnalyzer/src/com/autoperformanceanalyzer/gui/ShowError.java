package com.autoperformanceanalyzer.gui;

import com.example.autoperformanceanalyzer.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class ShowError extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_show_error);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.show_error, menu);
		return true;
	}
	
	 public void returnCheckError(View view) {
	        // Do something in response to button
	    	Intent intent = new Intent(this, CheckError.class);
	    	//EditText editText = (EditText) findViewById(R.id.History);
	    	//String message = editText.getText().toString();
	    	//intent.putExtra(EXTRA_MESSAGE, message);
	    	startActivity(intent);
	    }

}
