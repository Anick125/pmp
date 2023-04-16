package Abstractconceptpractice;

public abstract class Bank {

	//partial abstraction
	//hiding the implementation logic
	// abs class can have abs method and non abs method
	//cannot create the object of abs class4
	
	public abstract void loan(); //abstract method
	
	
	
	public void credit() {
		System.out.println("anick");
	}
		
		
		public void debit () {
			
			System.out.println("akash");
			
		}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
