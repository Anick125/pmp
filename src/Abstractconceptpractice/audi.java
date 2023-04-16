package Abstractconceptpractice;

public class audi implements car {
	
	
	
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("start");
		
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
		System.out.println("stop");
		
	
	}
public void add () {
	
}
	public static void main (String[]args) {
		
		audi a1 = new audi();
		a1.start ();
		a1.stop();
		
		
	}
	
	
}
