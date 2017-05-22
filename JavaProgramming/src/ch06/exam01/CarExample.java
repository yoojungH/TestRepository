package ch06.exam01;

public class CarExample {
	public static void main(String[] args) {
		//객체 생성 코드
		Car myCar = new Car(); 	
		//객체의 메소드 호출
		myCar.run();
		//객체의 필드를 읽기
		System.out.println(myCar.company);
		System.out.println(myCar.speed);	
		System.out.println(myCar.color);
		System.out.println(myCar.airbag);
		//객체의 필드 값을 변경
		myCar.speed = 30;
		myCar.run();
		myCar.color = "흰색";
		System.out.println(myCar.speed);	
		System.out.println(myCar.color);
		
		//---------------------------------------
		//Car yourCar = new Car(); 	
	
	}
}
