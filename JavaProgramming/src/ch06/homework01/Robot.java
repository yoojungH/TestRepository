package ch06.homework01;

public class Robot {
	//Field
	/* ��ǰ */
	CPU cpu = new CPU();
	Head head = new Head();
	Arm[] arms = { new Arm("left"), new Arm("right")};
	Leg[] legs = { new Leg("left"), new Leg("right")};
	Joint[] joints = { new Joint("neck",90.0), new Joint("left-shoulder",15.0),new Joint("right-shoulder",15.0),
					  new Joint("left-elbow",30.0),new Joint("right-elbow",180.0),
					  new Joint("left-wrist", 10.0),new Joint("right-wrist",10.0)}; 
	/* ���������� */
	String makeDay;
	String manufactor = "Stark";
	String color;	
	int speed;
	double angle;
		

	//Constructor
	//�޼ҵ� �����ε� --- �κ��� �����Ǿ��� ��� �������� ���� ��¥�� �ٲ���
	Robot(String color){
		this("2017-03-28", color);
	}
	
	Robot(String makeDay, String color){
		this.makeDay = makeDay;
		this.color = color;
	}
	
	
	//Method	
	void info(){
		System.out.println("��������: " + makeDay);
		System.out.println("����ȸ��: " + manufactor);
		System.out.println("��    ��: " + color);
	}
	
	void start(){
		cpu.turnOn();
	}
	
	void setMotorSpeed(int speed){
		this.speed = speed;
	}
	
	void walk(){
		setMotorSpeed(500);
		legs[0].move();
		legs[1].stop();
	}
	
	void stop(){
		setMotorSpeed(0);
		cpu.turnOff();
	}
}
