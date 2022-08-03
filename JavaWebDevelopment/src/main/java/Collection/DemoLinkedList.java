package Collection;

import java.util.LinkedList;

public class DemoLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> link=new LinkedList<Integer>();//non-generic 
		link.add(12345);
		link.add(3456);
		link.add(345);
		link.add(12345);
		link.add(45);
		link.add(5);
		link.addFirst(434);
		System.out.println(link);
		link.remove(5);
		System.out.println(link);
//		link.getFirst();
		System.out.println("first element is :"+link.getFirst());
		link.set(1, 54321);
		System.out.println("Changed Values :"+link.get(1));
//		link.clear();
//		System.out.println("Clear the values"+link);
	}

}
