package ch06.homework01;

public class Arm {
	//Field
	String location;
	
	
	//Constructor
	Arm(String location){
		this.location = location;
	}
	

	
	//Method
	void move(){
		System.out.println(location +" ÆÈ µ¿ÀÛ");	

	}

	void stop(){
		System.out.println(location +" ÆÈ Á¤Áö");
	}
}
