import java.util.*;
public class pralpermut 
{
    int c=0;
    void perm(String str, int ind,String p)
    {
        if(str.length()==0)
        {
            System.out.println(p);
        }
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            String nstr =str.substring(0, i) + str.substring(i+1);
            perm(nstr,ind+1,p+ch);
        }
        c++;
        System.out.println("no. of perm"+c);
    }
    public static void main(String[] args) 
    {
        pralpermut ob=new pralpermut();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the no.");
        String n=sc.nextLine();
        ob.perm(n, 0, " ");
        
    }
}
