package ch06.exam03;

public class Car {
	//Field
	//String company; //데이터 바뀔 수 있음.
	String company = "현대자동차"; //default 값으로 (기본값 지정) 넣고 싶을 때 사용
	int speed;
	String color;
	boolean airbag;
		
	//Constructor
	//Constructor Overloading 
	//오버로딩은 생성자, 메소드를 여러개 생성하는 거
	//매개변수 갯수,타입,순서가 달라야 한다.
	Car(){
		this("현대자동차",null,false);
	}
	
	Car(String color, boolean airbag){
//		//this 현재 객체의 참조 --> 필드의 데이터 
//		this.color = color;			
//		this.airbag = airbag;		
		//this(); 나의 또 다른 생성자를 호출해주시오 --> 중복코드 재사용 가능 p.212
		this("현대자동차",color,airbag);
	}
	
	Car(String company, String color, boolean airbag){
		this.company=company;
		this.color=color;
		this.airbag=airbag;
	}
	
	//Method
	//객체가 제공하는 기능
	void run(){
		System.out.println("현재 "+ speed + "km/h로 달립니다.");
	}


}
