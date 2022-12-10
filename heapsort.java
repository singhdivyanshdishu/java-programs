/*⠛⠛⣿⣿⣿⣿⣿⡷⢶⣦⣶⣶⣤⣤⣤⣀⠀⠀⠀
⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠀
⠀⠀⠀⠉⠉⠉⠙⠻⣿⣿⠿⠿⠛⠛⠛⠻⣿⣿⣇⠀
⠀⠀⢤⣀⣀⣀⠀⠀⢸⣷⡄⠀⣁⣀⣤⣴⣿⣿⣿⣆
⠀⠀⠀⠀⠹⠏⠀⠀⠀⣿⣧⠀⠹⣿⣿⣿⣿⣿⡿⣿
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⠿⠇⢀⣼⣿⣿⠛⢯⡿⡟
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠦⠴⢿⢿⣿⡿⠷⠀⣿⠀
⠀⠀⠀⠀⠀⠀⠀⠙⣷⣶⣶⣤⣤⣤⣤⣤⣶⣦⠃⠀
⠀⠀⠀⠀⠀⠀⠀⢐⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠻⢿⣿⣿⣿⣿⠟
some unknown error
*/


public class heapsort {
    public static void hsort(int arr[])
        {
            //build max heap
            int n= arr.length;
            for(int i=n/2-1;i>=0;i--)
            {
                heapify(arr, n,i);

            }
            for(int i=n-1;i>0;i--)
            {
                //swap - largest first with last
                int t=arr[0];
                arr[0]=arr[i];
                arr[i]=t;
                heapify(arr,i,0);
            }
        }
    public static void heapify(int arr[],int size, int i)
    {
        int left=2*i+1;
        int right=2*i+2;
        int maxidx=i;
        if(left<size&&arr[left]>arr[maxidx])
        {
            maxidx=left;

        }
        if(right<size&&arr[right]>arr[maxidx]){
            maxidx=right;
        }
        if(maxidx!=i)
        {
            int temp=arr[i];
            arr[i]=arr[maxidx];
            arr[maxidx]=temp;
        }
        heapify(arr, size,maxidx);
    }
    
    public static void main(String[] args) {
        int arr[]={1,2,9,0,3,7};
        hsort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
}
