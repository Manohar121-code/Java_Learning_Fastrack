package part3.collections.list;

import java.util.ArrayList;
import java.util.List;

public class StudentArrayList {
	public static void main(String[] args) {
		
		Student s1 = new Student(1, "jagadeesh");
		Student s2 = new Student(2, "Suresh");
		Student s3 = new Student(3, "Mahesh");
		
		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		for (Student student : list) {
			System.out.println(student);
		}
	}
}
