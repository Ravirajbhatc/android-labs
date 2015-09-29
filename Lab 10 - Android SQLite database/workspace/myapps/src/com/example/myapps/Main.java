package com.example.myapps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		final EditText name=(EditText)findViewById(R.id.editText1);
		final EditText reason = (EditText)findViewById(R.id.editText2);
		Button btn = (Button)findViewById(R.id.button1);
		final RadioGroup rg = (RadioGroup)findViewById(R.id.rg);
		btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String mName = name.getText().toString();
				String mReason = reason.getText().toString();
				int id = rg.getCheckedRadioButtonId();
				RadioButton b = (RadioButton)findViewById(id);
				String mCheck = b.getText().toString();
				bonafide obj = new bonafide(mName, mReason, mCheck);
				Dbhandler db = new Dbhandler(getApplicationContext());
				db.applynew(obj);
				Toast.makeText(getApplicationContext(),"Added to DB", Toast.LENGTH_LONG).show();
				Intent intent = new Intent(getApplicationContext(),second.class);
				startActivity(intent);
			}
		});
	}
}
