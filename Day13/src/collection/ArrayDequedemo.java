package collection;

import java.util.*;

public class ArrayDequedemo
{
	public static void main(String [] args)
	{
	
	ArrayDeque<Integer> adq=new ArrayDeque<Integer>();
	 adq.add(100);
	 adq.add(1000);
	 adq.add(10000);
	 adq.add(10);
	 adq.add(0);
	 System.out.println(adq);
	 System.out.println("Size of Array Deque:" +adq.size());
	 System.out.println("Iterating over ArrayDeque using for each loop: ");
	 adq.forEach(num ->System.out.println(num));
	 
	}
	


}
