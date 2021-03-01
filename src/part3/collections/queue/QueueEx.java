package part3.collections.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
		Queue q = new PriorityQueue(); //upcasting
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		
		Object peek = q.peek();
		System.out.println("head element is - "+ peek);
		
		int size = q.size();
		System.out.println("size - "+size);
		
		Object poll = q.poll();
		System.out.println("polled element - "+ poll);
		
		System.out.println("size - "+ q.size());
		
		System.out.println("------------------");
		while (q.peek() != null) {
			Object poll2 = q.poll();
			System.out.println(poll2);
		}
		System.out.println("size - "+ q.size());
		
		boolean empty = q.isEmpty();
		System.out.println("is empty? - "+ empty);
		
		System.out.println("------------------------");
		q.add(60);
		q.add(70);
		q.add(80);
		Iterator iterator = q.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		
	}
}
