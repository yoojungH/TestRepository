package ch12.home04;

public class User2 extends Thread{
	//Field --- ��ü ����
	private Calculator calculator;

	//�ܺο��� Calculator �̸� �ٲ��ֱ� 
	public void setCalculator(Calculator calculator) {
		this.setName("User2");
		this.calculator = calculator;
	}
	
	//run method ������
	@Override
	public void run() {
		calculator.setMemory(50);
	}
	
}
