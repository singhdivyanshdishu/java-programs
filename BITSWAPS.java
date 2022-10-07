import java.util.*;
public class BITSWAPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,count=0;
        int a[] = new int[6];
        System.out.println("Input");
        for(i=0;i<6;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<6;i++)
        {
            int min=i;
        
            for(j=1;j<6;j++)
            {
                if(a[j]<a[min])
                {
                    min=j;
                }
            }    
                int ai=a[i];
                int aj=a[min];
                
                int c=ai&aj;
               // System.out.println("c = " + c);
                if(c==0)
                {
                    continue;
                }
                else{
                    int t=a[i];
                    a[i]=a[min];
                    a[min]=t;
                    count++;
               }
                
            
        }
        System.out.println("\n");
        for(i=0;i<6;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("Count = "+count);
    }
    
}
