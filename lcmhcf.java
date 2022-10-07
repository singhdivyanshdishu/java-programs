import java.util.*;
public class lcmhcf 
{
    public static void main(String args[])
    {
        int m,n,c=0,i,h=0,l=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("input two numbers");
        n=sc.nextInt();
        m=sc.nextInt();
        c=m>n?m:n;
        for(i=1;i<=c;i++)
        {
            if((m%i)==0 && (n%i)==0)
            {
                 h=i;
            }
        }
        System.out.println("HCF is:"+ h);
        l=(m*n)/h;
        System.out.println("LCM is:"+ l);
    }
}
