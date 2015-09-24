package com.example.myapps;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class about extends Activity {
	protected void oncreate(Bundle savedinstance)
	{
		super.onCreate(savedinstance);
		setContentView(R.layout.about);
		TextView tv = (TextView)findViewById(R.id.about);
		tv.setText("Your user ID and password will be your TCENET username and password.users could login with your existing passwords and Access the service.For more detials and queries contact the office Staffs regarding the login issues.");
		
	
		
	}
}
