package com.example.myapps;

public class bonafide {
	String name;
	String reason;
	String gender;
	int id;
	
	public bonafide(String name,String reason,String gender){
		this.name = name;
		this.reason = reason;
		this.gender = gender;
	}
	public bonafide() {
		// TODO Auto-generated constructor stub
	}
	public String getName(){
		return this.name;
	}
	public String getReason(){
		return this.reason;
	}
	public String getGender(){
		return this.gender;
	}
	public void setID(int parseInt) {
		// TODO Auto-generated method stub
		this.id = parseInt;
	}
	public void setReason(String string) {
		// TODO Auto-generated method stub
		this.reason = string;
	}
	public void setName(String string) {
		// TODO Auto-generated method stub
		this.name = string;
	}
	public void setGender(String string) {
		// TODO Auto-generated method stub
		this.gender= string;
	}
}
