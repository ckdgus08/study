package sub02;
/*
 * 날짜 : 2019/06/04
 * 이름 : 최창현
 * 내용 : for문 실습하기 교재 p119
 */
public class ForTest {

	public static void main(String[] args) {
		
		
		System.out.println("a");
		System.out.println("b");
		System.out.println("c");
		System.out.println("d");
		
		System.out.print("ㄱ");
		System.out.print("ㄴ");
		System.out.print("ㄷ");
		System.out.print("ㄹ\n");
		
		
		
		
		
		System.out.println("hello Java~");
		
		// for
		
		for(int i=1 ; i<=3 ; i++) { 
			System.out.println("hello Java!");
		}

		// 1부터 10까지 합
		int sum = 0;
		
		for(int k=1; k<=10; k++) {
			sum += k ;
		}
			System.out.println("1부터 10까지 합 : "+sum);
			
			// 1부터 10 까지 짝수 합
			int tot = 0;
			for(int k=1; k<=10 ; k++) {
				if(k%2 == 1) {
					tot+= k ;
				}
			}
			System.out.println("1부터 10까지 짝수합 : "+tot);
			
			// 중첩 for문 
			for(int a=1 ; a<= 3 ; a++) {
			System.out.println("a : "+a);	
				for(int b=1; b<=5 ;b++) {
					System.out.println("b : "+b);
				}
			}
			
			
			//구구단 출력
			
			for(int a=2; a<=9; a++) {
				
				System.out.println(a+"단 출력");
				for(int b=1; b<=9; b++) {
					
					int c = a * b ;
					System.out.println(a+"x"+b+"="+c);
					
					
				}
			}
			
			//별 삼각형 출력
			
			for(int start=10; start>=1;start--) {
				for(int end=1;end<=start;end++) {
					System.out.print("★");
				}
				System.out.print("\n");
			}
			
			
			
			
			
			
	}
}
