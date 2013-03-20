package com.bop.pos;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class SalesTabActivity extends Activity {
	
	@Override
	 protected void onCreate(Bundle savedInstanceState) {
		 super.onCreate(savedInstanceState);
		 TextView view = new TextView(this);
		 view.setText("Sales");
		 view.setBackgroundColor(Color.WHITE);
		 setContentView(view);
	}
}
