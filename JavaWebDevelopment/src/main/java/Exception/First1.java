package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class First1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the two values");
		try
		{
			int yet=scan.nextInt();
			int yets=scan.nextInt();
			System.out.println(yet/yets);
		}
		catch (InputMismatchException e) 
		{
			System.out.println("please enter only numeric values");		
		}
		catch(ArithmeticException ar)
		{
			//System.out.println(ar);
			
		}
	}

}
