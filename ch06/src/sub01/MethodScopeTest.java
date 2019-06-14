package sub01;
/*
 * 날짜 : 2019/06/07
 * 이름 : 최창현
 * 내용 : 메서드 영역 메모리 실습하기
 */
public class MethodScopeTest {

	public static void main(String[] args) {
		
		int result = 0;
		int start = 1;
		int end = 10;
		
		result = sum(start, end);
		
		System.out.println("결과 : "+result);
		
	}
	
	public static int sum(int s, int e) {
		int sum=0;
		
		for(int k=s;k<=e;k++) {
			sum += k ;
		}
		return sum;
	}
}
