package basics.string;

public class StringBasicsEx {
	public static void main(String[] args) {
		String s = "java is a programming language";
		int len = s.length();
		System.out.println("length is - "+ len);
		
		char charAt = s.charAt(2);
		System.out.println("char at 2nd index - "+ charAt);
		
		int indexOf = s.indexOf('a');
		System.out.println("index of a - "+ indexOf);
		
		int indexOf2 = s.indexOf('a', 2);
		System.out.println("index of second a - "+ indexOf2);
		
		int indexOf3 = s.indexOf('a', 4);
		System.out.println("index of third a - "+ indexOf3);
		
		int lastIndexOf = s.lastIndexOf('a');
		System.out.println("last index of a - "+ lastIndexOf);
		
		boolean equals = s.equals("java is a programming language");
		System.out.println(equals);
		
		String substring = s.substring(2);
		System.out.println(substring);
		
		String substring2 = s.substring(4, 13);
		System.out.println(substring2);
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = upperCase.toLowerCase();
		System.out.println(lowerCase);
		
		String upperCase2 = lowerCase.toUpperCase();
		System.out.println(upperCase2);
		
		char charAt2 = upperCase2.charAt(2);
		System.out.println(charAt2);
		
	}
}
