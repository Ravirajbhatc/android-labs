package office;
import java.lang.*;
public class office
{
public int time;
public String name;
private String address;
private String reason;
private String signature;
private Boolean submitted;
private Boolean isready;
private Boolean inprogress;
public office()
{

}
public office(int time,String name,String address,String reason,String signature)
{
	this.time = time;
	this.name = name;
	this.address = address;
	this.reason = reason;
	this.signature = signature;
	this.create();
}
private void hello()
{
	System.out.println("hello");
}
public String getname()
{
	return  this.name;
}
public String getaddress()
{
	return this.address;
}
public Boolean isready(){
	return this.isready;
}
public Boolean inprogress(){
	return this.inprogress;
}
public int gettime(){
	return this.time;
}

public void create(){
	this.inprogress = true;
	this.submitted = true;
	this.isready = false;
	this.complete();

} 
public void complete()
{
	this.inprogress = false;
	this.isready = true;
	this.time = 4;
}
public office(int time)
{
	this.time = time;
}
}