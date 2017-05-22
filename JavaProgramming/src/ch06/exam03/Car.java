package ch06.exam03;

public class Car {
	//Field
	//String company; //������ �ٲ� �� ����.
	String company = "�����ڵ���"; //default ������ (�⺻�� ����) �ְ� ���� �� ���
	int speed;
	String color;
	boolean airbag;
		
	//Constructor
	//Constructor Overloading 
	//�����ε��� ������, �޼ҵ带 ������ �����ϴ� ��
	//�Ű����� ����,Ÿ��,������ �޶�� �Ѵ�.
	Car(){
		this("�����ڵ���",null,false);
	}
	
	Car(String color, boolean airbag){
//		//this ���� ��ü�� ���� --> �ʵ��� ������ 
//		this.color = color;			
//		this.airbag = airbag;		
		//this(); ���� �� �ٸ� �����ڸ� ȣ�����ֽÿ� --> �ߺ��ڵ� ���� ���� p.212
		this("�����ڵ���",color,airbag);
	}
	
	Car(String company, String color, boolean airbag){
		this.company=company;
		this.color=color;
		this.airbag=airbag;
	}
	
	//Method
	//��ü�� �����ϴ� ���
	void run(){
		System.out.println("���� "+ speed + "km/h�� �޸��ϴ�.");
	}


}
