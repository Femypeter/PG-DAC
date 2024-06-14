package collection;
import java.util.*;
public class Vectordemo 
{
	public static void main(String [] args)
	{
		Vector<Integer> vr= new Vector<Integer>();
		vr.add(2);
		vr.add(4);
		vr.add(5);
		vr.add(1);
		vr.add(10);
		vr.add(3);
		vr.add(6);
		vr.add(9);
		vr.add(7);
		vr.add(8);
		System.out.println(vr);
		System.out.println("Size of the Vector:" +vr.size());
		vr.remove(0);
		System.out.println("After remove ():" +vr);
		System.out.println("Collection contains 3 " +vr.contains(3));
		System.out.println("Iterating over ArrayList using for each loop: ");
		vr.forEach(num ->System.out.println(num));
	}
}
