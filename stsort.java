import java.util.*;
class stsort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String st,str,w="";
        int i,l;
        char ch,ch1;
        System.out.println("input string");
        st=sc.nextLine();
        str=st.toLowerCase();System.out.println(str);
        l=str.length();
       for(ch='a';ch<='z';ch=(char)((int)(ch)+1))
       //in case of numeric string it fails
    //    for(ch=(char)0;ch<=(char)126;ch=(char)((int)(ch)+1))
        {
            for(i=0;i<l;i++)
            {
                ch1=str.charAt(i);
                if(ch1==ch)
                {
                     w=ch1+w;
                }
            } 
        }  
        System.out.println(w);     
    }   
}
