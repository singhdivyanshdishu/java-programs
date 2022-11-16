import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //System.out.println("Input Two Number");
        int a,b,c,s=0;
        
        System.out.println("Press 1 for add ");
        System.out.println("Press 2 for sub");
        System.out.println("Press 3 for mul");
        System.out.println("press 4 for div");
        System.out.println("Input choice");
        c=sc.nextInt();
        System.out.println("Input 2 no.");
        a=sc.nextInt();
        b=sc.nextInt();

        switch(c)
        {
            case 1:
            s=a+b;
            System.out.println("Output = " + s );
            break;
            case 2:
            s=a-b;System.out.println("Output = " + s );
            break;
            case 3:
            s=a*b;System.out.println("Output = " + s );
            break;
            case 4:
            System.out.println("Output = " + (double)(a/b) );
            break;
            default:
            System.out.println("Entered wrong choice");
            break;

        }
    }
    
}
