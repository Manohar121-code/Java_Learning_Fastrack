package basics.methods;

public class MethodsEx {
	public static void main(String[] args) {
		m1();
		int i = m2();
		System.out.println("m2() returned value - "+ i);
		int sum = sum(2, 5);
		System.out.println("sum - "+ sum);
	}
	
	public static void m1() {
		System.out.println("m1() called");
	}
	
	public static int m2() {
		System.out.println("m2() called");
		int i = 29;
		return i;
	}
	
	public static int sum(int i, int j) {
		System.out.println("sum() called");
		return i+j;
	}
}
