/*
 20.Create two different threads t1 and t2.
   t1 ==> prints next 10 incremented values of user entered number 
   t2 ==> prints multiplication table of the user entered number
 */

import java.util.Scanner;

class  firstT extends Thread {
		private int number;
		
		public int getNumber() {
			return number=0;
		}

		public int firstT(int number) {
			return this.number=number; }
			
			public void run() {
		for(int i=0;i<10;i++)
			{
			System.out.print("\t"+(number+=10));
			}
	}  }
	
	
	
	class secondT extends Thread{
		private int number;
		
		public int secondT(int number) {
		return this.number=number; }
		
		public void run() {
		for(int i=0;i<10;i++)
		{
		System.out.println(number*10);
		} }

		public static void getNumber() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	
public class Tester {
	
	public static void main(String args[]) {
	firstT firstT = new firstT();
	//Scanner sc=new Scanner(System.in);
	firstT.getNumber();
	firstT t1=new firstT();
	secondT.getNumber();
	secondT t2=new secondT();
	t1.start();
t2.start();	
}
}
