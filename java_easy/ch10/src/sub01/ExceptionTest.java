package sub01;
/*
 * 날짜 : 2019/06/14
 * 이름 : 최창현
 * 내용 : 예외처리 실습하기 p422
 */
public class ExceptionTest {
	
	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 0;
		int num3 = 3;
		int num4 = 4;
		int rs1= 0, rs2=0 , rs3=0, rs4=0;
		
		try {
			// 에러가 발생할 수 있는 코드블럭
			rs1 = num1 + num2;
			rs2 = num1 - num2;
			rs3 = num2 * num3;
			rs4 = num4 / num2;
		} catch (Exception e) {
			// 에러가 발생했을때 처리 할 코드블럭
			System.out.println("에러발생");
		}
		System.out.println("rs1 : "+rs1);
		System.out.println("rs2 : "+rs2);
		System.out.println("rs3 : "+rs3);
		System.out.println("rs4 : "+rs4);
		
		System.out.println("프로그램 종료...");
	}
}
