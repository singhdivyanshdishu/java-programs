import java.io.*;

public class encoden {
    public static void main(String[] args)throws IOException {
    
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String str,ns="";
    char ch;
    int i;
    System.out.println("no to be encode");
    int n=Integer.parseInt(br.readLine());System.out.println("input");
    str=br.readLine();
    System.out.println("encoding about to start ");
    for (i = 0; i < str.length(); i++) {
        ch=str.charAt(i);
        if(Character.isUpperCase(ch))
        {
        if(ch>=(char)65&&ch<=(char)(90-n))
        {
            ch=(char)((int)ch+n);
        }
        if(ch>(char)(90-n))
        {
            ch=(char)(65+n);
        }
    }
    if(Character.isLowerCase(ch)){
        if(ch>=(char)97&&ch<=(char)(122-n))
        {
            ch=(char)(((int)ch)+n);
        }
        if(ch>(char)(122-n))
        {
            ch=(char)(97+n);
        }}
        ns+=ch;
    }
System.out.println(ns);
    }

    
    
}
