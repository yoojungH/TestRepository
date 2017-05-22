package ch07.exam09;

public class Car {
	//Field
	private Tire tire;
	
	//Constructor
	public Car(Tire tire){
		this.tire = tire;
	}
	//Method
	
	
	public void run() {
		tire.roll();
		if (tire instanceof SnowTire) {
			SnowTire snowtire = (SnowTire) tire;
			snowtire.notSlide();
		}

	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}

}
