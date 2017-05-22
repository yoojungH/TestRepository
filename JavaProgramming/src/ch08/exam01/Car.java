package ch08.exam01;

public class Car implements Manual{
	
	//field
	private int speed;
	
	
	//method
	@Override
	public void turnOn() {
		System.out.println("�ڵ����� �մϴ�");
	}

	@Override
	public void turnOff() {
		System.out.println("�ڵ����� ���ϴ�");
	}

	@Override
	public void setSpeed(int speed) {
		System.out.println("�ӵ��� " + speed + "�� �����մϴ�.");
		if(speed < Manual.MIN_SPEED){
			this.speed = Manual.MIN_SPEED;
		}else if(speed > Manual.MAX_SPEED ){
			this.speed = Manual.MAX_SPEED;
		}else{
			this.speed = speed;
		}
	
	}

	@Override
	public int getSpeed() {
		return speed;
		//return 0;
	}

	@Override
	public void run() {
		System.out.println("�ڵ����� " + speed + "�ӵ��� �޸��ϴ�.");
	}
	
	public void sound(){ // Manual�� ���� sound() ȣ�� �Ұ���
		
	}
	
	
	/*
	 * [�������̽� -> Ŭ������ �ٲ� �� �ִ� ���?]
	 * -> Casting ���
	 * 
	 * 
	 * */
	
	
}
