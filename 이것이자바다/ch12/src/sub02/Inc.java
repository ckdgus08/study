package sub02;

public class Inc {

	private int num;
	
	// synchronized  동기화 블럭선언으로 쓰레드간의 경합을 막는다.
	public synchronized void setNum() {
		
		num++;
		
	}
	
	public int getNum() {
		return num;
	}
}
