
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class seclar {
	public static void main (String[] args)
	{
	    int i,min=0,max=0;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[3];
		    for(i=0;i<3;i++)
	    	{
		       a[i]=sc.nextInt();
	    	}
		  min=a[0];max=a[0];
		 for(i=0;i<3;i++)
	    	{
	    	    if(a[i]<min)
	    	    min=a[i];
	    	    if(a[i]>max)
	    	    max=a[i];
	    	}
	     for(i=0;i<3;i++)
	     {
	         if(a[i]==min||a[i]==max)
	         continue;
	         else
	         System.out.println(a[i]);
	     }
		}
	}

