package ch06.exam01;

public class Car {
	//Field
	//String company; //������ �ٲ� �� ����.
	String company = "�����ڵ���"; //default ������ (�⺻�� ����) �ְ� ���� �� ���
	int speed;
	String color;
	boolean airbag;
		
//	//Constructor
//	Car(){
//		//��ü�� ��� ������
//		System.out.println("Car ��ü ����");
//		
//	}
//  //������ ������ �ʾƵ� �����Ϸ��� �ڵ����� �־��ش�.
		
	//Method
	//��ü�� �����ϴ� ���
	void run(){
		System.out.println("���� "+ speed + "km/h�� �޸��ϴ�.");
	}


}
