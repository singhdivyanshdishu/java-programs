import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class q12 {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int k=1,t,i,a=0,j,n;
        t=sc.nextInt();
        for(i=0;i<t;i++)
        {
            k=1;
            n=sc.nextInt();
            LinkedList<Integer> list = new LinkedList<Integer>();
            for(j=0;j<n;j++)
            {
                list.add(k);
                k++;
            }
            n=list.size();
            while(n!=1)
            {
            if(n%2==0)
            {
            for(j=0;j<n;j++)
            {
                if(j%2!=0)
                {
                    list.remove(j);
                }
            }
            n=list.size();
            }
            else
            {
            for(j=0;j<n;j++)
            {
            if(j%2!=0)
                {
                    list.remove(j);
                } 
            }
                list.remove(0);
                n=list.size();
            }
        }
            a = list.get (0);
    
System.out.println (a);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
}