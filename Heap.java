/*Are bhahut Hard haii😎😎😎😎 */
/* 

⠛⠛⣿⣿⣿⣿⣿⡷⢶⣦⣶⣶⣤⣤⣤⣀⠀⠀⠀
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


*/

import java.util.*;

    public class Heap{
        ArrayList<Integer> arr=new ArrayList<>();
        public void add(int data)//O(log(n))
        {
            arr.add(data);
            
            int x= arr.size()-1;//child index
            int par=(x-1)/2;//parent index
            while(arr.get(x)<arr.get(par))//O(log(n))
            {
                //swap
                int temp=arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);

                x=par;
                par=(x-1)/2;
            }
        }
        private void heapyfy(int i)
        {
            int left= 2*i+1;
            int right=2*i+2;
            int minidx=i;
            if(left<arr.size()&&arr.get(minidx)>arr.get(left))
            {
                minidx=left;
            }
            if(right<arr.size()&&arr.get(minidx)>arr.get(right))
            {
                minidx=right;
            }
            if(minidx!=i)
            {
                //swap
                int temp =arr.get(i);
                arr.set(i,arr.get(minidx));
                arr.set(minidx,temp);
                heapyfy(minidx);
            }
        }
        public int peek()
        {
            return arr.get(0);
        }
        //above element by peek() we will deleete
        public int remove()
        {
            int data=arr.get(0);

            //step 1 : swap first and last
            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);
            //Step 2:
            arr.remove(arr.size()-1);

            //Step 3
            heapyfy(0);
            return data;

        }
        public boolean isEmpty()
        {
            return arr.size() == 0;
        }
    
    public static void main(String[] args) {
        Heap h=new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);
        while(!h.isEmpty())
        {
            System.out.println(h.peek());
            h.remove();
        }

    }
}
