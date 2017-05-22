package ch06.exam04;

public class Car {
	//Field
	/* 부품 */
	Body body = new Body(); //body의 객체가 Car의 필드에 저장
	Engine engine = new Engine();
	Dashboard dashboard = new Dashboard();
	Seat[] seats = { new Seat(), new Seat(), new Seat(), new Seat()};
	Tire[] tires = { new Tire("앞우"), new Tire("앞좌"), new Tire("뒤우"), new Tire("뒤좌")};
	
	/* 고유데이터 */
	String makeDay;
	String color;
	int speed;
	
	//Constructor
	//변하지 않는 거
	Car(String makeDay, String color){
		this.makeDay = makeDay;
		this.color = color;
	}
	//Method
	
	void start(){
		engine.start();
	}
	
	void run(){
		tires[0].roll();
		tires[1].roll();
		tires[2].roll();
		tires[3].roll();
		setSpeed(60);
		dashboard.display(60);	
		
	}
	
	void setSpeed(int speed){
		this.speed = speed;
	}
	
	void stop(){
		engine.stop();
		setSpeed(0);
	}
	
	
	
	
}
