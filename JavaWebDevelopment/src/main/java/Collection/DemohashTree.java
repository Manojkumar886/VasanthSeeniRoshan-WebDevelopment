package Collection;

import java.util.HashSet;
import java.util.TreeSet;

public class DemohashTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Character> obj1=new HashSet<Character>();
		TreeSet<Character> obj2=new TreeSet<Character>();
		obj1.add('A');
		obj1.add('B');
		obj1.add('B');
		obj1.add('D');
		obj1.add('E');
		obj1.add('F');
		System.out.println("Hash set values"+obj1);
		obj2.addAll(obj1);
		System.out.println("Tree set Values"+obj2);

	}

}
