package ch06.homework01;

public class Leg {
	//Field
	String location;
	
	//Constructor
	Leg(String location) {
		this.location = location;
	}
	
	//Method
	void move(){
		System.out.println(location + " �ٸ� ����");
	}
	void stop(){
		System.out.println(location + " �ٸ� ����");
	}

}
