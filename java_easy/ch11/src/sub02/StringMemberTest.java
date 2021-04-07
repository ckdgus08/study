package sub02;
/*
 * 날짜 : 2019/06/17
 * 이름 : 최창현
 * 내용 : String 클래스 실습하기 교재 p496
 */
public class StringMemberTest {

	public static void main(String[] args) {
		
		String str = "Hello Korea";
		
		// length - 문자열 
		System.out.println("str 문자열 길이 : "+str.length());
		
		// charAt - 문자 추출
		System.out.println("str 6번째 문자열 : "+str.charAt(6));
		
		// substring - 문자열 자르기
		System.out.println("substring(0,5)"+str.substring(0, 5));
		System.out.println("substring(6)"+str.substring(6));
		
		// indexOf, lastIndexOf - 특정 문자 인덱스값을 추출
		int idx1 =str.indexOf("e");
		int idx2 = str.lastIndexOf("e");
		System.out.println("idx1 : "+idx1);
		System.out.println("idx2 : "+idx2);
		
		//replace - 문자열 교체
		String rs = str.replace("Korea", "Busan");
		System.out.println("re : "+rs);
		
		//valueOf - 일반타입 변수를 문자열로 변환
		int     var1 = 11;
		double  var2 = 1.12345;
		boolean var3 = true;
		
		String s1 = String.valueOf(var1);
		String s2 = String.valueOf(var2);
		String s3 = ""+var3;
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
	}
}
