package ch06.exam01;

public class CarExample {
	public static void main(String[] args) {
		//��ü ���� �ڵ�
		Car myCar = new Car(); 	
		//��ü�� �޼ҵ� ȣ��
		myCar.run();
		//��ü�� �ʵ带 �б�
		System.out.println(myCar.company);
		System.out.println(myCar.speed);	
		System.out.println(myCar.color);
		System.out.println(myCar.airbag);
		//��ü�� �ʵ� ���� ����
		myCar.speed = 30;
		myCar.run();
		myCar.color = "���";
		System.out.println(myCar.speed);	
		System.out.println(myCar.color);
		
		//---------------------------------------
		//Car yourCar = new Car(); 	
	
	}
}
