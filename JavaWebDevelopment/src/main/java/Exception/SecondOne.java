package Exception;

public class SecondOne {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try {
			//Thread.sleep(10000);//thread is class,sleep is thread default method
			System.out.println("welcome");
			int a=10;
			int b=0;
			int c=a/b;
		} 
		catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			System.out.println("end of the program");
		}
		
	}

}
