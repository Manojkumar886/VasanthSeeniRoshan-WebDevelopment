package Interfacess;

public class TesterMultiple 
{
	public static void main(String[] args) {
		Sports sp=new Sports() {
			
			@Override
			public void start() {
				// TODO Auto-generated method stub
				System.out.println("Something");
			}
			
			@Override
			public void game() {
				// TODO Auto-generated method stub
				System.out.println("over the match");
			}
		};
		sp.game();
		sp.start();
	}

}
