import java.util.Scanner;


// array= collection of elements of java
public class tester {

	public static void main(String args[])
	{
		
		int [] a=new int[] {1,2,3,4,5}; //initialized array
		int [] b= {20,30,40,50}; //initialized array
		float [] c=new float[5];//un-initialized array
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 5 ints");
		for(int i=0;i<c.length;i++)
			c[i]=sc.nextFloat();
		
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]+" ");
		
		}
		for(float j:c)              // for each loop -used for collections,read only,not for scanning
		{System.out.print(j);
		
		}
	}
}


// system-it is a class
// out- static reference of print stream class
//println- method of class printstream




