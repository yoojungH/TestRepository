package ch07.exam09;

public class NormalTire extends Tire {
	//Field
	//Constructor
	NormalTire(){
		super();
		System.out.println("NormalTire ��ü ����");
	}
	
	
	
	//Method
	
	@Override
	void roll() {
		System.out.println("�Ϲ� Ÿ�̾ �������ϴ�."); // ������
	
	}
}
