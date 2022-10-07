/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
public class bubble
{
	public static void main (String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int t=10,i,j=0,s;
	//t=sc.nextInt();
	int a[]=new int[t];
	for(i=0;i<t;i++)
	{
	    a[i]=sc.nextInt();
	}
	for(i=0;i<t;i++)
	{
	    for(j=0;j<t-1;j++)
	    {
	        if(a[j]>a[j+1])
	        {
	            s=a[j];
	            a[j]=a[j+1];
	            a[j+1]=s;
	        }
	    }
	}
	for(i=0;i<t;i++)
	{
	     System.out.print(" "+a[i]);
	}
	}
}
