package sub04;

public class Increment {

	// 멤버변수 (캡슐화)
	private int num1;
	// 클래스 변수, 정적 변수
	public static int num2;
	
	public Increment( ) {
		this.num1++;
		this.num2++;
		
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
	}
	
	// 클래스 메서드, 정적 메서드
	public static void add( ) {
		// static 메서드에서는 none static 변수를 참조 할 수 없다.
		//num1++;    
		num2++;
	}
}
