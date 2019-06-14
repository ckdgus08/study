package p46;

public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 1000000000000;  //컴파일 에러
		long var4 = 1000000000000L;
		long var5 = 2147483647;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
		System.out.println(var5);
		
		
		byte byteValue = 10;
		char charValue = 'A';
		
		int intValue1 = byteValue;
		int intValue2 = charValue;
		double shortValue = charValue;
		double doubleValue = byteValue;
		
		System.out.println(intValue1);
		System.out.println(intValue2);
		System.out.println(doubleValue);
		System.out.println(shortValue);
		
		
	
	}

}
