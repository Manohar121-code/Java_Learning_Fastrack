package part3.exceptionHandling;

public class HandleNullPointerException {
	public static void main(String[] args) {
		String s = null;
		int length = getStringLength(s);
		System.out.println("Length - " + length);
		
		System.out.println("-----------------------------");
		
		int len = getStringLengthHandlingExp(s);
		System.out.println("Length - "+ len);
	}

	private static int getStringLength(String s) {
		if (s == null) {
			return 0;
		}
		int length = s.length();
		return length;
	}
	
	private static int getStringLengthHandlingExp(String s) {
		int length = 0;
		try {
			length = s.length();
			System.out.println("length determined");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException occurred");
		} catch (Exception e) {
			System.out.println("Exception occurred");
		}
		return length;
	}
}
