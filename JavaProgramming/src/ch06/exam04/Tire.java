package ch06.exam04;

public class Tire {
	//Field
	String location;
	//Constructor
	//�Ű������� �ִ� �����ڸ� ������� ��� �⺻�����ڴ� �������� ��
	Tire(String location){
		this.location = location;
	}
	
	//Method
	void roll(){
		System.out.println(location + " Ÿ�̾ ���ư�");
	}
}
