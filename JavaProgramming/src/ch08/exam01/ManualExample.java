package ch08.exam01;

public class ManualExample {

	public static void main(String[] args) {

		// �Ϲ��� -> Bike bike = new Bike();
		// �������̽��� ���� ���

		// Manual manual = new Bike(); // �޴��� �������̽��� ����ũ�� ����Ѵٴ� �� 
		//Manual�� �ִ´�� �޼ҵ� ȣ�� -> ������ Bike���� ����Ǵ� ��
		Manual manual = new Car();

		manual.turnOn();
		manual.setSpeed(10);
		manual.run();
		manual.turnOff();
		
		
		move(new Bike());
		move(new Car());
	}

	/*public static void move(Bike bike) {

	}

	public static void move(Car car) {

	}*/
	public static void move(Manual manual) { // �������� Ȱ���� ��, Manual �������̽��� ������ � ��ü�鵵 ���� ����
		manual.turnOn();
		manual.setSpeed(10);
		manual.run();
		manual.turnOff();
	}
	

}
