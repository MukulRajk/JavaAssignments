import java.util.Scanner;
public class twoAry {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	
	int [][] a={{1,2,3},{4,5,6},{7,8,9}};
	int [][] b={{1,2,3,4},{5,6},{7,8,9}};//jagged array
	int [][] c=new int[3][4];// 3 rows,4 columns
	int [][] d=new int[3][];
	d[0]=new int[4];
	d[1]=new int[2];
	
	d[2]=new int[3];
	
	System.out.println("enter elements for array d: ");
	for(int i=0;i<d.length;i++)
	{
		for(int j=0;j<d[i].length;j++)
		{
		d[i][j]=sc.nextInt();	
}
}
	for(int i=0;i<d.length;i++)
	{
		for(int j=0;j<d[i].length;j++)
		{
			System.out.println("\t"+d[i][j]);
}
}
 for(int []temp:d) // int val:d
  for(int val:temp){
	  System.out.print(val+" ");
  }
 System.out.println();
{
	 }

}
}

