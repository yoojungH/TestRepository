package ch06.homework01;

public class Joint {
	//Field
	String location;
	double angle;
	
	//Constructor
	Joint(String location, double angle){
		this.location = location;
		this.angle = angle;
	}
	
	
	
	//Method
	void rotaion(){
		System.out.println(location+" ���� " +angle +"�� ȸ��");
	}
	
	void checkServo(){
		if( angle>= 180 ){
			System.out.println(location + "�κ� �������� ��ü�� �ʿ��մϴ�.");
		}
	}
}
