package ch12.exam09;

public class PrintThread1 extends Thread{
	//�ʵ�
	private boolean stop;
	
	//������
	
	//�޼ҵ�
	
	public void run(){
		while(!stop){ //stop �÷��� ���
			System.out.println("���� ��...");
			System.out.println("���� ��...");
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
		
	}

	public void setStop( boolean stop) {
		this.stop = stop;
		
	}
}
