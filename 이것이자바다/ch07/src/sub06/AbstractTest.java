package sub06;

/*
 * 날짜 : 2019/06/13
 * 이름 : 최창현
 * 내용 : 추상 클래스 실습하기 교재 p329
 */
public class AbstractTest {

	public static void main(String[] args) {
		
		//추상클래스는 객체 생성 안됨.
		//Unit unit = new Unit();
		
		Unit unit1 = new Marin();
		Unit unit2 = new Zealot();
		Unit unit3 = new Zergling();
		
		unit1.move();
		unit1.attack();
		
		unit2.move();
		unit2.attack();
	
		unit3.move();
		unit3.attack();
		
	}
}
