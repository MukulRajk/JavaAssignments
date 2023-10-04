

	class Laptop2{
		private int lid;
		private String make;
		private double cost;
private static int cnt;
	
//add cnt to count
	public Laptop2(){   // default constructor
		lid=101;
		make="ASUS";
		cost=87400;
		cnt++;
	}
	
	//add cnt to count objects
	
	public Laptop2(int lid,String make, double cost) { //parameterized constructor
	this.lid=lid;   //this -refere to laptop->private->lid
	this.make=make;
	this.cost=cost;
	cnt++;
	
	}
	
	//schowcnt
	public static  void showCnt() {
		System.out.println("No. of objects: "+cnt);
	}
	
	
	public void show() {
		System.out.println(lid+" "+make+" "+cost);
	}
	
	}
	
	
	//main method
	
	public class tester2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//Laptop l3=new Laptop(102,"Asus",89700);
			//System.out.println(l3.getCost());
			//l3.setCost(88000);
			//l3.show();
		Laptop2.showCnt();
		}


	}