package collection;
import java.util.*;
public class Hashsetdemo
{
	public static void main(String [] args)
	{
		HashSet<Double> hs =new HashSet<Double>();
		hs.add(1.5);
		hs.add(2.0);
		hs.add(0.2);
		hs.add(5.3);
		hs.add(2.8);
		System.out.println(hs);
		System.out.println("Size of the Hash set:" +hs.size());
		hs.remove(0.2);
		System.out.println("After remove ():" +hs);
		System.out.println("Collection contains 2.8 :" +hs.contains(2.8));
		System.out.println("Iterating over ArrayList using for each loop: ");
		hs.forEach(decnum ->System.out.println(decnum));
    }
	

}
