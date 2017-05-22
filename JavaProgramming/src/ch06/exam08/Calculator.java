package ch06.exam08;
/* �ν��Ͻ�/Static �� */
public class Calculator {
	//�ڱ� �ڽ� �ʵ�
	private static Calculator singleton = new Calculator();
	
	//�����ڰ� �������� ���ϵ��� Block -- �ܺο��� ����� �� ����
	private Calculator(){
		
	}
	
	//���� �̰͸� ���� ����
	//return type�� Calculator...
	static Calculator getInstance(){
		return singleton;
	}
		
}
