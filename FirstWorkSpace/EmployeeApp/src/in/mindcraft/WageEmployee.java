package in.mindcraft;

public class WageEmployee extends Employee {
 
	private int hours;
	private int rate;
	
	
	public WageEmployee() {     //super
		super();
		hours=0;
		rate=0;
	
	//System.out.println("wage employee constructor");
	}
	
	public WageEmployee(int id,String n, int d, int m, int y,int h,int r) {
		super(id,n,d,m,y);                //super
		hours=h;
		rate=r;
	}
	
	
	public int calSalary() {
		return hours*rate;
	}
	
	
	public void show() {
		super.show() ;                //super==parent class
		System.out.println(hours);
		System.out.println(rate);
	}
	
	


}
