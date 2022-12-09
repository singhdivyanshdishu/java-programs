import java.util.*;
public class matshift {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sfc=0,k=0;
        int a[][] = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j]=sc.nextInt();

                
            }
            
        }
        int size=5*5;
        int b[]=new int[size];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                b[k]=a[i][j];
                k++;
                
            }
            
        }
        for (int i = 0; i < 25; i++) {
          
                while(sfc<5)
                {
                    
                    int t=b[i];
                    b[i]=b[i+1];
                    b[i+1]=t;
sfc++;
                }
               
            
        }
        k=0;
        for (int j = 0; j < 5; j++) {
            for (int j2 = 0; j2 < 5; j2++) {
                a[j][j2]=b[k];k++;
            }
            
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(a[i][j]+" ");

                
            }
            System.out.println();
        }
    }
}
