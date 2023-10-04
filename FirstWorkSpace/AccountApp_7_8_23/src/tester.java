

class account{
	private int balance;

	
	//default constructor
	public account(int balance) {
		//super();
		this.balance = balance;
	}
	
	
	
	public void  deposit(int amount) {
		balance=balance+ amount;
	}
	
	public void withdraw(int amount) throws Exception {
		if(amount>balance) {
			throw new Exception("insuficient balance - Low Balance");}
		
		else  if (amount>15000)
			throw new Exception("overlimit - cannot withdraw more than 15000");
		
		balance=balance- amount;
	}
	}

	


public class tester {

	public static void main(String[] args) {
		
account ac=new account(35000);
try {
	ac.withdraw(50000);
}
catch(Exception e) {
	System.out.println(e);
}
	}
	

}



