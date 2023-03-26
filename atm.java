import java.io.*;
import java.util.*;
public class atm 
{
    static long balance=2000;
    void disp()
    {
        System.out.println("Hello! Welcome to our ATM Services");
        System.out.println("1. Balance Inquiry");
        System.out.println("2. Cash Withdrawal");
        System.out.println("3. Cash Deposit");
        System.out.println("4. Exit");
        System.out.println("******************");
    }
        public static void main(String[] args)throws IOException
    {
      long nvd,nvw;
      char ch;
      Scanner sc=new Scanner(System.in);
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      atm ob=new atm();
      do
      {
          ob.disp();
          System.out.println("Input your choice");
          ch=(char) br.read();
          if(ch=='4')
          {
              break;
          }
          else if(ch=='3')
          {
              System.out.println("Input the ammount to be depositted");
              nvd=sc.nextLong();
              balance+=nvd;
              System.out.println("Would you like to have another transaction?(y/n)");
              char chh=(char)br.read();
              if(Character.toLowerCase(chh)=='y')
              {
                  continue;
              }
              else
              {
                  break;
              }

          }
          else if(ch=='2')
          {
               System.out.println("Input the amount to be withdarw ");
               nvw=sc.nextLong();
               if(nvw%100==0)
               {
                   balance-=balance;
                   System.out.println("Your current balance is "+balance);
                   System.out.println("Would you like to have another transaction?(y/n)");
                   char ch1=(char)br.read();
                   if(ch1=='y')
                   {
                       continue;
                   }
                   else
                   {
                       break;
                   }
               }
               else
               {
                   System.out.println("Please Enter the amount in multiples of 100");
                   System.out.println("Would you like to have another transaction?(y/n)");
                   char ch2=(char)br.read();
                   if(Character.toLowerCase(ch2)=='y')
                   {
                       continue;
                   }
                   else
                   {
                       break;
                   }
               }
          }
          else if(ch=='1')
          {
              System.out.println("Your current balance is "+balance");
          }
      }while(ch!='4');
    }
}
