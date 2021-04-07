package sub01;

import sub01.Outer.Inner;

/*
 * 날짜 : 2019/06/14
 * 이름 : 최창현
 * 내용 : 중첩클래스 실습하기 p390
 */
public class InnerTest {

	public static void main(String[] args) {
		
		Outer out = new Outer(1);
		out.info();
		
		Inner inn = out.new Inner(2);
		inn.info();
	}
}
