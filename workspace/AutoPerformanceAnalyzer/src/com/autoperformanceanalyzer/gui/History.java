package com.autoperformanceanalyzer.gui;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.example.autoperformanceanalyzer.R;

public class History extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_history);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.history, menu);
		return true;
	}

}
