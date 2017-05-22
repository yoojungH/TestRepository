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
		System.out.println(location+" 관절 " +angle +"도 회전");
	}
	
	void checkServo(){
		if( angle>= 180 ){
			System.out.println(location + "부분 서보모터 교체가 필요합니다.");
		}
	}
}
