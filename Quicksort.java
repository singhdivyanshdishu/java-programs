public class Quicksort {
    public static void quicksort(int a[],int l,int h)
    {
        if(l<h)
        {
            int pi = partition(a , l, h);

            quicksort(a , l ,pi-1);
            quicksort(a , pi+1 , h);
        }
    } 
    public static int partition(int a[],int l , int h) 
    {
        int pivot =a[h];
        int i=l-1;

        for(int j=l;j<h;j++)
        {
            if(a[j]<pivot)
            {
                i++;
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }
        i++;
        int t=a[i];
        a[i]=a[h];
        a[h]=t;
        return i;
    }
    public static void main(String[] args) {
        Quicksort ob=new Quicksort();
        int a[]={5,6,8,3,10,1,9,20,-6};
        int len=a.length;
        ob.quicksort(a,0,len-1);
        for(int i=0;i<len;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}

