package part3.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetOfStudents {
	public static void main(String[] args) {
		Student sachin = new Student(10, "Sachin", "Mumbai", 15);
		Student rohit = new Student(10, "Mumbai", "Sachin", 15);
		Student kohli = new Student(18, "Kohli", "Delhi", 10);
		
		Set<Student> set = new HashSet<Student>();
		set.add(sachin);
		set.add(rohit);
		set.add(kohli);
		
		System.out.println("size - "+ set.size());
		
		Student sachin2 = new Student(10, "Sachin", "Mumbai", 15);
		set.add(sachin2);
		
		System.out.println("size - "+ set.size());
	}
}
