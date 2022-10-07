/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class compare
{
    	public static void main (String[] args)throws IOException
	{
		 int t,j,x,y;
		// char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   // z ob=new z();
      t = Integer.parseInt(br.readLine());
    for (j = 0; j < t; j++)
      { char ch;
           x = Integer.parseInt(br.readLine());
           y = Integer.parseInt(br.readLine());
           if(x>y){
            ch='>';System.out.println(ch);}
           if(x<y){
            ch='<';System.out.println(ch);}
           if(x==y){
            ch='=';System.out.println(ch);}
      }
	}
}
