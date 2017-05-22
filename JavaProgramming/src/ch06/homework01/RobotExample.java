package ch06.homework01;

public class RobotExample {
	public static void main(String[] args) {
		//객체 생성
		Robot myRobot = new Robot("2017-03-01","Silver");
		
		System.out.println("--------------------");
		myRobot.info();
		System.out.println("--------------------");
		
		
		myRobot.start();
		////CPU의 메소드 호출
		//myRobot.cpu.turnOn();
		
		System.out.println("--------------------");
		
		myRobot.walk();
		////Leg의 메소드 호출
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
		////CPU의 메소드 호출
		//myRobot.cpu.turnOff();
			
		//생성자 오버로딩
		myRobot = new Robot("Silver");		
		System.out.println("--------교체후-------");
		myRobot.info();
		System.out.println("--------------------");
		
	}
}
