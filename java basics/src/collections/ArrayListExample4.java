package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample4 {
	public static void main(String args[]){  
		  ArrayList<String> al = new ArrayList<String>();  
		  al.add("Mango");  
		  al.add("Apple");  
		  al.add("Banana");  
		  al.add("Grapes");  
		  Collections.sort(al);
		  for(String fruit:al)  
		    System.out.println(fruit);  
		  System.out.println("Sorting numbers...");  
	       ArrayList<Integer> al1 = new ArrayList<Integer>();  
		  al1.add(21);  
		  al1.add(11);  
		  al1.add(51);  
		  al1.add(1);  
		  Collections.sort(al1);  
		  for(Integer number:al1)  
			    System.out.println(number);  
	}
}
