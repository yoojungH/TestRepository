package ch07.exam07;
//CarExample --- ´ÙÇü¼º
public class Car {
	//Field
	private Tire tire;
	
	//Constructor
	public Car(Tire tire){
		this.tire = tire;
	}
	//Method
	public void run(){
		tire.roll();
	}
	
	
	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
}
