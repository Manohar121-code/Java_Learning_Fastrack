package part3.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx {
	public static void main(String[] args) {
		Student sachin = new Student(10, "Sachin", "Mumbai", 15);
		Student rohit = new Student(45, "Rohit", "Mumbai", 15);
		Student kohli = new Student(18, "Kohli", "Delhi", 10);

		Student kohliDuplicate = new Student(18, "Kohli", "Delhi", 10);
		
		Set<Student> set = new LinkedHashSet<Student>();
		set.add(sachin);
		set.add(rohit);
		set.add(kohli);
		set.add(kohliDuplicate);
		
		for (Student stu : set) {
			System.out.println(stu);
		}
	}
}
