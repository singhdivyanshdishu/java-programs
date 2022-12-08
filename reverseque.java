
    /******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class reverseque {
	public static void main(String[] args) {
	    Queue<Integer> q= new LinkedList<>();
	    Stack<Integer> st=new Stack<Integer>();
	    q.add(1);
	    q.add(2);
	    q.add(3);
	    q.add(4);
	    q.add(5);
	    while(!q.isEmpty())
	    {
	        st.push(q.poll());
	    }
	    while(!st.empty()){
	        System.out.println(st.pop());
	    }
		
	}
}

    

