package ch12.home04;

public class User1 extends Thread{
	//Field --- ��ü ����
	private Calculator calculator;

	//�ܺο��� Calculator �̸� �ٲ��ֱ�
	public void setCalculator(Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}
	
	//run method ������
	@Override
	public void run() {
		calculator.setMemory(100);
	}
	
}
