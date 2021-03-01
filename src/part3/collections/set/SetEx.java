package part3.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetEx {
	public static void main(String[] args) {
		Set setObj = new HashSet();
		setObj.add(10);
		setObj.add(true);
		setObj.add("program");
		
		System.out.println("Size - "+ setObj.size());
		
		setObj.add(10);
		System.out.println("Size - "+ setObj.size());
		
		for (Object object : setObj) {
			System.out.println(object);
		}
		
		boolean contains = setObj.contains(10);
		System.out.println("10 is existed or not - "+ contains);
		
	}
}
