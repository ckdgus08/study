package p223;

public class Car {

	//�ʵ� 
	int gas;
	
	//������
	
	//�޼ҵ�
	
	public void setGas(int gas) {
		this.gas = gas;
		
	}
	
	public boolean isLeftGas() {
		if(gas==0) {
			System.out.println("������ �����ϴ�");
			return false; // false�� ����
		}
		System.out.println("������ �ֽ��ϴ�");
		return true; // true�� ���� 
	}
	
	public void run() { 
		while(true) {
			if(gas>0) {
				System.out.println(" �޸��ϴ�. (���� �ܷ� : "+gas+")");
				gas -= 1;
			} else {
				System.out.println(" ����ϴ� (���� �ܷ� : "+gas+")");
				return;
			}
		}
	}
}