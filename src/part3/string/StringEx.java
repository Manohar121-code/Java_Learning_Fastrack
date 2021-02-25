package part3.string;

public class StringEx {
	public static void main(String[] args) {
		String s1 = "java";
		
		String s2 = new String("java");
		
		if (s1 == s2) {
			System.out.println("address is same");
		} else {
			System.out.println("address is not same");
		}
		
		if (s1.equals(s2)) {
			System.out.println("content is same");
		} else {
			System.out.println("content is not same");
		}
		
		System.out.println("-----------");
		String s3 = "java";
		if (s1 == s3) {
			System.out.println("address is same");
		} else {
			System.out.println("address is not same");
		}
		
		System.out.println("------------------------");
		String s4 = new String("java");
		if (s2 == s4) {
			System.out.println("address is same");
		} else {
			System.out.println("address is not same");
		}
		System.out.println("---------------------------------");
		String intern = s4.intern();
		if (s1 == intern) {
			System.out.println("address is same");
		} else {
			System.out.println("address is not same");
		}
	}
}
