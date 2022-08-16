package Collection;

import java.util.TreeSet;

public class TreesetCompareto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Mobile> Poorvika=new TreeSet<Mobile>();
		Poorvika.add(new Mobile("Realme1", 4, 64, 12000.0));
		Poorvika.add(new Mobile("Redmi note 5", 2, 32, 8000.0));
		Poorvika.add(new Mobile("Nokia6.1", 8, 128, 22000.0));
		Poorvika.add(new Mobile("Samsung", 6, 64, 18000.0));
		Mobile mob=new Mobile("Redmi note 8", 4, 32, 14000.76767);
		Poorvika.add(mob);
		System.out.println(Poorvika);		//connect with compareto method
	}

}


class Mobile implements Comparable<Mobile>
{
	String name;
	Integer ram,internal;
	Double price;

	
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Mobile(String name, Integer ram, Integer internal, Double price) {
		super();
		this.name = name;
		this.ram = ram;
		this.internal = internal;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Mobile [name=" + name + ", ram=" + ram + ", internal=" + internal + ", price=" + price + "]";
	}


	@Override
	public int compareTo(Mobile o) {
		// TODO Auto-generated method stub
		return o.price.compareTo(this.price);
	}
}