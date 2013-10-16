package com.autoperformanceanalyzer.gui;

import com.example.autoperformanceanalyzer.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Test extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.test, menu);
		return true;
	}
	public void returnHistory(View view) {
        // Do something in response to button
		// Test comment
    	Intent intent = new Intent(this, History.class);
    	//EditText editText = (EditText) findViewById(R.id.History);
    	//String message = editText.getText().toString();
    	//intent.putExtra(EXTRA_MESSAGE, message);
    	startActivity(intent);
    }
	public void sendGraph(View view) {
        // Do something in response to button
    	Intent intent = new Intent(this, DisplayGraph.class);
    	//EditText editText = (EditText) findViewById(R.id.History);
    	//String message = editText.getText().toString();
    	//intent.putExtra(EXTRA_MESSAGE, message);
    	startActivity(intent);
    }

}
