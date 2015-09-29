package com.example.myapps;

import java.util.List;

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

public class second extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.update);
		Dbhandler obj = new Dbhandler(getApplicationContext());
		List<bonafide>test = obj.getAllContacts();
		Toast.makeText(getApplicationContext(),"getting from DB", Toast.LENGTH_LONG).show();
		
		if(test.size()!=0){
			final EditText name=(EditText)findViewById(R.id.editText1);
			final EditText reason = (EditText)findViewById(R.id.editText2);
			Button btn = (Button)findViewById(R.id.button1);
			final RadioGroup rg = (RadioGroup)findViewById(R.id.rg);
			
			bonafide o = test.get(0);
			name.setText(o.getName());
			reason.setText(o.getReason());
			RadioButton bt = (RadioButton)findViewById(R.id.rb1);
			if(bt.getText().equals(o.getGender())){
				rg.check(R.id.rb1);
			}
			else
				rg.check(R.id.rb2);
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
					obj.setID(1);
					Dbhandler db = new Dbhandler(getApplicationContext());
					db.updateContact(obj);
					Toast.makeText(getApplicationContext(),"updated to DB", Toast.LENGTH_LONG).show();
					Intent intent = new Intent(getApplicationContext(),delete.class);
					startActivity(intent);
				}
			});

		}//end of checking condition 
	}
}
