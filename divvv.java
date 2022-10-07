import java.util.*;

public class divvv {
   public int factorial(int a)
{
    int c=1;
    for(int i=a;i<a;i++)
    {
        c=c*i;
    }
    return c;
}
    public static void main(String[] args) {
        divvv ob=new divvv();
        Scanner sc = new Scanner(System.in);
        int a,b,n,r=0;
        do
        {
            System.out.println("input no. to continue ");
            a= sc.nextInt();
            System.out.println(ob.factorial(a));
            while(a>0)
            {
                n=a%10;
                a=a/10;
                r=r*10+n;

            }
            
            System.out.println(r);r=0;
            System.out.println("Press 0 to end and 1 to continue");
            
            b=sc.nextInt();
            if(b==0)
            {
                System.out.println("end");
            }
        }while(b!=0);
        }
}

