package ch08.exam01;

public interface Manual { // �������̽� ������ �� : public
	//Field
	 String COMPANY = "�Ｚ����"; // �⺻������ public static final ����
	 int MAX_VOLUME = 150;
	 int MIN_VOLUME = 0;
	int MAX_SPEED = 0;
	int MIN_SPEED = 0;
	 
	 //Method
	 //���� ����
	 
	 void turnOn(); //  �⺻������ public abstract ���� , �������� �̰� ���̸� ȥ��!!!!!!
	 				//  ���� �ϰ� ��� ����� ����� ��
	 void turnOff();
	 void setSpeed(int speed); 
	 int getSpeed();
	 void run();
	 
	 //����δ� �������̽��� ����� �� �ִ� ��ü���� ����
	 //�������̽��� ��� ������ ��ü: �ּ��� �������̽��� �ִ� ������ ���� �־�� �� => "�������̽��� ������ ��ü" ��� �θ�
	 //�̿� ���� �޼ҵ尡 ���� ��ü �ȿ� �־�� ��. -> ���߿� �������̽����� ȣ���� �� �ֵ���
	
}
