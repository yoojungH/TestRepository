package ch08.exam01;

public class Vehicle {
	//Field
	private Manual manual;
	
	//Constructor
	Vehicle(Manual manual){
		this.manual = manual;
		
	}
	
	
	//method
	
	public void move() { // �������̽��θ�����, Manual�� ��밡���� ��ü ��� ���� ����, ���� ��ġ: ��ü
										//move��� �ڵ�� ���Ծ����� ����� ��ü�� ���� �پ��ϰ� ���´� -> "������"
		manual.turnOn();
		manual.setSpeed(10);
		manual.run();
		manual.turnOff();
	}
}
