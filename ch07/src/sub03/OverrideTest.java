package sub03;
/*
 * 날짜 : 2019/06/12
 * 이름 : 최창현
 * 내용 : 오버라이드 메서드 실습하기 교재 p288
 */
public class OverrideTest {

	public static void main(String[] args) {
		
		BBB b = new BBB();
		
		b.md1();   // overriding 
		b.md2();   // overloading 
		b.md2(1);
		b.md3();
		
		//final 실습하기
		
		final int NUM = 1;  // final = 변수    :  상수로 만듬 (변수 이름 대문자로 표기)
							//       = 메서드 : 오버라이드 금지
							//       = 클래스 : 상속 금지
		final double PI = 3.14;
		// num = 2 ;
	}
}
