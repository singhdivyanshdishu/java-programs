
/* package codechef; // don't place package name! */

import java.util.*;
import java.util.Arrays;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class REAMD
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t,count=0,s=0,n,m;
		t=sc.nextInt();
		while(t--!=0)
		{
		    count=0;
		    s=0;
		    m=0;
		    n=sc.nextInt();
		    int ar[]=new int[n];
			System.out.println("input array");
		    for(int i=0;i<n;i++)
		    {
		        ar[i]=sc.nextInt();
		    }
		    Arrays.sort(ar);
		    m=ar[n-1];
		    for(int j=0;j<n-1;j++)
		    {
		        for(int k=j+1;k<n-1;k++)
		        {
		            s=ar[j]+ar[k];
		            if(s==m)
		            {
		                count++;
		            }
		            else
		            {
		                continue;
		            }
		        }
		    }
		    System.out.println(count);
		}
	}
}
