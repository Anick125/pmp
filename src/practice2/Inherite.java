package practice2;

public class Inherite extends Abstraction{
	
	public void multiply (int a, int b) {
		int num = (a/b);
		
		System.out.println(num);
	}
	public void bank (double x, double y) {
		double num2 = x-y;
		System.out.println(num2);
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Abstraction a1 = new Abstraction ();
		
		a1.multiply (10,10,10);
		a1.percent (100,15);
		a1.multiply (1000,50);
		 a1.bank (1001,50);
		a1.nam ("name","name");
		a1.name ("names","names");
		 Inherite i1 = new  Inherite ();
		 i1.multiply (90,9);
		i1.bank (1001,50);
	} 

}
