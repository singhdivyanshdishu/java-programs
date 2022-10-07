public class lcm {
    public static void main(String[] args) {
        int a=7,b=8;
        int lcmc=(a>b)?a:b;
        while(true)
        {
            if(lcmc%a==0&&lcmc%b==0)
            {
                System.out.println(lcmc);
                break;
            }
            lcmc++;
        }
    }
    
}
