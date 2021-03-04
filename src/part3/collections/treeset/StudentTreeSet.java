package part3.collections.treeset;

import java.util.Set;
import java.util.TreeSet;

public class StudentTreeSet {
	public static void main(String[] args) {
		Student sachin = new Student(10, "Sachin", "Mumbai", 15);
		Student rohit = new Student(45, "Rohit", "Mumbai", 15);
		Student kohli = new Student(18, "Kohli", "Delhi", 10);
		
		Set<Student> treeSetObj = new TreeSet<Student>();
		treeSetObj.add(sachin);
		treeSetObj.add(rohit);
		treeSetObj.add(kohli);
		
		for (Student stu : treeSetObj) {
			System.out.println(stu);
		}
	}
}
