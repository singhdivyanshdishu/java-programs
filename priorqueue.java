import java.util.*;
public class priorqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(30);
        pq.add(1);
        pq.add(56);System.out.println(pq);
        while(!pq.isEmpty())
        {
            
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
