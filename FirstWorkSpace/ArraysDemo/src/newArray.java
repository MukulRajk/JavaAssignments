import java.util.Scanner;

public class newArray {
public static void main(String args[])
{
	int i;
	int [] a=new int[5];
	Scanner sc=new Scanner(System.in);
	for(i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
		System.out.println("for loop: \t"+a[i]);
	}
	
	System.out.println("for each LOOP: ");
	for(float j: a) {
		System.out.print(j+"\t");
	}
	

}
}


