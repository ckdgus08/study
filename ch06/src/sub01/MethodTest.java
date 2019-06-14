package sub01;
/*
 * 날짜 : 2019/06/07
 * 이름 : 최창현
 * 내용 : 메서드 실습하기 p214
 */
public class MethodTest {

	public static void main(String[] args) {
		
		// 메서드 실행(호출)
		int rs1 = fx(1);
		int rs2 = fx(2);
		int rs3 = fx(3);
		System.out.println("rs1 : "+rs1);
		System.out.println("rs2 : "+rs2);
		System.out.println("rs3 : "+rs3);

		
	}
	
	// 메서드 정의
	public static int fx(int x) {
		// 메서드(함수) : 일련의 코드로직, 반복적으로 사용할 코드를 모듈화 
		int y = 2 * x + 3;
				
		return y;		
		
	}
	
	
}



