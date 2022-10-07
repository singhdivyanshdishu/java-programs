/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    int player(int n,int m)
    {int c=0;
        if(n>m)
        c=1;
        
        else
        c=2;
        
        return c;
    }
        
	public static void main (String[] args)
	{
        int t,i,max=0,c=0,p=0;
	    Codechef ob = new Codechef();
		Scanner sc = new Scanner(System.in);
		t=sc.nextInt();
		int p1[]=new int[t];
		int p2[]=new int[t];
		int d[]=new int[t];
		for(i=0;i<t;i++)
		{
		    p1[i]=sc.nextInt();
		}
		for(i=0;i<t;i++)
		{
		    p2[i]=sc.nextInt();
		}
		for(i=0;i<t;i++)
		{
		    d[i]=Math.abs(p1[i]-p2[i]);
		}
		for(i=0;i<t;i++)
		{
		    max=d[i];
		    if(d[i]>max)
		    {
		        max=d[i];
		        c=i;
		    }
		}
		p=ob.player(p1[c],p2[c]);
		System.out.println(p +" "+ max);
	}
}
