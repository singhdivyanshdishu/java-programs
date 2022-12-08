
    /******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.lang.Math;
public class priorityque 
{
	public static void main(String[] args) {
	    PriorityQueue q= new PriorityQueue(10,new myComparator());
	   // System.out.println(q.peek());
	   // System.out.println(q.element());
	    for(int i=0;i<10;i++)
	    {
	        q.add(Math.random());
	    }
	   System.out.println(q);
		
	}
}
class myComparator implements Comparator
{
    public static Integer Mycompartor(Object obj1,Object obj2)
    {
        Integer i1=(Integer)obj1;
        Integer i2=(Integer)obj2;
        return i1>i2?i1:i2;
    }

    @Override
    public int compare(Object o1, Object o2) {
        // TODO Auto-generated method stub
        return 0;
    }
}


