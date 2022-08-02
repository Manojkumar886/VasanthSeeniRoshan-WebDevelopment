package Thread;

public class First01 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("welcome to Thread Concept");
			try {
				
				Thread.sleep(2000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		First01 obj=new First01();//Thread
		obj.start();
		

	}

}
