package part3.exceptionHandling;

public class ThrowMyExpception {
	public static void main(String[] args) {
		try {
			test();
		} catch (MyException e) {
			System.out.println("MyException is catched");
		}
	}

	private static void test() throws MyException {
		throw new MyException();
	}
}
