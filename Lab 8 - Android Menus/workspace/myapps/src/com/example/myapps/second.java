package com.example.myapps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class second extends Activity {
	protected String[] serve = new String[3];
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        serve[0] = "Bonafide Service";
        serve[1] = "Bill Issues";
        serve[2] = "important Notifications";
        ListView lv = (ListView)findViewById(R.id.listView1);
        ArrayAdapter<String> av = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, serve);
        lv.setAdapter(av);
        registerForContextMenu(lv);
        final Button button1 = (Button) findViewById(R.id.button1);  
        button1.setOnClickListener(new OnClickListener() {  
         
         @Override  
         public void onClick(View v) {  
          //Creating the instance of PopupMenu  
          PopupMenu popup = new PopupMenu(second.this, button1);  
          //Inflating the Popup using xml file  
          popup.getMenuInflater().inflate(R.menu.pop, popup.getMenu());  
         
          //registering popup with OnMenuItemClickListener  
          popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {  
           public boolean onMenuItemClick(MenuItem item) {  
            Toast.makeText(second.this,"You Clicked : " + item.getTitle(),Toast.LENGTH_SHORT).show();  
            return true;  
           }  
          });  

          popup.show();//showing popup menu  
         }  
        });//closing the setOnClickListener metho
       
    }
    
    public boolean onContextItemSelected(MenuItem item){    
        if(item.getTitle()=="Apply Now"){  
            Toast.makeText(getApplicationContext(),"Applying for bonafide",Toast.LENGTH_LONG).show();  
        }    
        else if(item.getTitle()=="More Details"){  
            Toast.makeText(getApplicationContext(),"Getting more info for bonofide",Toast.LENGTH_LONG).show();  
        }else{  
           return false;  
        }    
      return true;    
  }    

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo)  
    {  
            super.onCreateContextMenu(menu, v, menuInfo);  
            menu.setHeaderTitle("Available options");    
            menu.add(0, v.getId(), 0, "Apply Now");//groupId, itemId, order, title   
            menu.add(0, v.getId(), 0, "More Details");   
    }   
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.logout, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
     switch(item.getItemId())
     {
        case R.id.logout:
            Toast.makeText(getApplicationContext(), "Logout option button clicked",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
            return true;
            
     } //end switch
	return false;
}
    
}
