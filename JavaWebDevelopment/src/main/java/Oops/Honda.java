package Oops;

public class Honda extends BikeAbstract 
{
//	public void run()
//	{
//		System.out.println("Honda is goood safety and good mileage process bike");
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BikeAbstract bike=new Honda();//upcasting
		bike.run();
		

	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	void run() {
//		// TODO Auto-generated method stub
//		System.out.println("nonono");
//	}

}
