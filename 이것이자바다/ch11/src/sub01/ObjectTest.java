package sub01;
/*
 * 날짜 : 2019/06/17
 * 이름 : 최창현
 * 내용 : Object 클래스 실습하기 교재 p457
 */
public class ObjectTest {
	
	public static void main(String[] args) {
		
		Apple a1 = new Apple("한국", 3000);
		Apple a2 = new Apple("일본", 2000);
		Banana b1 = new Banana("필리핀", 2000);
		Banana b2 = new Banana("제주도",1500);
		
		// 업 캐스팅
		Object[] fruit={a1, a2, b1, b2};
		
		// 다운 캐스팅
		Apple f1 = (Apple) fruit[0];
		Banana f2 = (Banana) fruit[2];
		f1.info();
		f2.info();
		
	}

}
