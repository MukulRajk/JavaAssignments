package com.mindcraft.pack1;

public class Student {
   
	private  int roll_no;
	private String name;


//add cnt to count
public Student(){   // default constructor
	roll_no=101;
	name="ASUS";
	}

//add cnt to count objects


//schowcnt
public static  void showData() {
	System.out.println(roll_no+" "+name);
}




}

public class tester2 {

	public static void main(String[] args) {
		
		Student l1=new Student();
		Student l2=new Student(104,"harish");

		
		l1.show();
		l2.show();
		
 Student.showData();
	}


}

