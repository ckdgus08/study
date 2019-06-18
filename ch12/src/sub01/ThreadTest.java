package sub01;
/*
 * 날짜 : 2019/06/18
 * 이름 : 최창현
 * 내용 : Thread 실습하기 교재 p576
 */
public class ThreadTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		SubThread sub1 = new SubThread("sub1");
		SubThread sub2 = new SubThread("sub2");

		sub1.start();
		sub2.start();
		
		for(int i=1 ; i<=10 ; i++ ) {
			
			Thread.sleep(1000);
			
			System.out.println("main 쓰레드 실행...");
			
		}
		
		System.out.println("maim 쓰레드 종료...");
		
	}

}
