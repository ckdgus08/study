package sub01;
/*
 * 날짜 : 2019/06/05
 * 이름 : 최창현
 * 내용 : 배열 실습하기 교재 p149
 */
public class ArrayTest {

	public static void main(String[] args) {
		
		// 개별 변수로 데이터 저장
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		int num5 = 5;
		
		// 배열로 데이터 저장
		int num[] = {1,2,3,4,5};
		
		// 배열 참조
		
		System.out.println("num[0] : " +num[0]);
		System.out.println("num[1] : " +num[1]);
		System.out.println("num[2] : " +num[2]);
		System.out.println("num[3] : " +num[3]);
		System.out.println("num[4] : " +num[4]);
		
		int i =0;
		
		while(i<5) {
			System.out.println("num["+i+"] : " +num[i]);
			i++;
		}
		
		//배열 연습
		
		String ps1 = "김유신";
		String ps2 = "김춘추";
		String ps3 = "장보고";
		String ps4 = "강감찬";
		String ps5 = "이순신";
		
		String[] ps = {"김유신","김춘추","장보고","강감찬","이순신"};
		for(int q=0 ; q<ps.length ; q++) {
			System.out.println("ps["+q+"] : "+ps[q]);
		}
		
	}
}
