package Exception;

public class Throws {
	public static int compare(int a,int b)throws ArithmeticException,NullPointerException
	{
		int t=a/b;
		return t;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Throws ts=new Throws();
		try
		{
//			int a=10;
//			int b=0;
//			int t=a/b;
//			System.out.println(t);
			System.out.println(ts.compare(12, 0));
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("you should't divided by zero");
		}
		
	}

}
