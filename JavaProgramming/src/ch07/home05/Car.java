package ch07.home05;

public class Car {
	//Field
	Tire frontLeftTire = new Tire("�տ���",6);
	Tire frontRightTire = new Tire("�տ�����",2);
	Tire BackLeftTire = new Tire("�ڿ���",3);
	Tire BackRightTire = new Tire("�ڿ�����",4);
	
	//Constructor 
	
	//Method
	int run(){
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		if(frontLeftTire.roll()==false){
			stop();
			return 1;
		}
		if(frontRightTire.roll()==false){
			stop();
			return 2;
		}
		if(BackLeftTire.roll()==false){
			stop();
			return 3;
		}
		if(BackRightTire.roll()==false){
			stop();
			return 4;
		}
		return 0;
		
	}
	
	void stop(){
		System.out.println("[�ڵ����� ����ϴ�.]");
	}
}
