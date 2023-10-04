import in.mindcraft.*;

public class Tester {

	public static void main(String args[])
	{
		//int CalcSalary;
		/*Employee e1=new Employee();
		e1.show();
		
		System.out.println();
		
		Employee e2=new Employee(222,"Raja",10,10,1995);
		e2.show();
		*/
		
		//WageEmployee we=new WageEmployee(121,"ANGUlar",19,10,1999,10,2000);
		//we.show();
		
		
		SalesPerson s=new SalesPerson(121,"jay",23,2,1980,3,4,7,7);
		s.show();
		
		System.out.println("Salary:"+s.calSalary());
		
		
		Employee e1=new WageEmployee(123,"wages",23,1,2087,3,4);
		e1.show();
		//superclass-> subclass
		
		
		
		//int CalcSalary;
		
		//CalcSalary=hours*rate+sales*comm;
		//System.out.println("SAlARY: "+CalcSalary);
	}
}


