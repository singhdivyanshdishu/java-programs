import java.util.*;
public class reverserecu {
    public static void reverse(String s, int l)
    {
        if(l==0)
        {
            System.out.print(s.charAt(0));
            return;
        }
        char ch=s.charAt(l);
        System.out.print(ch);
        reverse(s, l-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        reverse(str,str.length()-1);
    }
}
