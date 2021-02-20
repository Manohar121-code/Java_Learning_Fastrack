package oops.encapsulation;

public class BeanClassEx {
	public static void main(String[] args) {
		JavaBeanClass obj = new JavaBeanClass(10, "java");
		
		System.out.println(obj);
		
		obj.setId(20);
		obj.setName("golang");
		
		System.out.println(obj);
	}
}
