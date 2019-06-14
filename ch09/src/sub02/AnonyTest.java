package sub02;
/*
 * 날짜 : 2019/06/14
 * 이름 : 최창현
 * 내용 : 익명객체 실습하기 p404
 */
public class AnonyTest {

	public static void main(String[] args) {
		
		//익명객체 - 인터페이스를 클래스 구현 없이 new 연산으로 정의한 형태 
		
		Person p = new Person() {
			
			@Override
			public void info() {
				System.out.println("Person info 실행....");
			}
			
			@Override
			public void hello() {
				System.out.println("안녕하세요.");

			}
		};
		
		p.hello();
		p.info();
		
		
	}
	
}
