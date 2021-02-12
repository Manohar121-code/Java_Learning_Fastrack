package oops.typeCasting;

public class PrimitiveTypeCasting {
	public static void main(String[] args) {
		short s = 10;
		int i = s;//widening
		
		long l = 17822;
		int i2 = (int) l; //narrowing
	}
}
