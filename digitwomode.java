public class digitwomode 
    {
        public static void main(String args[]) {
            int n =12562,a,b;
            while(n>0)
            {
                a=n/10;
                b=n-(a*10);//b will contain digit
                n=a;
                System.out.println(b);
            }
            
        }
    }
    

