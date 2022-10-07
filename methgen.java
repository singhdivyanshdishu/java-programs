public class methgen {

    static <T> void genericPrint( T t)
    {
        System.out.println(t);
    }
     public static void main(String args []) {
       methgen Obj=new methgen();
       Obj.genericPrint(101);
       Obj.genericPrint("Dishu");
       Obj.genericPrint(35.256);  
     }
        
    }
