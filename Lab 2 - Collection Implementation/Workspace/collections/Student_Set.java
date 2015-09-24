package collections;
public class Student_Set{  
  
  public int rollno;  
  public String name;  
  public int age;
  public String reason;  
  
  public Student_Set(int rollno,String name,int age,String reason){  
   this.rollno=rollno;  
   this.name=name;  
   this.age=age;
   this.reason = reason;  
  } 
  public int hashCode(){
        
        int hashcode = 0;
        hashcode = (int)(Long.valueOf(this.rollno)%100);
        System.out.println("Hashcode ==>"+hashcode);
        return hashcode;
    }
     
    public boolean equals(Object obj){
      
        if (obj instanceof Student_Set) {
            Student_Set pp = (Student_Set) obj;
            return (pp.name.equals(this.name) && pp.rollno == this.rollno && pp.age == this.age);
        } else {
            return false;
        }
    }
}  