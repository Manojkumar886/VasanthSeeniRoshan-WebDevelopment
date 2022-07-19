package Oops;
//method overloading
public class CompiletimePoly {
	
	public void superhero()
	{
		System.out.println("Spiderman");
	}
	public void superhero(int a)
	{
		System.out.println("this is web development class");
	}
	public void superhero(String name)
	{
		System.out.println("seenivasan,paul roshan,vasanth");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompiletimePoly poly=new CompiletimePoly();
		poly.superhero();
		poly.superhero("Manoj");
		poly.superhero(5);
		

	}

	
}
