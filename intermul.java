import java.util.Scanner;

public class intermul {
   
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n,m,b,a=0,a1,ld;
        n=sc.nextInt();
        m=sc.nextInt();
        System.out.println("\t"+"\t"+"  "+m);
        System.out.println("\t"+"x"+"\t  "+n);
        System.out.println("____________________");
        ld=m%10;
        b=n*ld;
        while(m>0)
        {
            a=m%10;
            m=m/10;
           
        }
        a1=n*a*10;
        System.out.println(ld +" x "+n+"  = \t "+b);
        System.out.println(a + " x " + n + "  = \t"+ a1);
        System.out.println("Adding both_________");
        System.out.println("                "+ (b+a1));
        System.out.println("____________________");


    }
    
}
