package sub03;

public class Addler {

	public int x;

	public void add(int x) {
		this.x = x + 50;
		
		
	}
	public void add(int []arr) {
		arr[0]++;

	}
	public void add(Addler a1) {
		a1.x = a1.x + 40;
	
	}
	public Addler addNew(Addler a2) {
		a2 = new Addler();
		return a2;
	}
}
