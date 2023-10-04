
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
