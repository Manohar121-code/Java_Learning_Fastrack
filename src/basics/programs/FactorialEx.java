package basics.programs;

public class FactorialEx {
	public static void main(String[] args) {
		int n = 5;
		int factorial = getFactorial(n);
		System.out.println(factorial);
	}
	
	public static int getFactorial(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result = result * i;
		}
		return result;
	}
}
