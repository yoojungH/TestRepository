package ch08.exam01;

public class ManualExample {

	public static void main(String[] args) {

		// 일반적 -> Bike bike = new Bike();
		// 인터페이스를 쓰는 방법

		// Manual manual = new Bike(); // 메뉴얼 인터페이스로 바이크를 사용한다는 뜻 
		//Manual에 있는대로 메소드 호출 -> 실제는 Bike에서 실행되는 것
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
	public static void move(Manual manual) { // 다형성을 활용한 예, Manual 인터페이스로 구현한 어떤 객체들도 대입 가능
		manual.turnOn();
		manual.setSpeed(10);
		manual.run();
		manual.turnOff();
	}
	

}
