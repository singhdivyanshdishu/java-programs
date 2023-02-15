import java.util.*;
import java.util.Arrays;
public class remdupfsa {
    // public int removeDuplicates(int[] num) {
    //     int i,c=0;
    //     for(i=1;i<num.length;i++)
    //     {
    //         if(num[i-1]==num[i])
    //         {
    //             c++;
    //             num[i]=-1;
    //         }
    //     }
    // }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num[]={0,0,1,1,1,2,2,3,3,4};
        int i,c=0;
        for(i=0;i<num.length-1;i++)
        {
            if(num[i]==num[i+1])
            {
                c++;
                num[i]=999;
            }
        }Arrays.sort(num);
       
        System.out.println(c);
        for(i=1;i<num.length-c;i++)
        {
            System.out.print(num[i]+"\t");
        }
    }
    }
