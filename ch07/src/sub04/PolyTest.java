package sub04;
/*
 * 날짜 : 2019/06/12
 * 이름 : 최창현
 * 내용 : 다형성 실습하기 교재 p288
 */
public class PolyTest {

	public static void main(String[] args) {
		
		Animal t = new Tiger();
		Animal e = new Eagle();
		Animal s = new Shark();
		
		t.move();
		t.hunt();
		
		e.move();
		e.hunt();
		
		s.move();
		s.hunt();
		
	}
	
	
}
