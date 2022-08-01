package Threads;

public class ThreadCreation2 implements Runnable
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadCreation2 obj1=new ThreadCreation2();
		Thread obj=new Thread(obj1);
		obj.start();
		Thread.currentThread().setPriority(9);
		Thread.currentThread().getId();
		System.out.println(Thread.currentThread().getPriority());

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("implement runnable method is created by thread");
	}

}
