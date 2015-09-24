package collections.hashtable;

import java.util.*;
import collections.Student; 
public class hashtable{  
   
  public Hashtable<Integer,Student> hm=new Hashtable<Integer,Student>();  
  Student s1 = new Student(100,"Amit",19,"USA visa");
  Student s2 = new Student(101,"Shivasurya",20,"tech visa");
  Student s3 = new Student(102,"papa",20,"study visa");
  public hashtable()
  {
  hm.put(1,s1);  
  hm.put(3,s3);
  hm.put(2,s2);  
  }
  public void display(){
  for(Map.Entry m:hm.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());
   Student h = (Student)m.getValue();
   System.out.println(m.getKey()+" "+h.rollno);
   System.out.println(m.getKey()+" "+h.name);
   System.out.println(m.getKey()+" "+h.age);
   System.out.println(m.getKey()+" "+h.reason);
     
  }  
}
 }  
  