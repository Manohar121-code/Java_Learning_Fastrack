package part3.collections.treeset;

import java.util.Set;
import java.util.TreeSet;

public class PrimitiveTreeSetEx {
	public static void main(String[] args) {
		Set<Integer> integerSet = new TreeSet<Integer>();
		integerSet.add(20);
		integerSet.add(50);
		integerSet.add(10);
		integerSet.add(25);
		
		System.out.println("size - "+ integerSet.size());
		for (Integer i : integerSet) {
			System.out.println(i);
		}
	}
}
