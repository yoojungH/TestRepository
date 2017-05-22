package ch06.exam01;

public class Car {
	//Field
	//String company; //데이터 바뀔 수 있음.
	String company = "현대자동차"; //default 값으로 (기본값 지정) 넣고 싶을 때 사용
	int speed;
	String color;
	boolean airbag;
		
//	//Constructor
//	Car(){
//		//객체를 어떻게 만들지
//		System.out.println("Car 객체 생성");
//		
//	}
//  //생성자 만들지 않아도 컴파일러가 자동으로 넣어준다.
		
	//Method
	//객체가 제공하는 기능
	void run(){
		System.out.println("현재 "+ speed + "km/h로 달립니다.");
	}


}
