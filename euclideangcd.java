
    // Java program to demonstrate working of extended
// Euclidean Algorithm

import java.util.*;
import java.lang.*;

public class euclideangcd 
{
	// extended Euclidean Algorithm
	public static int gcd(int a, int b)
	{
		if (a == 0)
			return b;
		
		return gcd(b%a, a);
	}

// Driver Program
	public static void main(String[] args)
	{
		int a = 10, b = 15, g;
        g=gcd(7,gcd(0,gcd(14,14)));
        System.out.println(g);
		g = gcd(a, b);
		System.out.println("GCD(" + a + " , " + b+ ") = " + g);
		
		a = 35; b = 10;
		g = gcd(a, b);
		System.out.println("GCD(" + a + " , " + b+ ") = " + g);
		
		a = 31; b = 2;
		g = gcd(a, b);
		System.out.println("GCD(" + a + " , " + b+ ") = " + g);

	}
}
// Code Contributed by Mohit Gupta_OMG <(0_o)>
