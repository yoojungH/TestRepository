package ch12.exam03;
//2017.04.07 ��������
public class WorkThread extends Thread{
	//Field
	
	//Constructor
	WorkThread(String threadName){
//		super(threadName); // ������ �̸� �����ڿ��� ��. ��� 1
		setName(threadName); // ��� 2
	}
	
	//Method
	@Override
	public void run() { // setName�� run�� ������ȵ�. 
						// ������ ���� ���߿� �̸��� �ٲٴϱ�, ���� ���� �����ڿ��� �̸��� �ٲٴ� ���� �ٶ�����
//		String threadName = Thread.currentThread().getName(); // �������� �̸��� ����
		String threadName = getName(); // ������ ���ο��� �̸� �޴� ���(������ ���θ� ������)
		for(int i=0;i<2;i++){
			System.out.println(threadName + "�� ����� ����");
		}
	
	}
	
	
}
