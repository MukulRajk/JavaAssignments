

class Vehicle implements Cloneable
{
	private String vehNumber;
	private String vehName;
	private int vehPrice;
	
	public Vehicle() {
	}
	
	
	public Vehicle(String vehNumber, String vehName, int vehPrice) {
		//super();
		this.vehNumber = vehNumber;
		this.vehName = vehName;
		this.vehPrice = vehPrice;
	}
	
public  Object clone() throws CloneNotSupportedException
{
	return super.clone();
}

public void show() {
	System.out.println(vehNumber+"\n"+vehName+"\n"+vehPrice);
}

}


public class clone_concept {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Vehicle v=new Vehicle("MH78 5367 87","TATA",89877);
		v.show();
		
		System.out.println("Clone concept"+"\n");
		
		Vehicle v1=(Vehicle) v.clone();
		v1.show();
		

	}

}


