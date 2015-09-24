package com.example.myapps;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class message extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.message);
		NotificationManager nm = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
		nm.cancel(0);
		Intent i = getIntent();
		String text = i.getStringExtra("message");
		String from = i.getStringExtra("from");
		TextView texter = (TextView)findViewById(R.id.textView1);
		TextView fromer = (TextView)findViewById(R.id.textView2);
		fromer.setText(from);
		texter.setText(text);
		
	}
}
