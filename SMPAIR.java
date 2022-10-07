/* package codechef; // don't place package name! */

import java.util.Arrays;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t,i,aa,j,n,b,c=0;
        System.out.println("input test case");
		//t=sc.nextInt();
 		// for(i=0;i<t;i++)
 		// {
        System.out.println("size");
		n=sc.nextInt();
		int a[] = new int[n];
		for(j=0;j<n;j++)
		{
		    a[j]=sc.nextInt();
		}
		Arrays.sort(a);
		aa=a[0];
		b=a[1];
		c=aa+b;
        System.out.println("value");
		System.out.println(c);
		//}
	}		
}		