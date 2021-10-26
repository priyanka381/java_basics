package collections;

import java.util.ArrayList;

public class ArrayListExample2 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
	      al.add("apple");
		  al.add("grapes");
		  al.add("mango");
		  al.add("banana");
		System.out.println("Returing element: "+al.get(1));
		al.set(1,"dates");
		for(String fruit:al)
			System.out.println(fruit);
			
	}

}
