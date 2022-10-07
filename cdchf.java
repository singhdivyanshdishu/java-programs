/* package cdchf; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class cdchf
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T !=0){
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for(int i=0; i<n; i++){
		        arr[i] = sc.nextInt();
		    }
		    
		    ArrayList<Integer> list = new ArrayList<Integer>();
		    for(int i=0; i<n; i++){
		        if(!list.contains(arr[i])){
		            list.add(arr[i]);
		        }
		    }
		    
		    System.out.println(list.size());
		    
		    
		    T--;
		}
	}
}
