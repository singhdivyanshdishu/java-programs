import java.util.Scanner;

public class visapro 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int ar[]=new int[18];
        long n;
        int i=0,j=0,con=0,sum=0,a,x=0,x1=0,s,nd,sum1=0,sum2=0,y=0;
            String str=sc.nextLine();
            n=Long.parseLong(str);
            while(n>0)
            {
                a=(int)(n%10);
                n=n/10;
                ar[i]=a;
                i++;
            }
            for(j=i-1;j>=0;j-=2)
            {
                x=x1=ar[j]*2;
                if(x>9)
                { s=0;nd=0;
                    while(x>0)
                    {
                        nd=x%10;
                        x=x/10;
                        s+=nd;
                    }
                    sum1+=s;
                }
                else
                {
                    sum1+=x1;
                }
            }
             for(j=i;j>=0;j-=2)
            {
                sum2+=ar[j];
            }
            y=sum1+sum2;
            if(y%10==0)
            {
                con=1;
            }
            System.out.println(sum1);
            System.out.println(sum2);
        System.out.println(con);
     }    
}
