package part3.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		
		List list = new ArrayList(); // upcasting
		list.add('&');
		list.add(10);
		list.add("java");
		list.add(30);
		
		System.out.println(list.size());
		
		list.add(50);
		
		System.out.println(list.size());
		
//		Integer s = (Integer) list.get(0);
//		System.out.println(s);
		
		System.out.println("-------------");
		for (int i = 0; i < list.size(); i++) {
			Object object = list.get(i);
			System.out.println(object);
		}
		
	}
}
