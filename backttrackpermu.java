public class backttrackpermu {
    public static void printpermutation(String str,String perm,int Idx)
    {
        if(str.length()==0)
        {
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currchar=str.charAt(i);
            String newstr=str.substring(0, i)+str.substring( i+1);
            printpermutation(newstr, perm+currchar, Idx+1);     
        }
    }
    public static void main(String[] args) {
        String str="DIVYANSH";
        printpermutation(str, " ", 0);
    }
}
