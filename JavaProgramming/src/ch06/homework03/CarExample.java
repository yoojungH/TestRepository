package ch06.homework03;

public class CarExample {
	public static void main(String[] args) {
		//��ü����
		//Car myCar = new Car();
		Car myCar = new Car("����",3000);
		
		//�ʵ尩 �б�
		System.out.println("����ȸ��: "+myCar.company);
		System.out.println("�𵨸�: "+myCar.model);
		System.out.println("����: "+myCar.color);
		System.out.println("�ְ�ӵ�: "+myCar.maxSpeed);
		System.out.println("����ӵ�: "+myCar.speed);
		
		//�ʵ尪 ����
		myCar.speed = 60;
		System.out.println("������ �ӵ�: "+myCar.speed);
		
		
		
	}
}
