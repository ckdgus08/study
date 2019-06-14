package sub04;

public class PolyTest2 {

	public static void main(String[] args) {
		
		Tiger t = new Tiger();
		Eagle e = new Eagle();
		Shark s = new Shark();
		
		// 다형성을 이용한 객체배열
		Animal[] obj = {t, e, s};
		
		obj[0].move();
		obj[0].hunt();
		
		obj[1].move();
		obj[1].hunt();
		
		obj[2].move();
		obj[2].hunt();
		
		// 다형성을 이용한 메서드의 매개변수
		move(t);
		move(e);
		move(s);
	} // main end
	
	
	public static void move(Animal a) {
		a.move();
	}
}
