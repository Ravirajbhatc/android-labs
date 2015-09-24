package collections.arraylist;
import collections.*;
public class eg
{
	public static void main(String[] args) {
		arraylist h = new arraylist();
		Student s = new Student(101,"shivasurya",19,"Educational loan"); 
		h.create();
		System.out.println("-------------------------------------");
		h.display();
		System.out.println("-------------------------------------");
		h.backward();
		System.out.println("-------------------------------------");
		h.contains(s);
		System.out.println("-------------------------------------");
		h.addAll();
		System.out.println("-------------------------------------");
		h.size();
		System.out.println("-------------------------------------");
		h.retainAll();
		System.out.println("-------------------------------------");
		h.remove(1);
		System.out.println("-------------------------------------");
		h.removeAll();
		h.create();
		h.display();
		h.clearAll();
		h.display();

	}
}