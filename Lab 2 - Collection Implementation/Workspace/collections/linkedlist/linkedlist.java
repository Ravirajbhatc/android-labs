package collections.linkedlist;

import collections.Student;
import java.util.*;
public class linkedlist{ 

  public Student s1,s2,s3,s4,s5,s6;
  public LinkedList<Student> al=new LinkedList<Student>();
  public LinkedList<Student> al2=new LinkedList<Student>();

  public linkedlist(){ 
    s1=new Student(101,"shivasurya",19,"Educational loan");  
    s2=new Student(102,"papa",19,"Scholorship Loan");  
    s3=new Student(103,"pinku papa",18,"USA Visa"); 
  }
  public void create()
  {
   al.add(s1);
   al.add(s2); 
   al.add(s3);  
 }
 public void backward()
 {
  ListIterator<Student> itr=al.listIterator();  
  System.out.println("traversing elements in forward direction...");  
  
  while(itr.hasNext()){  
    Student st=(Student)itr.next();  
    System.out.println(st.rollno+"-"+st.name+" -"+st.age+"-"+st.reason);  
    
  }  
  System.out.println("traversing elements in backward direction...");  
  while(itr.hasPrevious()){  
    Student st=(Student)itr.previous();  
    System.out.println(st.rollno+"-"+st.name+" -"+st.age+"-"+st.reason);  
  }  
}  

public void display()
{
  Iterator itr=al.iterator();  
  System.out.println("Roll"+" "+" Name"+" "+"Age"+" "+"reason");
  while(itr.hasNext()){  
    Student st=(Student)itr.next();  
    System.out.println(st.rollno+"-"+st.name+" -"+st.age+"-"+st.reason);  
  }	
}
public void contains(Student s)
{
  Boolean b = al.contains(s1);
  System.out.println("Status of contains==>"+String.valueOf(b));
}
public void size()
{
  System.out.println("Size of Collection==>"+al.size());
  System.out.println("Size of Collection==>"+al2.size());
}
public void addAll()
{
  s4=new Student(105,"shivasurya",19,"USA visa and JOB");  
  s5=new Student(106,"dharshu",19,"USA visa Study");  
  s6=new Student(107,"papa",19,"Educational Scholorship"); 
  al2.add(s4);
  al2.add(s5);  
  al2.add(s6);  
  al.addAll(al2);
  this.display();   
}
public void removeAll()
{
  this.display();
  al.removeAll(al2);
  this.display();
}
public void retainAll()
{
  al.retainAll(al2);
  this.display();
}
public void remove(int index)
{
  al.remove(index);
  this.display();
}
public void clearAll()
{
  al.clear();
  al2.clear();
}

 } //end of class    
 
 
 
 