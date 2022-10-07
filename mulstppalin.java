import java.util.*;
public class mulstppalin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m,a,r=0,c=0,count=0,paln=0;
        System.out.println("Input the No.");
        n=sc.nextInt();
        m=n;
        for(int i=0;i<100;i++)
        {
            while(m>0)
            {
                a=m%10;
                m=m/10;
                r=(r*10)+a;
                // System.out.println(r);
            }
            if(r==n)
            {
                c=1;
                paln=r;
                break;
            }
            else
            {
                m=r+n;
                n=m;
                count++;
            }
           
            r=0;
        }
        System.out.println("Number of steps taken : "+count);
        System.out.println("The Palindrome No. is : "+paln);
    }
    
}