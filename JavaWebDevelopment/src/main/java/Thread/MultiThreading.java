package Thread;

public class MultiThreading {

	public static void main(String[] args) throws InterruptedException {//Thread
		// TODO Auto-generated method stub
		book bk=new book();//Thread
		if(bk.isAlive())
		{
			System.out.println("still working");
		}
		bk.start();//normal thread class
		Note nt=new Note();
//		Runnable obj=new note()
//		{
//			
//		}
		
		//anonmous
//		Runnable obj1=new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
		
		
		Thread th=new Thread(nt);//Implements runnable
		th.start();
		bk.join();
		th.join();
		bk.setName("StoryBook");
		System.out.println(th.getId());
		System.out.println(bk.getId());
		System.out.println(bk.getName());
		System.out.println(bk.getPriority());
		System.out.println("Bye bye");
		
		
	}

}
class book1 extends Thread
{
	public void run()
	{
		for(int a=0;a<=5;a++)
		{
			System.out.println("Book is Updated");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
	}
	
}

class book extends Thread
{
	public void run()
	{
		for(int a=0;a<=5;a++)
		{
			System.out.println("Book is Updated");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
	}
	
}

class Note implements Runnable
{
	public void run()
	{
		for(int a=0;a<=5;a++)
		{
			System.out.println(a);
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
	}
	
}
