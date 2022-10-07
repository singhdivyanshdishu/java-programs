import java.util.*;
public class c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]=new int[10];
        int b[]=new int[10];
    int i,ss=0,s=0;
    for(i=0;i<10;i++)
    {
        System.out.print("a=");
        a[i]=sc.nextInt();System.out.println();
        System.out.print("b=");
        b[i]=sc.nextInt();
        s+=a[i];
        ss+=b[i];
    }
    System.out.println(s);
    System.out.println(ss);
    }
}
