package collections.linkedhashset;
import collections.*;
public class eg
{
	public static void main(String[] args) {
		linkedhashset h = new linkedhashset();
		Student_Set s = new Student_Set(105,"shivasurya",19,"Educational loan"); 
		h.create();
		System.out.println("-------------------------------------");
		h.display();
		System.out.println("-------------------------------------");
		h.contains(s);
		System.out.println("-------------------------------------");
		h.addAll();
		System.out.println("-------------------------------------");
		h.size();
		System.out.println("-------------------------------------");
		h.retainAll();
		System.out.println("-------------------------------------");
		h.remove(s);
		System.out.println("-------------------------------------");
		h.removeAll();
		h.create();
		h.display();
		h.clearAll();
		h.display();

	}
}