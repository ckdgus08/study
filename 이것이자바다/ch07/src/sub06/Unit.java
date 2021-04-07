package sub06;

// 추상 클래스 
//  - 추상 메서드를 포함 하는 클래스 - 
//  - 상속을 위한 클래스

public abstract class Unit {

	// 추상 메서드
	public abstract void attack();
	
	public void move() {
		System.out.println("unit move...");
	}
	
}
