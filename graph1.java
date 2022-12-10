import java.util.*;
public class graph1 {
    static class Edge
    {
        int src;
        int dest;
        int wt;
        Edge(int s,int d,int w)
        {
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    /*


         (5)
     0-------1
            / \
        (1)/   \(3)
          /     \
         2-------3
         |  (1)
      (2)|
         |
         4
     
     
         */
    public static void main(String[] args) {
        int v=5;
        ArrayList<Edge> [] graph=new ArrayList[v];//null
        for (int i = 0; i < v; i++) {
            graph[i]=new ArrayList<>();
            
        }
        //0 vertex
        graph[0].add(new Edge(0,1, 5));
        //1 vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));
        //vertex 2
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));
        //vertex 3
        graph[3].add(new Edge(3, 2, 1));
        graph[3].add(new Edge(3, 1, 3));
        //vertex 4
        graph[4].add(new Edge(4, 2, 2));
        
        //2' neighbour
        for(int i =0;i<graph[2].size();i++)
        {
            Edge e=graph[2].get(i);
            System.out.println(e.src);
        }
    }
}
