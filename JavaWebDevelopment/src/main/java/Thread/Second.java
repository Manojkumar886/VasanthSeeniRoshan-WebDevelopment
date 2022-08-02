package Thread;

public class Second  implements Runnable
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Second obj1=new Second();
		Thread th=new Thread(obj1);//object creation in thread class
		th.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	System.out.println("this is another method in thread creation");
	}

}
