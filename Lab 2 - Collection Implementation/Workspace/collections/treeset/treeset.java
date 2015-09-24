package collections.treeset;

import collections.Student_treeSet;
import java.util.*;
public class treeset{ 

  public Student_treeSet s1,s2,s3,s4,s5,s6;
  public TreeSet<Student_treeSet> al=new TreeSet<Student_treeSet>();
  public TreeSet<Student_treeSet> al2=new TreeSet<Student_treeSet>();

  public treeset(){ 
    s1=new Student_treeSet(101,"shivasurya",19,"Educational loan");  
    s2=new Student_treeSet(102,"papa",19,"Scholorship Loan");  
    s3=new Student_treeSet(103,"pinku papa",18,"USA Visa"); 
  }
  
  public void create()
  {
   al.add(s2);  
   al.add(s3);
   al.add(s3); //added a duplicate 
   al.add(s1); //reorder testcase 
 }

 public void display()
 {
 	Iterator itr=al.iterator();  
  System.out.println("Roll"+" "+" Name"+" "+"Age"+" "+"reason");
  while(itr.hasNext()){  
    Student_treeSet st=(Student_treeSet)itr.next();  
    System.out.println(st.rollno+"-"+st.name+" -"+st.age+"-"+st.reason);  
  }	
}
public void contains(Student_treeSet s)
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
  s4=new Student_treeSet(105,"shivasurya",19,"USA visa and JOB");  
  s5=new Student_treeSet(106,"dharshu",19,"USA visa Study");  
  s6=new Student_treeSet(107,"papa",19,"Educational Scholorship"); 
  al2.add(s4);
  al2.add(s5);  
  al2.add(s6);  
  boolean b = al.addAll(al2);
  System.out.println("boolean=>"+b);
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
public void remove(Student_treeSet s)
{
  al.remove(s);
  this.display();
}
public void clearAll()
{
  al.clear();
  al2.clear();
}

} //end of class    



