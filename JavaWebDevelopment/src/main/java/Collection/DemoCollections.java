package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class DemoCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list=new ArrayList<String>();
		list.add("Manojkumar");
		list.add("Rishi");
		list.add("Manikandan");
		list.add("Sadham");
		list.add("Kaleem");
		System.out.println("Values"+list);
		
		Collections.sort(list);
		System.out.println("Sorted values"+list);
		Collections.reverse(list);
		System.out.println("reverse the orders"+list);
		Collections.replaceAll(list, "Manojkumar","Manoj");
		System.out.println("replaced values"+list);

	}

}
