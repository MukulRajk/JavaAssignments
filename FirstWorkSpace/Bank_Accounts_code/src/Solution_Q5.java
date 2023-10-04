
import java.util.Scanner;


//class accountholder
 class AccountHolder {
  private int accno;
  private String name;
  private double balance;
	
// generate constructors using fields
	
	public AccountHolder(int accno, String name, double balance) {
	this.accno = accno;
	this.name = name;
	this.balance = balance;
}

	

// generate getter and setters
	public int getAccno() {
		return accno;
	}




	public void setAccno(int accno) {
		this.accno = accno;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public double getBalance() {
		return balance;
	}




	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//display

	public void show() {
		System.out.println(accno+" "+name+" "+balance);
	}
	
	
	//deposit
	public void deposit(double amount) {
		balance=balance+amount;
	}
	
	
   // withdraw
	public void withdraw(double amount) {
		balance=balance-amount;
	}
	
	
	
	public class Solution_Q5{
	
	public static void main(String[] args) {
	


int choice,cnt=0,acno;
     AccountHolder [] ah=new AccountHolder[100];
     Scanner sc=new Scanner(System.in);
     while(true) {
    	 System.out.println("1.ADD a record:");
    	 System.out.println("2.show record:");
    	 System.out.println("3.deposit:");
    	 System.out.println("4.withdraw:");
          System.out.println("5.show balance:");
          System.out.println("6.exit");
          
          
          
          choice=sc.nextInt();
          switch(choice) {
          
          case 1:
        	  System.out.println("enter account number,name & balance: ");
        	  ah[cnt++] = new AccountHolder(sc.nextInt(),sc.next(),sc.nextDouble());
        	  break;
        	  
          case 2:
        	  for(int i=0;i<cnt;i++)
        	  {
        		  ah[i].show();
        		  
        	  }
        	  break;
          case 3:
        	  System.out.println("enter account number:");
        	  acno=sc.nextInt();
        	  for(int i=0;i<cnt;i++) {
        		  
        		  if(ah[i].getAccno()==acno) {
        			  System.out.println("enter amount to be deposited:");
        			  ah[i].deposit(sc.nextDouble());
        			  
        		  }
        	  }
        	  
        	  break;
        	  
        	  
 case 4:
	 System.out.println("enter account number:");
	  acno=sc.nextInt();
	  for(int i=0;i<cnt;i++) {
		  
		  if(ah[i].getAccno()==acno) {
			  System.out.println("enter amount to be withdrawn:");
			  ah[i].withdraw(sc.nextDouble());
			  
		  }
	  }
	 
          case 5:
        	  System.exit(0);
          //case 6:
        	
        	  
        
          
          
          
          
          
          }
          
          
          
          }
     
     
     
     																			}
     
     
     
     
											}

                                       }