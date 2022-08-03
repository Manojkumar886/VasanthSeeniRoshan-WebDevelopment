package Collection;

import java.util.Stack;

public class DemoStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack obj=new Stack();//Generic
		obj.push("Manojkumar");
		obj.push("Manojkumar");//dublicates values allowed
		obj.push('A');
		obj.push(9789355930L);
		obj.push(true);
		obj.push(4.5f);
		System.out.println(obj);
		
		obj.pop();//only delte for last element
		System.out.println(obj);
		System.out.println(obj.empty());
		System.out.println(obj.peek());
		System.out.println(obj.search('A'));
	}

}
