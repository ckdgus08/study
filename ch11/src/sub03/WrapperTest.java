package sub03;
/*
 * 날짜 : 2019/06/17
 * 이름 : 최창현
 * 내용 : Wrapper 클래스 실습하기 교재 p527
 */
public class WrapperTest {

	public static void main(String[] args) {
		
		// 기본타입 변수
		int     var1 = 1;
		double  var2 = 2.2;
		boolean var3 = true;
		float   var4 = 1.23f;
		
		// wrapper 클래스
		Integer w1 = new Integer(1);
		Double  w2 = new Double(2.2);
		Boolean w3 = new Boolean(true);
		Float   w4 = new Float(1.23f);
		
		System.out.println("w1 : "+w1);
		System.out.println("w2 : "+w2);
		System.out.println("w3 : "+w3);
		System.out.println("w4 : "+w4);
		
		// 문자열 -> 기본타입 변환
		String str1 = "1";
		String str2 = "1.23";
		String str3 = "false";
		String str4 = "1.23f";
		
		int v1 = Integer.parseInt(str1);
		double v2 = Double.parseDouble(str2);
		boolean v3 = Boolean.parseBoolean(str3);
		float v4 = Float.parseFloat(str4);
		
		System.out.println("v1 : "+v1);
		System.out.println("v2 : "+v2);
		System.out.println("v3 : "+v3);
		System.out.println("v4 : "+v4);
		
		// 문자열 -> Wrapper 변환
		
		Integer wr1 = Integer.valueOf(str1);
		Double  wr2 = Double.valueOf(str2);
		Boolean wr3 = Boolean.valueOf(str3);
		Float   wr4 = Float.valueOf(str4);
		
		System.out.println("wr1 : "+wr1);
		System.out.println("wr2 : "+wr2);
		System.out.println("wr3 : "+wr3);
		System.out.println("wr4 : "+wr4);
		
		// Wrapper -> 문자열 변환
		String s1 = w1.toString();
		String s2 = w2.toString();
		String s3 = w3.toString();
		String s4 = w4.toString();
		
	}
}
