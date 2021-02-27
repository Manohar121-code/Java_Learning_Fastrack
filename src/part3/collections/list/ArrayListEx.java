package part3.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		
		List list = new ArrayList(); // upcasting
		list.add('&');
		list.add(10);
		list.add("java");
		list.add(4);
		
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
		
		System.out.println("-------------");
		
		for (Object obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("-------------");
		
		Iterator itr = list.iterator();
		
		while (itr.hasNext()) {
			Object obj = (Object) itr.next();
			System.out.println(obj);
		}
		
		System.out.println("********** remove element *************");
		System.out.println("size before remove - "+ list.size());
		Object remove = list.remove(1);
		System.out.println("removed object - "+ remove);
		System.out.println("size after remove - "+ list.size());
		
		for (Object obj : list) {
			System.out.println(obj);
		}
		System.out.println("-------------");
		
		list.set(1, 250);
		System.out.println("after replacing 250 in first index");
		for (Object obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("-----------");
		list.add(1, 150);
		System.out.println("after adding 150 in first index");
		for (Object obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("-----------------");
		list.add(null);
		for (Object obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("remove null element");
		Object remove2 = list.remove(5);
		System.out.println("removed element is "+ remove2);
		
		for (Object obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("---------------------");
		int i = 4;
		Integer box = new Integer(i);
		Object remove3 = list.remove(box);
		System.out.println("removed elemet at 4th index - "+ remove3);
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
