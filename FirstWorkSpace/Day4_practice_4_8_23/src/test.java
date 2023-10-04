

 class Employee {
   private int empid;
   private String name;
   private double salary;
   
 
   public Employee() {
	
	}
   
public Employee(int empid, String name, double salary) {
	//super();
	this.empid = empid;
	this.name = name;
	this.salary=salary;
}


public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public void display() {
	System.out.println(empid+"\n"+name+"\n"+salary);
	
}



}


class Manager extends Employee {

	public  Manager() {
	super();
	}
	
	public  Manager(int empid,String name,double salary) {
	super(empid,name,salary);
	//this.salary=salary;
	}
	
		
	double PetrolAllowance=(super.getSalary())*(0.08);
	
	double FoodAllowance=(super.getSalary())*(0.12);
		
	double OtherAllowance=super.getSalary()*(0.04); 

		
		
		/* gross salary = basic salary + allowances
		net salary = gross salary - PF
		PF = 12.5% of basic salary*/
	
	  	public double pf() { 
		return super.getSalary()*0.125;
	}
	
		public double grossSalary() {
		return super.getSalary()+PetrolAllowance+FoodAllowance+OtherAllowance;
		}
		
		public double netsalary(){
		return grossSalary()-pf();
		}
		
		public void show() {
			
			//System.out.println("empid,name,salary : ");
			System.out.println("Allowance: \n"+PetrolAllowance+"\n"+FoodAllowance+"\n"+OtherAllowance);
			
			
		}
}


/*      a. Kilometers travelled
		b. Tour Allowance: Rs.5/- per kilometer
		c. Telephone Allowance Rs.2000/-
		*/

class MarketingExecutive  extends Employee{
public  int kms;
private int tourA;
private int tele;

public MarketingExecutive() {
	
}

 	public MarketingExecutive(int empid,String name,double salary,int k,int tourA,int t) {
 		super();
 		kms=k;
 		tourA=5*k;
 		tele=t;
 	}

 	
    double PetrolAllowance=(super.getSalary())*(0.08);
	
	double FoodAllowance=(super.getSalary())*(0.12);
		
	double OtherAllowance=(super.getSalary())*(0.04); 

	//ManagerExecutive
	
 	double pf(){
 	return super.getSalary()*0.125;
 	}
 	
	double grossSalary()
	{
		return super.getSalary()+PetrolAllowance+FoodAllowance+OtherAllowance+tourA+tele;
	}
	
	double netsalary() {
		return (grossSalary())-(pf());
	}
	
	public void show() {
		System.out.println("pf: "+pf());
		System.out.println("grossSalary: "+grossSalary());
		System.out.println("netsalary: "+netsalary());
		
	}

}
 
public class test {
public static void main(String args[])
		{
	//Employee e=new Employee(123,"Augt", 20000);
	 //e.display();
	 
	 System.out.println("\n Manager: ");
	 Manager m=new Manager(232,"checkus",89000);
	 System.out.println("\n netSalary:"+m.netsalary());
	 System.out.println("\n grossSalary:"+m.grossSalary());
	 m.show();
	 
	 System.out.println("Marketing Executive: \n");
	 MarketingExecutive me=new MarketingExecutive(23,"exection",45000,4,20,2000);
	 me.show();
	// me.grossSalary();
	 
	 
		}
}



