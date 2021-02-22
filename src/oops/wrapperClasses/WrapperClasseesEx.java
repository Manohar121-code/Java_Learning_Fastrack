package oops.wrapperClasses;

public class WrapperClasseesEx {
	public static void main(String[] args) {
		int i = 10;
		
		Integer obj = new Integer(i); // boxing
		
		int i2 = obj.intValue(); //unboxing
		
		System.out.println(i);
		System.out.println(i2);
		
		long l = 10000;
		Long objLong = new Long(l);
		
		long longValue = objLong.longValue();
		
		System.out.println(l);
		System.out.println(longValue);
		
	}
}
