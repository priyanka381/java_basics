package collections;

import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("priya");
		names.add("ravi");
		//names.add(40);
		System.out.println(names);
		for(String name : names) {
		System.out.println("the name is "+names);
		}
	}

}
