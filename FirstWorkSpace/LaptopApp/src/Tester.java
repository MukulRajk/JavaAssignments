/*
 abstraction - process of identifying key attributes of an entity and ignoring rest of the attributes
 
 encapsulation - 
 */
class Laptop{
	private int lid;
	private String make;
	private double cost;
	
	
	public Laptop(){   // default constructor
		lid=101;
		make="ASUS";
		cost=87400;
	}
	public Laptop(int lid,String make, double cost) { //parameterized constructor
	this.lid=lid;   //this -refere to laptop->private->lid
	this.make=make;
	this.cost=cost;
	
	
	}

	public int getLid()
	{
		return lid;
	}
	
	public void setLid(int lid) {
		this.lid=lid;
	}
	
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make=make;
		
	}
	
	public double getCost() {
		return cost;
	}
	
	public void setCost(double cost) {
		this.cost=cost;
	}
	
	public void show() {
		System.out.println(lid+" "+make+" "+cost);
	}
	
	
	


}

public class Tester {

	public static void main(String[] args) {
		
		
		Laptop l3=new Laptop(102,"Asus",89700);
		System.out.println(l3.getCost());
		l3.setCost(88000);
		l3.show();
	}


}
