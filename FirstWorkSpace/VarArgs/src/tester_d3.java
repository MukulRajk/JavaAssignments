//varArgs - variable arguments list, ... => ellipses
//varArgs should be the last parameter in the list of parameters

public class tester_d3{
	
public static int add(int ...a)
{
	int sum=0;
	for(int i=0;i<a.length;i++)
		sum=sum+a[i];
	return sum;

}


	public static void main(String args[]) {
	System.out.println(add(1,2,3,4));
	System.out.println(add(1,2,3,4,5,7,8));
	System.out.println(add(123,642,3,4));
	}
	
	
}
