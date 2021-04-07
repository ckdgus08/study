package sub03;

public final class BBB extends AAA {

	@Override  //어노테이션
	public void md1() {
		System.out.println("BBB - md1()");
	}
	
	//Overloading method
	public final void md2(int a) {
		System.out.println("BBB - md2()");   // fianl 메서드는 자식클래스에서 override 할 수 없다.
	}
	
}
