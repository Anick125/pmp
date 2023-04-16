package Abstractconceptpractice;

public class getnsetp {

	private int a;
	public int getname () {
		return a;
		
		
	}
	public void setname (int sum) {
		
		this.a = (sum);
		
		
	}
	
	
	private String x;
	public String getnames () {
		return x;
		
		
	}
	
	public void setnames (String anick) {
		this.x = (anick);
		
		
		
		
	}
	
	
	private boolean p;
	public boolean getname1 () {
		
		return p;
		
		
	}
	public void setname1 (boolean sum) {
		
	this.p = (sum);
		
		
		
		
	}
	
	private int w;
	public int getname2 () {
		
		return w;
		
		
		
		
	}
	
	
	public void setname2 (int sum) {
		
		this.w = (sum);
		
	}
	
	private int s;
	public int getnames3 () {
		
		return s;
		
		
	}
	public void setnames3(int sum) {
		
	this.s = sum;
		
		
	}
	private int o;
	public int get () {
		return o;
	}
	public void set (int num) {
		this.o = num;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getnsetp g1 = new getnsetp ();
		g1.setname (100);
		System.out.println(g1.getname());
		
		g1.setnames("anick");
		System.out.println(g1.getnames());
		
		g1.set(1);
		System.out.println(g1.get());
	}

}
