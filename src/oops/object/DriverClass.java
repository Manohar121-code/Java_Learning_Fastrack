package oops.object;

public class DriverClass {
	public static void main(String[] args) {
		Sample s1 = new Sample();
		s1.id = 10;
		s1.name = "java";
		
		Sample s2 = new Sample();
		s2.id = 20;
		s2.name = "golang";
		
		Sample s3 = new Sample();
		s3.id = 30;
		s3.name = "c++";
		
		System.out.println(s1.id);
		System.out.println(s1.name);
		
		System.out.println("----------");
		
		System.out.println(s2.id);
		System.out.println(s2.name);
		
		System.out.println("------------");
		
		System.out.println(s3.id);
		System.out.println(s3.name);
		
		System.out.println("------------");
		
		s1.xyz = "abc";
		
		System.out.println(s1.xyz);
		System.out.println(s2.xyz);
		System.out.println(s3.xyz);
		
		s2.xyz = "something else";
		System.out.println(s1.xyz);
		System.out.println(s2.xyz);
		System.out.println(s3.xyz);
		
	}
}
