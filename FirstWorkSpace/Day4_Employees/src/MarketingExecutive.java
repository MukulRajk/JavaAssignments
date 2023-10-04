
/* a. Kilometers travelled
		b. Tour Allowance: Rs.5/- per kilometer
		c. Telephone Allowance Rs.2000/-
		*/

public class MarketingExecutive  extends Employee{
private int km;
private int tourA;
private int tele;

public MarketingExecutive() {
	
}

 	public MarketingExecutive(int empid,String name,double salary,int km,int tourA,int tele) {
 		super();
 		this.km=km;
 		tourA=km*5;
 		tele=2000;
 	}

 	/*gross salary = basic salary + allowances
 			net salary = gross salary - PF
 			PF = 12.5% of basic salary */
 	
    double PetrolAllowance=super.getSalary()*(0.08);
	
	/* public int calSalary() {
		return hours*rate;
	}*/
	
	double FoodAllowance=super.getSalary()*(0.08);
		
	
	
	
	double OtherAllowance=super.getSalary()*(0.08); 

 	
 	
 	double pf=super.getSalary()*0.125;
	
	double grossSalary=super.getSalary()+PetrolAllowance+FoodAllowance+OtherAllowance+tourA+tele;
	double netsalary=super.getSalary()+grossSalary-pf;
	
	public void show() {
		System.out.println("pf: "+pf);
		System.out.println("grossSalary: "+grossSalary);
		System.out.println("netsalary: "+netsalary);
		
		
	}

}