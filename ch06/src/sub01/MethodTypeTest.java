package sub01;
/*
 * 날짜 : 2019/06/07
 * 이름 : 최창현
 * 내용 : 메서드 타입 실습하기 p214
 */
public class MethodTypeTest {

	public static void main(String[] args) {
		
		// 메서드 호출(실행)
		int r1 = type1(2, 3);
		int r2 = type1(5, 7);
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		
		int score1[] = {1,3,5,7,9};
		int score2[] = {2,4,6,8,10};
		type2(score1);
		type2(score2);
		
		double r3 = type3();
		System.out.println("r3 : "+r3);
		
		type4();
		
		// 구구단 메서드 실행
		for(int q=2; q<=9; q++) {
			gugudan(q);
		}
		
		
	}
	
	public static void gugudan(int num1) { 
		for(int num2=1; num2<=9; num2++) {
			
		System.out.println(num1+"단  = "+num1+"*"+num2+" : "+num1*num2);
		}
	}
	
	
	
	//타입1 - 매게변수 O , 리턴값 O
	public static int type1(int x, int y) {
		int z = x * y;
		return z;		
		
	}
	
	//타입1 - 매게변수 O , 리턴값 X
	public static void type2(int[] score) {
		
		int sum = 0;
		
		for(int k=0; k < score.length ; k++) { 
			sum += score[k];
			
		}
		System.out.println("score 합 :" +sum );
		
	}
	
	//타입1 - 매게변수 X , 리턴값 O
	public static double type3() {
		
		return 3.14;
		
		
		
	}
	
	//타입1 - 매게변수 X , 리턴값 X
	public static void type4() {
		
		int result = type1(3,4) ;
		System.out.println("type1(3,4) 결과  : "+result);
		
		
	}
	
}
