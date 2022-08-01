package Threads;

public class MultiThreadinng {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		game game=new game();
//		Runnable game=new game();
		Runnable game=new Runnable() {
			public void run()
			{
				for(int i=1;i<=5;i++)
				{
					System.out.println("kabaddi is my state game");
				try {
					Thread.sleep(2000);
				}
				catch (InterruptedException e) {}
				}
			}
		};
		
		Thread t1=new Thread(game);
		Mobileapp mob=new Mobileapp();
		t1.setName("Book1");
		System.out.println(t1.getName());
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.getPriority());
		t1.start();//thread
		mob.start();//thread
		
		
		t1.join();
		mob.join();
		if(t1.isAlive())
		{
			System.out.println("Thread is available");
		}
		System.out.println("Thank you");

	}

}
//class game implements Runnable
//{
//	public void run()
//	{
//		for(int i=1;i<=5;i++)
//		{
//			System.out.println("kabaddi is my state game");
//		try {
//			Thread.sleep(2000);
//		}
//		catch (InterruptedException e) {}
//		}
//	}
//}
class Mobileapp extends Thread
{
	public void run()
	{
		for (int i=1;i<=5;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}