package sub02;
/*
 * 날짜 : 2019/06/18
 * 이름 : 최창현
 * 내용 : IncreamentThread 실습하기 교재 p576
 */
public class InctThreadTest {

	public static void main(String[] args) throws InterruptedException {
		
		Inc inc = new Inc();
		
		CountThread c1 = new CountThread(inc);
		CountThread c2 = new CountThread(inc);
		CountThread c3 = new CountThread(inc);
		
		c1.start();
		c2.start();
		c3.start();
		
		// 해당 서브쓰레드가 메인쓰레드로 합류되기까지 메인쓰레드가 대기.
		c1.join();
		c2.join();
		c3.join();
		
		System.out.println("최종결과 : "+inc.getNum());
	}
}
