package ch06.homework01;

public class RobotExample {
	public static void main(String[] args) {
		//��ü ����
		Robot myRobot = new Robot("2017-03-01","Silver");
		
		System.out.println("--------------------");
		myRobot.info();
		System.out.println("--------------------");
		
		
		myRobot.start();
		////CPU�� �޼ҵ� ȣ��
		//myRobot.cpu.turnOn();
		
		System.out.println("--------------------");
		
		myRobot.walk();
		////Leg�� �޼ҵ� ȣ��
		//myRobot.legs[0].move();
		//myRobot.legs[1].stop();
			
		System.out.println("--------------------");
		myRobot.arms[1].move();
		
		myRobot.joints[2].rotaion();
		myRobot.joints[4].rotaion();
		myRobot.joints[6].rotaion();
		
		for(int i=0;i<myRobot.joints.length;i++){
			myRobot.joints[i].checkServo();
			
		}
	
		System.out.println("--------------------");
		myRobot.stop();
		////CPU�� �޼ҵ� ȣ��
		//myRobot.cpu.turnOff();
			
		//������ �����ε�
		myRobot = new Robot("Silver");		
		System.out.println("--------��ü��-------");
		myRobot.info();
		System.out.println("--------------------");
		
	}
}
