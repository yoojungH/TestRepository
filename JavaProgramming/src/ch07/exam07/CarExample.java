package ch07.exam07;

public class CarExample {
	public static void main(String[] args) {
		//�ٷ� ��ü�� �����ؼ� ������ �־���
		//Car car = new Car(new NormalTire());
		Tire tire = new SnowTire();
		Car car = new Car(tire);
		
		car.run();
		
		car.setTire(new NormalTire());
		car.run();
		
		car.setTire(new SpeedTire());
		car.run();
		
		car.setTire(new SuperTire());
		car.run();
		
	}
}
