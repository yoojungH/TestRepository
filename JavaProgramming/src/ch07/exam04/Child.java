package ch07.exam04;

public class Child extends Parent{
//	//Field
//	String firstName = "�ڹ�";
//	//Constructor
//
//	Child(){
//		super("��");
//		System.out.println("Child ��ü ����");
//	}
	
	//Field
	String firstName;
	//Constructor

	Child(String lastName, String firstName){
		super(lastName);
		this.firstName = firstName;
	}
	
	
	//Method
	//�θ��� ���� �����ں��� �� ���� ���������� �� �� ����.
	//���� ������ �� �� �θ�� �Ȱ��� ��
	void play(){
		System.out.println("��ƿ�!");
	}
	
//	@Override
//	void sound(){
//		System.out.println("����");
//	}
	
	@Override
	void sound() {

	}
	
	/* �θ��� �޼ҵ带 ȣ���� �� �ִ� ��� */
	void parentSound(){
		super.sound();
		////child �ڱ��ڽ��� sound
		//sound();
	}
	
}
