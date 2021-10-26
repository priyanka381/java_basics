package collections;

import java.util.ArrayList;

public class ArrayListExample1 {
public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<String>();
	list.add("apple");
	list.add("grapes");
	list.add("mango");
	list.add("banana");

for(String fruit:list)
	System.out.println(fruit);
}
}
