/*
Create a class AccountHolder with -
		Instance variables - account number, account holder name, account balance
		Class methods - constructors, getter/setter methods, deposite, withdraw
	Create an array of AccountHolder objects in main. 
	Write a menu driven program to perform -
			1. Add record for account holder
			2. Display details of all account holders.
			3. Deposite an amount into perticular account
			4. Withdraw an amount from perticular account

 */

import java.util.Scanner;

class AccountHolder{
	private double AccountNumber;
	private String AccountName;
	private double AccountBalance;
	


public class AccountHolder(double AccountNumber,String AccountName,double AccountBalance) {
	this.AccountNumber=AccountNumber;
	this.AccountName=AccountName;
	this.AccountBalance=AccountBalance;
	
	
}


	public double getAccountNumber() {
	return AccountNumber;
}


public void setAccountNumber(double accountNumber) {
	AccountNumber = accountNumber;
}


public double getString() {
	return String;
}


public void setString(double string) {
	String = string;
}


public double getAccountBalance() {
	return AccountBalance;
}


public void setAccountBalance(double accountBalance) {
	AccountBalance = accountBalance;
}

public void show() {
	System.out.println(lid+" "+make+" "+cost);
}



	public static void main(String[] args) {
		int i,j,k;
		AccountNumber [] ah=new AccountNumber[100];
		Scanner sc=new Scanner(System.in);
		for( i=0;i< ah.length;i++) {
			ah[i]=sc.nextInt();
		}
		
		AccountHolderName [] an=new AccountHolderName[100];
		for( j=0;j<an.length;j++) {
			an[j]=sc.nextInt();
			
		AccountBalance [] ab=new AccountBalance[100];
		for(k=0;k< ab.length;k++)
		{
			ab[k]=sc.nextInt();
		}
		
		}
		
		
	}
	
}
