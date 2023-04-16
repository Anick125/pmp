package Abstractconceptpractice;

public class getnset {

	private int p;
	public int getname () {
		return p;
		
		
		
	}
	public void setname (int sum) {
		
		this.p = sum;
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getnset g1 = new getnset();
		g1.setname (10);
		System.out.println(g1.getname ());
		
		
		
		
	}

}
