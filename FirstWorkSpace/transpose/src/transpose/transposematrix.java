package transpose;

import java.util.Scanner;

class transposematrix {
public static void main(String args[]){ 
	int i,j;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the elements of a matrix:");
	int [][]a=new int[3][3];
	int [][]b=new int[3][3];
	
	//get values
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			a[i][j]=sc.nextInt();
			
		}
	}
	
	//print values
	for(i=0;i<a.length;i++)
	{
		for(j=0;j<a[i].length;j++)
		{
			System.out.println(a[i][j]);
			
		}
			}
	
	System.out.println("bruteforce");
	for(i=0;i<a.length;i++)//j=0;j<a[i].length;j++
	{
		for(j=0;j<a[i].length;j++) //i=0;i<a.length;i++
		{
			b[j][i]=a[i][j];
			//System.out.println("\t");
			System.out.println(b[i][j]);
		}
		
		//System.out.println(b[j][i]+"\t");
		
	}
	
	System.out.println("modification");
	for(int []temp:b)
	{for(int val:temp)
	{
		System.out.println(val+" ");
	}
	System.out.println();
	}
  		}

		}
 
 
  

