package in.mindcraft;

public class Employee {
	private int empid;
	private String name;
	private Date dob;
	
	
	/*
	public Employee(int empid, String name, Date dob) {
		super();
		this.empid = empid;
		this.name = name;
		this.dob = dob;
	}
	*/
	public Employee() {  //new employee
		empid=101;
		name="abc";
		dob=new Date();
	}
	
	public Employee(int id,String n,int d, int m, int y)// id,name,dob
	{
		
		empid=id;
		name=n;
		dob=new Date(d,m,y);
	}
		
public void show() {
	System.out.println(empid);
    System.out.println(name);
dob.show();
  }
		
		
	}
	
	
	





