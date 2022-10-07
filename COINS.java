
    /* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class COINS 
{
    public static long maxExchange(int n)
    {
        long exh = n/4+n/3+n/2;
        if(exh>n)
        {
            return maxExchange(n/4)+maxExchange(n/3)+maxExchange(n/2);
        }
        else{
            return n;
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
		    int n = sc.nextInt();
		    long result = maxExchange(n);
		    System.out.println(result);
		}
	}
}

    
}
