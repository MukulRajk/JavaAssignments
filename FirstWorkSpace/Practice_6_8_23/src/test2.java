// parent
class test3 {
private int id;
private String name;
private double marks;

//default constructor
public test3() {
	id=0;
	name="";
	marks=0;
}

//parameterized constructor
public test3(int id, String name, double marks) {
	//super();
	this.id = id;
	this.name = name;
	this.marks = marks;
}

public double getMarks() {
	return marks;
}

public void setMarks(double marks) {
	this.marks = marks;
}

public void show() {
	System.out.println(id+" "+name+" "+marks);
}

}


// child
class percentage extends test3{
	//private double marks;


public percentage() {
super();	
}

public percentage(int id, String name, double marks) {
	super(id,name,marks);
	//percent=p;
}


public double showPercent() {
	//double p;
	return (super.getMarks()*100/500);
	
	
}
/*
public void show() {
	System.out.println("percentage: "+showPercent());
}
*/

}
public class test2
{
	public static void main(String args[]) {
		
		test3 t=new test3(1,"geek",56);
		t.show();
		
		System.out.println("\n percentage:");
		percentage per=new percentage(3,"geeks",400);
		per.show();
		per.showPercent();
		
		
		
	}
}


