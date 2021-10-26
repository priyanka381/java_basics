package collections;

import java.util.ArrayList;

public class ArrayListExample2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("grapes");
		list.add("mango");
		list.add("banana");
		System.out.println("Returing element: "+list.get(1));
		list.set(1,"dates");
		for(String fruit:list)
			System.out.println(fruit);
			
	}

}
