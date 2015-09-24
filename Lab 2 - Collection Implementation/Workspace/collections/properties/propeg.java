import java.util.*;  
import java.io.*;  
public class propeg {  
public static void main(String[] args)throws Exception{  
    FileReader reader=new FileReader("student.properties");  
      
    Properties p=new Properties();  
    p.load(reader);  
    System.out.println(p.getProperty("rollno"));  
    System.out.println(p.getProperty("name")); 
    System.out.println(p.getProperty("age"));   
    System.out.println(p.getProperty("reason")); 

    Properties ps=new Properties();  
	ps.setProperty("rollno","102");  
	ps.setProperty("name","papa");
	ps.setProperty("age","19");
	ps.setProperty("reason","USA visa Study");

	Properties ps1=new Properties();  
	ps1.setProperty("rollno","103");  
	ps1.setProperty("name","papashiva");
	ps1.setProperty("age","19");
	ps1.setProperty("reason","USA visa Study");
  
	ps.store(new FileWriter("info.properties"),"Student Request Information"); 
		File f = new File("studentxml.properties");	
        OutputStream out = new FileOutputStream( f );
	ps.storeToXML(out,"Student Request Information");  

	ps1.storeToXML(out,"Student Request Information");  
}  
}  