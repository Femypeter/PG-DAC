package collection;

import java.util.ArrayList;

public class ArrayListdemo
{
public static void main (String [] args)
{
	ArrayList<String> al = new ArrayList <String>();
	al.add("Femy");
	al.add("Amy");
	al.add("Jaison");
	al.add("Jebby");
	al.add("Elaina");
	System.out.println(al);
	System.out.println("Size of the collection:" +al.size());
	al.remove(3);
	System.out.println("After remove ():" +al);
	System.out.println("Collection contains Femy:" +al.contains("Femy"));
	System.out.println("Iterating over ArrayList using for each loop: ");
	for(int i=0;i<al.size();i++)
	{	
	System.out.print(al.get(i));
	System.out.print(", ");
}
}
}