package com.example.myapps;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Dbhandler extends SQLiteOpenHelper {
	private static final int DATABASE_VERSION = 5;  
	private static final String DATABASE_NAME = "shiva.db";  
	private static final String TABLE_CONTACTS = "bonafide";  
	private static final String KEY_ID = "id";  
	private static final String KEY_NAME = "name";  
	private static final String KEY_REASON = "reason";
	private static final String KEY_GENDER = "gender";
	public Dbhandler(Context context) {  
		super(context, DATABASE_NAME, null, DATABASE_VERSION);  
		//3rd argument to be passed is CursorFactory instance  
	}  

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		String CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_CONTACTS + "("  
                + KEY_ID + " INTEGER PRIMARY KEY," + KEY_NAME + " TEXT,"  
                + KEY_REASON + " TEXT," + KEY_GENDER + " TEXT"+");";  
        db.execSQL(CREATE_CONTACTS_TABLE);  
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
	    db.execSQL("DROP TABLE IF EXISTS " + TABLE_CONTACTS);  
	    
        // Create tables again  
        onCreate(db);  
	}
	 void applynew(bonafide contact) {  
	        SQLiteDatabase db = this.getWritableDatabase();  
	   
	        ContentValues values = new ContentValues();  
	        values.put(KEY_NAME, contact.getName()); // Contact Name  
	        values.put(KEY_GENDER, contact.getGender()); // Contact Phone  
	        values.put(KEY_REASON, contact.getReason());
	        // Inserting Row  
	        db.insert(TABLE_CONTACTS, null, values);  
	        //2nd argument is String containing nullColumnHack  
	        db.close(); // Closing database connection  
	}  
	 public List<bonafide> getAllContacts() {  
	        List<bonafide> contactList = new ArrayList<bonafide>();  
	        // Select All Query  
	        String selectQuery = "SELECT  * FROM " + TABLE_CONTACTS;  
	   
	        SQLiteDatabase db = this.getWritableDatabase();  
	        Cursor cursor = db.rawQuery(selectQuery, null);  
	   
	        // looping through all rows and adding to list  
	        if (cursor.moveToFirst()) {  
	            do {  
	                bonafide contact = new bonafide();  
	                contact.setID(Integer.parseInt(cursor.getString(0)));  
	                contact.setName(cursor.getString(1));  
	                contact.setReason(cursor.getString(2));  
	                contact.setGender(cursor.getString(3));
	                // Adding contact to list  
	                contactList.add(contact);  
	            } while (cursor.moveToNext());  
	        }  
	   
	        // return contact list  
	        return contactList;  
	    }
	 public int updateContact(bonafide contact) {  
	        SQLiteDatabase db = this.getWritableDatabase();  
	   
	        ContentValues values = new ContentValues();  
	        values.put(KEY_NAME, contact.getName()); // Contact Name  
	        values.put(KEY_GENDER, contact.getGender()); // Contact Phone  
	        values.put(KEY_REASON, contact.getReason());
	      
	        // updating row  
	        return db.update(TABLE_CONTACTS, values, KEY_ID + " = ?",  
	                new String[] { String.valueOf(1) });  
	    }
	 public void deleteContact(int id) {  
	        SQLiteDatabase db = this.getWritableDatabase();  
	        db.delete(TABLE_CONTACTS, KEY_ID + " = ?",  
	                new String[] { String.valueOf(1) });  
	        db.close();  
	    }  
}
