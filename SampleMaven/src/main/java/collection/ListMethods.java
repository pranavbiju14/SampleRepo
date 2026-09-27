package collection;

import java.util.*;

public class ListMethods {

	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();
		
		//add() method
		a.add("red");
		a.add("green");
		a.add("blue");
		a.add("red");
		a.add("yellow");
		System.out.println(a);
		
		//get() method
		System.out.println(a.get(1));
		
		//set() method
		a.set(1, "black");
		System.out.println(a);
		
		//indexOf() method
		System.out.println(a.indexOf("red"));
		
		//lastIndexOf() method
		System.out.println(a.lastIndexOf("red"));
		
		//remove() method
		a.remove(2);
		System.out.println(a);
		
		//contains() method
		System.out.println(a.contains("blue"));
		
		//isEmpty() method
		System.out.println(a.isEmpty());
		
		//size() method
		System.out.println(a.size());
		
	}

}
