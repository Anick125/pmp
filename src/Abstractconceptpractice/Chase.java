package Abstractconceptpractice;

public class Chase  extends Bank{

	
	
	public void loan () {
		System.out.println("loan");
		
	}
	
	public void fun () {
		
		System.out.println("fun");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Chase b1 = new Chase();
		
		b1.debit ();
		b1.fun ();
		
	}

}
