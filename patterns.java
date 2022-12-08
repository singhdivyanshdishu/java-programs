import java.util.*;
public class patterns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("pattern 1");
        int i,j;
        System.out.println("Input");
        int n=sc.nextInt();
        for (i = 1; i <= n; i++) {
            for(j=1;j<=n;j++)
            {
                if(i==1||j==1||i==n||j==n)
                {
                    System.out.print("*");
                }
                if(i!=1&&j!=1&&i!=n&&j!=n)
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
    }

}
