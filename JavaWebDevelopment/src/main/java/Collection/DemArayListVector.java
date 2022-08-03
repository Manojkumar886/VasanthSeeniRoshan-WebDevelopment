package Collection;

import java.util.ArrayList;
import java.util.Vector;

public class DemArayListVector {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList obj1=new ArrayList();
		obj1.add("Manojkumar");
		obj1.add(true);
		obj1.add(789876);
		obj1.add(7.8);
		obj1.add(976545654556L);
		Vector obj2=new Vector();
		obj2.addAll(obj1);
		
		System.out.println("Arraylist values :"+obj1);
		System.out.println("Vector Values :"+obj2);
		obj2.remove(3);
		obj1.set(0, "Rishi");
		System.out.println("Arraylist values :"+obj1);
		System.out.println(" Values :"+obj2);
		
		obj2.removeAll(obj1);
		System.out.println("Arraylist values :"+obj1);
		System.out.println("Vector Values :"+obj2);
		
		obj2.retainAll(obj1);
		System.out.println("Arraylist values :"+obj1);
		System.out.println("Vector Values :"+obj2);
		
		
		
		
		
		
	}

}
