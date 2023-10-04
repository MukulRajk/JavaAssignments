import java.util.Scanner;

public class armstrongnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int sum=0,t;
		System.out.println("enter a number:");
int a=sc.nextInt();  //153
int temp=a;
while(a>0) {
t=a%10;  //3
a=a/10;
sum=sum+t*t*t;
System.out.println("\n"+t);
}

System.out.println(sum);

if(sum==temp)
	System.out.println("it is a angstrong");
else
 System.out.println("it is not a angstrong number");
		
	}

}
