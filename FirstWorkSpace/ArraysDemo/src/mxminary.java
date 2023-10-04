import java.util.Scanner;


class mxminary {

	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int [] a=new int [5]; //{5,4,9,1,89};
	int i,max,min;
	System.out.println("enter 5 elements of array:");
	for(i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
System.out.println("elements of array :");
for(i=0;i<a.length;i++) {
	
	System.out.print(a[i]+" ");
}
// max and min

		//while(i<a.length)
	for( i=0;i<=a.length;i++)
	{
		if(a[i]>a.length-1) {
			max=a[i];
		System.out.println("max:"+a[i]);
		}
		
		else{
		min=a[i];
		
		System.out.println("min:"+a[i]); 
		}
	//i++;
	//continue;
	
	//System.out.println("maximum :"+max);
	//System.out.println("minimum:"+min);
	}
}
}



