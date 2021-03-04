package part3.collections.treeset;

import java.util.Set;
import java.util.TreeSet;

public class StudenTreeSetByName {
	public static void main(String[] args) {
		Student sachin = new Student(10, "Sachin", "Mumbai", 15);
		Student rohit = new Student(45, "Rohit", "Mumbai", 15);
		Student kohli = new Student(18, "Kohli", "Delhi", 10);
		Student kohliXYZ = new Student(18, "Kohxyz", "Delhi", 10);
		
		SortByName nameComparator = new SortByName();
		
		Set<Student> set = new TreeSet<>(nameComparator);
		set.add(sachin);
		set.add(rohit);
		set.add(kohli);
		set.add(kohliXYZ);
		
		for (Student st : set) {
			System.out.println(st);
		}
	}
}
