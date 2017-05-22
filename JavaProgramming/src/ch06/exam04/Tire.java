package ch06.exam04;

public class Tire {
	//Field
	String location;
	//Constructor
	//매개변수가 있는 생성자를 만들었을 경우 기본생성자는 생성되지 않
	Tire(String location){
		this.location = location;
	}
	
	//Method
	void roll(){
		System.out.println(location + " 타이어가 돌아감");
	}
}
