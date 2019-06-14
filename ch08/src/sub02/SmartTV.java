package sub02;

public class SmartTV extends TV implements Computer,Chromecast{

	@Override
	public void booting() {
		System.out.println("SmartTV - booting!!!");
	}

	@Override
	public void internet() {
		System.out.println("SmartTV - internet...");
		
	}

	@Override
	public void syncAndroid() {
		System.out.println("SmartTV - 안드로이드 동기화 ...");
	}

	
}
