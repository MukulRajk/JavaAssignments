
//Account Number, Name and Account Balance 

import java.util.Scanner;

class bank{
	private int AccNo;
	private String Name;
	private double Balance;

	
	public bank(int accNo, String name, double balance) {
		super();
		AccNo = accNo;
		Name = name;
		Balance = balance;
	}


	public int getAccNo() {
		return AccNo;
	}


	public void setAccNo(int accNo) {
		AccNo = accNo;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public double getBalance() {
		return Balance;
	}


	public void setBalance(double balance) {
		Balance = balance;
	}

	public  void show() {
		System.out.println("A/c Number :"+AccNo+"\n Account Holder Name : "+Name+"\n Balance :"+Balance);
		
	}
	
}











public class CaseStudy {

	public static void main(String[] args) throws NullPointerException {
Scanner sc=new Scanner(System.in);
int choice,count=0;
bank[] b=new bank[1000];

System.out.println("Welcome to Bank");
while(true) {
	System.out.println("Enter your Choice : ");
	System.out.println("1.Add a new Customer :");
	System.out.println("2.Search Customer Details(Name/Account Number) : ");
	System.out.println("3.Update your Details(Account Number) : ");
	System.out.println("4.Balance Enquiry : ");
	System.out.println("5.Close(Delete) the customer account : ");
	System.out.println("6.Exit ");
int c,f=0;
String d,e="";
choice=sc.nextInt();
switch(choice) {
case 1:
	System.out.println("Enter your Account Number,Name & Money to be deposited : \n");

	b[count++]=new bank(sc.nextInt(),sc.next(),sc.nextDouble());
	/*
	 * for(int i=0;i<count;i++) 
	{
	b[i].show();
	} 
	*/
	
	break;

case 2:
	
	System.out.println("Enter your Name(choose :1) or Account Number (preferably)(choose : 0) : ");
c=sc.nextByte();
{ 
	if(c==1) {
		System.out.println("enter your name : ");
		e=sc.next();
		//break;
		
	}
	else if	(c==0) {
		System.out.println("enter your Account number : ");
		f=sc.nextInt();
		//break;
	}
	
	
}
			for(int  i=0;i<count;i++) 
			{
				if(e==b[i].getName()) 
				{
				b[i].show();
				break;
				}
				
				else if(f==b[i].getAccNo()){
					b[i].show();
				break;
				}
				//b[i].show();
				
				else {
					System.out.println("No account found !");
				break;
				}
				
			}
			break;
			
case 3:
	int updateAccno;
	System.out.println("Enter your account number");
	updateAccno=sc.nextInt();
	
	for(int i=0;i < count;i++) 
	{
		b[i].show();
		//b[i](sc.nextInt());
		//b[i].(String name);
		//b[i].double balance);
		System.out.println("enter new account number,name & amount : ");
	b[i].setAccNo( sc.nextInt());
	b[i].setName( sc.next() );
	b[i].setBalance( sc.nextDouble() );
	b[i].show();
		
		}
	
	
	break;
	
	
	
case 4:
	System.out.println("Enter Account number : ");
	int bal=sc.nextInt();
	for(int i=0;i<count;i++) {
	if(bal==b[i].getAccNo()) {
		b[i].getBalance();
		}
	}
	
	break;
	
case 5:
	System.out.println("Enter Account number(to be deleted) : ");
	int delAccno=sc.nextInt();
	for(int i=0;i<count;i++) {
	if(delAccno==b[i].getAccNo()) {
		b[i++].show();
		
		}
	}
	break;
	
case 6:
	System.exit(0);
}
		//bank b=new bank(123,"First",35000);
		//b.show();
}
		
	}

}
