package sub04;
/*
 * 날짜 : 2019/06/10
 * 이름 : 최창현
 * 내용 : 클래스 실습하기 
 */
public class StaticTest {
	
	public static void main(String[] args) {
		
		Increment inc1 = new Increment();
		Increment inc2 = new Increment();
		Increment inc3 = new Increment();
		
		inc1.num2 = 2;
		inc1.add();
		
		// 클래스변수, 클래스메서드는 이미 고정할당영역에 생성되어 있기 때문에 
		// 객체 생성 없이 바로 실행(참조) 할 수 있다.
		
		Increment.num2 = 2;
		Increment.add();
	
		// 싱글톤 객체 얻기
		
		//Calc cal = new Calc();
		
		Calc cal = Calc.getInstance();
		
		int r1 = cal.plus(1, 3);
		int r2 = cal.minus(1, 3);
		int r3 = cal.multi(2, 3);
		int r4 = cal.div(8, 2);
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
		
	}

}
