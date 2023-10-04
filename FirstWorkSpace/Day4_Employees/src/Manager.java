
public class Manager extends Employee {

	
	public  Manager() {
	super();
	}
	
	public  Manager(int empid,String name,double salary) {
	super(empid,name,salary);
	//this.salary=salary;
	}
	
	/*
	a. Petrol Allowance: 8% of basic salary
	b. Food Allowance: 12% of basic salary
	c. Other Allowance: 4% of basic salary
	*/
	
	
	
	
		
		double PetrolAllowance=super.getSalary()*(0.08);
	
	/* public int calSalary() {
		return hours*rate;
	}*/
	
	double FoodAllowance=super.getSalary()*(0.08);
		
	
	
	
	double OtherAllowance=super.getSalary()*(0.08); 

		
		
		/* gross salary = basic salary + allowances
		net salary = gross salary - PF
		PF = 12.5% of basic salary*/
	double pf=super.getSalary()*0.125;
	
		double grossSalary=super.getSalary()+PetrolAllowance+FoodAllowance+OtherAllowance;
		double netsalary=super.getSalary()+grossSalary-pf;
		
		public void show() {
			System.out.println("pf: "+pf);
			System.out.println("grossSalary: "+grossSalary);
			System.out.println("netsalary: "+netsalary);
			
			
		}
}
