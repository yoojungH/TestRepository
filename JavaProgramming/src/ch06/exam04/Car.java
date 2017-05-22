package ch06.exam04;

public class Car {
	//Field
	/* ��ǰ */
	Body body = new Body(); //body�� ��ü�� Car�� �ʵ忡 ����
	Engine engine = new Engine();
	Dashboard dashboard = new Dashboard();
	Seat[] seats = { new Seat(), new Seat(), new Seat(), new Seat()};
	Tire[] tires = { new Tire("�տ�"), new Tire("����"), new Tire("�ڿ�"), new Tire("����")};
	
	/* ���������� */
	String makeDay;
	String color;
	int speed;
	
	//Constructor
	//������ �ʴ� ��
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
