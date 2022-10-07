import java.util.*;
import java.io.*;
public class charinput {
    public static void main(String[] args) throws IOException {
        String str;
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            //char chh[]=new char[5];
            System.out.println(" input string");
             str = br.readLine(); System.out.println("string is"+ str);
             System.out.println(" input char");
             char c = (char)br.read(); System.out.println("character is"+c);
           // int  t = (int)Integer.parseInt(br.readLine());
            //System.out.println("integer is "+ t);
           // for(int i=0;i<5;i++)
           // {
               /*character array is input by scanner class learn the syntax*/
            System.out.println(" input char array");
               char chh [] = sc.next().toCharArray();
           // }
            for(int i=0;i<chh.length;i++)
            {
                System.out.println(chh[i]);
            }
    }
    
    
}
