package Oops;

class home
{
	public void book()
	{
		System.out.println("reading and writing");
	}
}
public class TestEncapsulation {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		student stu=new student();
		home obj=new home();
		obj.book();
		stu.setAge(22);
		System.out.println(stu.getAge());
	}

}
//Encapsulation:
//-------------
//
//Encapsulation is a mechanism of the wrapping the data(Variables and  code action on the method(assume the variable) 
//together as single unit..
//
//achieved to steps:(rules)
//1.Declare the variable of a class as private......
//2.Provide public getter setter method..(to modify and view the variable values).....
//
//
//
//Abstraction:
//------------
//hiding the implementation details and shown only funtionality to the user...
//example:car-gear,brake,horn........
//
//Achieved steps:
//1.must be used in abstract keyword...
//2.a method is without (no implementation) is known as abstract method
//
//
//interface:
//
//Interface class is assigned complesary interface keyword......
//achieved by implements..........
//it is used to achieved abstraction method and then most important topic is multiple inheritance.......!
//
//
//why to use interface in jave...
//1.it is used to abstraction....
//2.we can support functionality and the multiple inheritance
//3. that is used by loose coupling...........
//
//
//declare the interface class:
//
//interface <classname>
//{
////declare abstract method...
//
////statement
////fields......
//}
//
//class--->class=Extends keyword use
//interface---->class=Implements keyword use
//interface---->interface=extends keyword use
