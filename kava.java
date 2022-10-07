/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class kava
{
    int josephus(int n,int k){int c=0;
   int arr[] = new int[n+1];
   for(int i=1;i<=n;i++){
     arr[i]=i;
   }
   
   int idx=k,N=n;
   if(idx > n) idx -= n;
   while(N!=1){
   //  cout << idx << " ";
     arr[idx]=0;
     N--;
   
     for(int i=0;i<k;i++){
       idx++;
       if(idx > n) idx -= n;
       while(arr[idx] == 0){
         idx++;
         if(idx > n) idx -= n;
       }
     }
   }
   
   for(int i=1;i<=n;i++){
     if(arr[i] != 0) c=i;
   }
   return c;
}
	public static void main(String[] args) {
	    kava ob = new kava();
		System.out.println(ob.josephus(10,5));
	}
}
