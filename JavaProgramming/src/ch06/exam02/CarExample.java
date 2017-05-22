package ch06.exam02;

public class CarExample {
	public static void main(String[] args) {
		//객체 생성 코드
		Car myCar = new Car(); 	
		System.out.println(myCar.company);
		System.out.println(myCar.speed);	
		System.out.println(myCar.color);
		System.out.println(myCar.airbag);

		Car yourCar = new Car("검정",true);
		System.out.println(yourCar.company);
		System.out.println(yourCar.speed);	
		System.out.println(yourCar.color);
		System.out.println(yourCar.airbag);
		
		yourCar = new Car("빨강",true);
		System.out.println(yourCar.company);
		System.out.println(yourCar.speed);	
		System.out.println(yourCar.color);
		System.out.println(yourCar.airbag);
		
		//객체는 3개 생성, 쓸 수 있는 건 2개
		//myCar = null; yourCar = null; 
		
	}
}
