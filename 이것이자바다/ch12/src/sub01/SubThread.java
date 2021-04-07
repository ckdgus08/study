package sub01;
/*
 * 날짜 : 2019/06/18
 * 이름 : 최창현
 * 내용 : SubThread 클래스 실습하기 교재 p576
 */
public class SubThread extends Thread{

	private String name;
	
	public SubThread(String name) {
		this.name = name;
	}
	
	
	@Override
		public void run() {
			
		for(int i=1 ; i <= 10 ; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(name+" 쓰레드 실행 ...");
			
		}
		
		System.out.println(name+" 쓰레드 종료...");
	}
	
}
