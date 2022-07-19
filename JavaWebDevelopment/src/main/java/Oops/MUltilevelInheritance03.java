package Oops;

public class MUltilevelInheritance03 extends MultilevelInheritance02
{
	public void eating()
	{
		System.out.println("Animals eating anything");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MUltilevelInheritance03 over=new MUltilevelInheritance03();
		over.eating();
		over.monkey();
		over.animal();

	}
}
