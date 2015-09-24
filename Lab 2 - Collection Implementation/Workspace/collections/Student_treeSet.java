package collections;
public class Student_treeSet implements Comparable<Student_treeSet>{  
  
  public int rollno;  
  public String name;  
  public int age;
  public String reason;  
  
  public Student_treeSet(int rollno,String name,int age,String reason){  
   this.rollno=rollno;  
   this.name=name;  
   this.age=age;
   this.reason = reason;  
  } 
  public int compareTo(Student_treeSet o) {
        return rollno - o.rollno;
    }
}  