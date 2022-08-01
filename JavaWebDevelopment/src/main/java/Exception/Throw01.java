package Exception;

public class Throw01 {
	public static void checkage(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("it is not eligible for voting");
		}
		else
		{
			System.out.println("eligible for voting");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throw01 th=new Throw01();
		th.checkage(7);

	}

}
