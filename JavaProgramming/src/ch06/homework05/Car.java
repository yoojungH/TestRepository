package ch06.homework05;

public class Car {

	//Field
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;

	//Constructor
	Car(){
		
	}
	
	Car(String model){
		this(model,"����",250);
	}
	
	Car(String model, String color){
		this(model,color,250);
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
//	Car(String model){
//		this.model = model;
//	}
//	
//	Car(String model, String color){
//		this.model = model;
//		this.color = color;
//	}
//	Car(String model, String color, int maxSpeed){
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = maxSpeed;
//	}
	
	
}
