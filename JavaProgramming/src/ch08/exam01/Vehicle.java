package ch08.exam01;

public class Vehicle {
	//Field
	private Manual manual;
	
	//Constructor
	Vehicle(Manual manual){
		this.manual = manual;
		
	}
	
	
	//method
	
	public void move() { // 인터페이스로만구현, Manual로 사용가능한 객체 모두 대입 가능, 실제 위치: 객체
										//move라는 코드는 변함없지만 결과는 객체에 따라 다양하게 나온다 -> "다형성"
		manual.turnOn();
		manual.setSpeed(10);
		manual.run();
		manual.turnOff();
	}
}
