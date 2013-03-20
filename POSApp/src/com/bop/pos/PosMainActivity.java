package com.bop.pos;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TabHost;

public class PosMainActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pos_main);
		this.getResources();
		
		TabHost tabHost = getTabHost();
		TabHost.TabSpec spec;
		Intent intent;
		
	    // Tab1
		intent = new Intent().setClass(this, CustomerTabActivity.class);
		spec = tabHost.newTabSpec("Customer");
	    spec.setIndicator("Customer");
	    spec.setContent(intent);
	    tabHost.addTab(spec);
	      
	    // Tab2
	    intent = new Intent().setClass(this, MenuTabActivity.class);
		spec = tabHost.newTabSpec("Menu");
	    spec.setIndicator("Menu");
	    spec.setContent(intent);
	   
	    tabHost.addTab(spec);
	      
	      // Tab3
	    intent = new Intent().setClass(this, SalesTabActivity.class);
		spec = tabHost.newTabSpec("Sales");
	    spec.setIndicator("Sales");
	    spec.setContent(intent);
	    tabHost.addTab(spec);
	      
	    // Set Default Tab - zero based index
	    tabHost.setCurrentTab(0);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pos_main, menu);
		
		return true;
	}

}
