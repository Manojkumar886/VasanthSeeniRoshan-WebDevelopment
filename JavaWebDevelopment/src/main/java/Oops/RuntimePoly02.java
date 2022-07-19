package Oops;

public class RuntimePoly02 extends RuntimePoly01
{
	public void sports()
	{
		System.out.println("favouiate cricket player is MSD");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RuntimePoly02 poly=new RuntimePoly02();
		poly.sports();
		poly.sports();
		RuntimePoly01 poly01=new RuntimePoly01();//another class object
		poly01.sports();

	}

}
