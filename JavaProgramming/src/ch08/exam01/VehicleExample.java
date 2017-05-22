package ch08.exam01;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle(new Bike());
		
		vehicle1.move(); // Bike의 메소드 실행됨
	}

}
