import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

class Solution
{


    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t,n,i,j,k=0,c=0;
        //char ch;
        
        t=sc.nextInt();
        for(i=0;i<t;i++)
        {
            c=0;
            String str=sc.nextLine();
            n=str.length();
            //char ch[] =new char[n];
            //for(j=0;j<n;j++)
            //{
               // ch[j]=str.charAt(j);
                //k++;
           // }
            for(k=0;k<n;k++)
            {
                if(str.charAt(k)=='1')
                {
                    c++;
               for (int h = 1; h < str.length(); h++) { 
                    if (str.charAt(k + h) == '1') {
                        k = k + h;
                    }
                    else {
                        break;
                    }
               }
                }
               }
            System.out.println(c);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    }
}
