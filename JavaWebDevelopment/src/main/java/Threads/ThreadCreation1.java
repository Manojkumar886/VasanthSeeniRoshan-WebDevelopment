package Threads;

public class ThreadCreation1 extends Thread
{
	public void run()
	{
		System.out.println("Tamilnadu is political state ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadCreation1 th=new ThreadCreation1();
		th.start();
	}

}


//Thread:
//1.light weight smallest part of the process...
//2.run concurrently with the other parts of the same process...
//3.separate part of execution... so if there is an exception one thread
//   it doesnt affect execution of other threads
//4.share common memory
//
//why multithreading..?
//
//.........process of executiing multiple threads simultaneously is called multhreading.
//.........to maximun the cpu utilization time.
//
//
//created thread....life cycle of thread
//new-->ruunable--->blocked--->waiting--->timed-waiting---->terminated.
//
//creating a thread in java-two method
//--------------------------
//1.By extending thread class-extends Thread
//2.by implementing Runnable Interface-implement Runable
//
//
//
//Thread class Methods(default)
//
//getName()-displayed thread name
//getpriority()-display a thread priority------min getpri0,max getpti10,default 5
//isAlive()-particular thread is executed or available or terminated
//join()-it will wait for a thread in terminated
//run()-currently running-executed starting
//sleep()-thread is sleep for particular amount of time(millisecond)
//start()-it will call the run method..