package sub04;

/*
 * ��¥ : 2019/06/13
 * �̸� : ��â��
 * ���� : ĳ���� �ǽ��ϱ� ���� p 306
 */
public class CastingTest {

	public static void main(String[] args) {
		
		// ĳ���� - Ÿ�Ժ�ȯ
		
		double num1 = 1.23;
		int    num2 = (int) num1;
		float  num3 = (float) 5;
		
		
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		System.out.println("num3 : "+num3);
		
		
		// ��ĳ����(������)
		
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		
		// �ٿ�ĳ����
		
		Tiger t = (Tiger) a1;
		Eagle e = (Eagle) a2;
		
		t.move();
		e.move();
	}
	
}