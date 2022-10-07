import java.io.*;//je program kuch nahi kar rha h baas list ka sbse chota element print kr rha h kachraa code
class Node {
     int data;
     Node link;
    public Node()
    {
        link = null;
        data = 0;
    }
    public Node(int d,Node n)
    {
        link = n;
        data = d;
    }
    public void setlink(Node n)
    {
        link=n;
    }
    public void setdata(int d)
    {
        data= d;

    }
    public Node getlink()
    {
        return link;
    }
    public int getdata()
    {
        return data;
    }
}
class linkedlist
{
    protected Node start;
    public linkedlist()
    {
        start = null;
    }
    public boolean isEmpty()
    {
        return start==null ;
    }
    public void insert (int val)
    {
        Node nptr,ptr,save=null;
        nptr = new Node(val,null);
        boolean ins =false;
        if(start == null)
        {
            start = nptr;
        }
        else if(val<=start.getdata())
        {
            nptr.setlink(start);
            start = nptr;
        }
        else
        {
            save=start;
            ptr=start.getlink();
            while(ptr!=null)
            {
                if(val>=save.getdata() && val<=save.getdata())
                {
                    save.setlink(nptr);
                    nptr.setlink(ptr);
                    ins = true;
                    break;
                }
                else
                {
                    save=ptr;
                    ptr=ptr.getlink();
                }
            }    
            if(ins == false)
            {
                save.setlink(nptr);
            }
        }
    }
    public void display()
    {
        Node ptr=start;
        System.out.print(start.getdata() + "-->");
        ptr = start.getlink();
        while(ptr.getlink() != null)
        {
            System.out.print(start.getdata() + "-->");
            ptr=ptr.getlink();
        }
        System.out.print(start.getdata() + "!!!!");
        System.out.println();
    }
}
class linkedlisttest
{
    static linkedlist S;
    public static void main(String[] args) {
        int num;
         S=new linkedlist();
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("......Starting List Test for INSERTION......\n");
         for(int i=0;i<5;i++)
         {
             System.out.print("Enter a number :");
         try
         {
             num=Integer.parseInt(br.readLine());
             S.insert(num);
             System.out.println("Inserted :"+num);
         }
         catch(Exception E)
         {
             System.out.println(E);
         }
        }
         System.out.println("\n Created List is :");
         S.display();
         System.out.println("\n----List Test Over----");
    }
}