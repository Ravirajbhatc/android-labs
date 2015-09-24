package office;
import java.lang.reflect.*;
import java.lang.*;
import java.util.*;

public class sample{
public static void main(String[] arg)
{
try{
Class rental = office.class;
String r1 = rental.getName();
System.out.println("class name: "+r1);
String r2 = rental.getSimpleName();
System.out.println("class name without package: "+r2);

System.out.println("package name: "+rental.getPackage());

Constructor[] cons = rental.getConstructors();
System.out.println("constructors are: "+Arrays.toString(cons));
Constructor cons1 = rental.getConstructor(Integer.TYPE);
office rent = (office)cons1.newInstance(455);
Method method = rent.getClass().getMethod("gettime");
System.out.println(method.invoke(rent));
Method[] allmethod = rental.getMethods();
System.out.println("methods are: "+Arrays.toString(allmethod));
	for(Method m1 : allmethod)
	{
		System.out.println("method : "+m1.getName());
	}
	    //List<Field> privateFields = new ArrayList<>();
    Field[] allFields = office.class.getDeclaredFields();
    for (Field field : allFields) {
        if (Modifier.isPrivate(field.getModifiers())) {
           // privateFields.add(field);
            System.out.println(field.toString());
        }
    }

Method s = rental.getDeclaredMethod("hello", null);
System.out.println("method getDeclaredMethod = " + s.toString()); 


		Field f1 = rental.getField("time");
		 f1.setAccessible(true);
		f1.set(rental,5);
		//int str1 = (int)f1.get(rental);
		int f4 = (int)f1.get(rental);
		System.out.println(f4);
Method m = rental.getMethod("hello", null);
System.out.println("method = " + m.toString());  




}catch(Exception e){
	System.out.println("e"+e.toString());
}
    }
}