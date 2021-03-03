package part3.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {
	public static void main(String[] args) {
		Student s1 = new Student(1, "jagadeesh");
		Student s2 = new Student(2, "Suresh");
		Student s3 = new Student(3, "Mahesh");
		
		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		ListIterator<Student> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			Student student = (Student) listIterator.next();
			System.out.println(student);
		}
		
		System.out.println("--------------");
		
		while (listIterator.hasPrevious()) {
			Student student = (Student) listIterator.previous();
			System.out.println(student);
		}
	}
}
