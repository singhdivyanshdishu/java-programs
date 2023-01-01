import java.util.*;
public class hashmap1 {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("Dishu", 1);
        hm.put("Harsh", 2);
        hm.put("aka",3);
        System.out.println(hm);
        Set<String> keys=hm.keySet();
        for (String k : keys) 
        {
            System.out.println("Key = "+ k + " , "+ "value = "+hm.get(k));
        }
    }
    
}
