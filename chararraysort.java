import java.util.*;
import java.util.Arrays;
import java.io.*;
public class chararraysort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      PrintStream stream
                = new PrintStream(System.out);
        
        System.out.println("input string");
        char chh [] = sc.next().toCharArray();
        stream.println(chh);
        
        Arrays.sort(chh);stream.println(chh);
            
        }       
    }   