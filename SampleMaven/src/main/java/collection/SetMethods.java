package collection;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {

	public static void main(String[] args) {
		Set<String> a = new HashSet<String>();
		a.add("apple");
		a.add("banana");
		a.add("orange");
		
		Set<String> b = new HashSet<String>();
		b.add("grapes");
		b.add("peach");
		b.add("watermelon");
		
		//addAll() method
		a.addAll(b);
		System.out.println(a);
		
		//contains() method
		System.out.println(a.contains("apple"));
		
		//containsAll() method
		System.out.println(a.containsAll(b));
		
		//isEmpty() method
		System.out.println(a.isEmpty());
		
		//remove() method
		a.remove("orange");
		System.out.println(a);
		
		//removeAll() method
		a.removeAll(b);
		System.out.println(a);
		
		//size() method
		System.out.println(a.size());
		
		//clear() method
		a.clear();
		System.out.println(a);
	}

}
