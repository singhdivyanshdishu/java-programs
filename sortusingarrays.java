
    import java.util.Arrays;
import java.util.Scanner;
public class sortusingarrays {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int k=0; k<n;k++)
            a[k] = sc.nextInt();
        Arrays.sort(a);
        for(int i=0;i<n;i++)
            System.out.println(a[i]);
    
}
    
}
