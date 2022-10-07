import java.util.*;
public class hcfwithoutmode
{
    public static void main(String args[])
    {
        int m,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        while(n!=m)
        {
            if(m>n)
            {
                m=m-n;
            }
            else
            {
                n=n-m;
            }
         //   System.out.println(n);//n contain hcf
        }System.out.println("HCF is :"+n);//n contain hcf
    }      
}