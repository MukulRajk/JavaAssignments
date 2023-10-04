import java.util.Scanner;
 
 class test {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
	int [][] a=new int [3][3];
	int i,j;
	//input
   System.out.println("enter elements of Matrix A: ");
   for(i=0;i<a.length;i++)
   {
	   for(j=0;j<a.length;j++)
	   {
		   a[i][j]=sc.nextInt();
	   }
   }
   
   //display
   System.out.println("\n Elements :");
   for(i=0;i<a.length;i++)
   {
	   
	   for(j=0;j<a.length;j++)
	   {
		   System.out.println(a[i][j]);
	   }
   //System.out.println("\t");
	
   }
   
   
   
}
}
 