package ch06.exam02;

public class CarExample {
	public static void main(String[] args) {
		//��ü ���� �ڵ�
		Car myCar = new Car(); 	
		System.out.println(myCar.company);
		System.out.println(myCar.speed);	
		System.out.println(myCar.color);
		System.out.println(myCar.airbag);

		Car yourCar = new Car("����",true);
		System.out.println(yourCar.company);
		System.out.println(yourCar.speed);	
		System.out.println(yourCar.color);
		System.out.println(yourCar.airbag);
		
		yourCar = new Car("����",true);
		System.out.println(yourCar.company);
		System.out.println(yourCar.speed);	
		System.out.println(yourCar.color);
		System.out.println(yourCar.airbag);
		
		//��ü�� 3�� ����, �� �� �ִ� �� 2��
		//myCar = null; yourCar = null; 
		
	}
}
