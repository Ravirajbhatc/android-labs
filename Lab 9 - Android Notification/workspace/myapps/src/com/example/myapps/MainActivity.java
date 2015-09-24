package com.example.myapps;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button btn = (Button)findViewById(R.id.button);
        final EditText edit1 = (EditText)findViewById(R.id.editText1);
        final EditText edit2 = (EditText)findViewById(R.id.editText2);
        
        
        btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String username = edit1.getText().toString();
				String password = edit2.getText().toString();
				if(username.equals("shiva") && password.equals("papa"))
				{
				Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_LONG).show();
				Intent intent = new Intent(getApplicationContext(),second.class);
				startActivity(intent);
				}
				else
				{
					new AlertDialog.Builder(MainActivity.this)
				    .setTitle("Password Error")
				    .setMessage("Retry Entering correct password!")
				    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
				        public void onClick(DialogInterface dialog, int which) { 
				            // continue with delete
				        }
				     })
				    .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
				        public void onClick(DialogInterface dialog, int which) { 
				            // do nothing
				        }
				     })
				    .setIcon(android.R.drawable.ic_dialog_alert)
				     .show();
				}
				
			}
			});
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
     switch(item.getItemId())
     {
        case R.id.login:
            Toast.makeText(getApplicationContext(), "Login option button clicked",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(getApplicationContext(),about.class);
            startActivity(intent);
            return true;
        case R.id.about:
            Toast.makeText(getApplicationContext(), "about option button clicked", Toast.LENGTH_LONG).show();
            
            return true;
      
        	
        default:
        	Toast.makeText(getApplicationContext(), "paste clicked", Toast.LENGTH_LONG).show();
            return super.onOptionsItemSelected(item);
            
     } //end switch
}
    
}
