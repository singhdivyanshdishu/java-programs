/* package codechef; // don't place package name! */

import java.util.*;
import java.util.Arrays;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    String asc(String str)
    {
        int i;
        char ch,chh;
        String st=" ",s=str.toLowerCase();
        for(chh='a';chh<='z';chh=(char)((int)(chh)+1))
        {
        for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            st+=ch;
        }
        }
        return st;
    }
	public static void main (String[] args)
	{
	    Codechef ob=new Codechef();
		Scanner sc=new Scanner(System.in);
		int t,j,l,n;
		String st=" ",str=" ",st1,st2;
	    t=sc.nextInt();
	    for(j=0;j<t;j++)
	    {
	      st1=" ";
	      st2=" ";
	      str=sc.nextLine();
	      l=str.length();
	      if(l%2==0)
	      {
	          n=l/2;
	          st1=ob.asc(st.substring(0,n));
	          st2=ob.asc(st.substring(n));
	          if(st1.equals(st2))
	          {
	              System.out.println("YES");
	          }
	          else
	          {
	              System.out.println("NO");
	          }
	      }
	      else
	      {
	          n=l/2;
	          st1=ob.asc(st.substring(0,n));
	          st2=ob.asc(st.substring(n+1));
	          if(st1.equals(st2))
	          {
	              System.out.println("YES");
	          }
	          else
	          {
	              System.out.println("NO");
	          }
	      }
	    }
	
	}
}
