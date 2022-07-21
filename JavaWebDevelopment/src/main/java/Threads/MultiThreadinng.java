package Threads;

public class MultiThreadinng {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		game game=new game();
		Mobileapp mob=new Mobileapp();
		game.start();//thread
		mob.start();//thread
		if(game.isAlive())
		{
			System.out.println("Thread is available");
		}
		game.join();
		System.out.println("Thank you");

	}

}
class game extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("kabaddi is my state game");
		try {
			Thread.sleep(5000);
		}
		catch (InterruptedException e) {}
		}
	}
}
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