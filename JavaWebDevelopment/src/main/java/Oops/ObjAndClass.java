package Oops;
//OOps concept-object oriented programming languages.
//java is oops languages.
//
//adavantages
//time complexity
//security purpose 
//
//topic covered by oops
//
//1.object
//2.class
//3.Inheritance---(Interface)
//4.Polymorphism
//5.Encapuslation
//6.Abstraction
//
//
//object and class
//
//class - object
//
//home blueprint--house
//
//
//class:
//class is a group of object which has common properties.template(class)
//class doesnt consume any space.
//contains: method,field,block,constructor,nested class.
//syntax:
//class<class-name>
//{
//field//declared the variable value assume.
//methods//
//}
//
//object:
//an entity that has known as state and behaviour and then unique id.
//
//An object has three chararcteristic-example (dog)
//State-value(age,generated,colour)
//behaviour-functionality(food,bark)
//identity-unique id(dog).
//new--allocated memory at
//syntax:
//classname object(reference variable)=new classname();
//reference variable used for adding the methods.

public class ObjAndClass {
	
	public void yet()
	{
		System.out.println("Local Variable");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjAndClass obj=new ObjAndClass();//object  creation..more then object created in one class
		obj.yet();
		

	}

}
