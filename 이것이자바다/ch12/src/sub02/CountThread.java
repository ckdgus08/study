package sub02;

public class CountThread extends Thread{

	private Inc inc;
	
	public CountThread(Inc inc) {
		this.inc = inc ;
	}
	
	@Override
	public void run() {
		
		for(int i=1; i <=1000 ; i++) {
			inc.setNum();
		}
	}
}
