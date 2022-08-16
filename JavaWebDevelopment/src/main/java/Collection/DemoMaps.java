package Collection;

import java.util.Hashtable;

public class DemoMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String,Mobile> owners=new Hashtable<String,Mobile >();
		Mobile mob1=new Mobile("Realme1", 4, 64, 12000.0) ;
		Mobile mob2=new Mobile("Redmi note 5", 2, 32, 8000.0) ;
		Mobile mob3=new Mobile("Nokia6.1", 8, 128, 22000.0) ;
		Mobile mob4=new Mobile("Samsung", 6, 64, 18000.0) ;
		
		owners.put("Rishi",mob4);
		owners.put("Manojkumar", mob1);
		owners.put("Sadham", mob2);
		owners.put("Kaleem", mob3);
		System.out.println(owners);
		
		System.out.println(owners.containsKey(mob4));
		
		

	}

}
