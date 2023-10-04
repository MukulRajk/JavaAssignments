//Thread Interference - corruption of shared data 

class Account{
private int balance;

public Account() {
	balance=10000;
}


//synchronized
//public void deposit(){ }
public  synchronized void deposit(int amount ){
	System.out.println("balance before deposit: "+balance);
	balance=balance+amount;
	System.out.println("balance after deposit: "+balance);
	
	
}

public synchronized void withdraw(int amount ) {
	System.out.println("balance before withdraw : "+balance);
	balance=balance-amount;
	System.out.println("balance after withdraw : "+balance);
	
}
}


class AU extends Thread{
	String name,tot;
	Account account;
	int amount;
	
	public AU(String name,Account account,String tot,int amount) {
		this.name=name;
		this.account=account;
		this.tot=tot;
		this.amount=amount;
	}
	
	
	public void run() {
		if(tot.equals("deposit")) 
			account.deposit(amount);
		

		else if (tot.equals("withdraw")) 
				account.withdraw(amount);
							
	}
}







public class tester {

	public static void main(String[] args)
	{
		
Account  account=new Account();
AU   user1=new AU("abc",account,"deposit",5000);
AU   user2=new AU("xyz",account,"withdraw",2000);
		
user1.start();
user2.start();
		
		
	}

}

// HashTable