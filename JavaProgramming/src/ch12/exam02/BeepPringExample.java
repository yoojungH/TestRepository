package ch12.exam02;

import java.awt.Toolkit;

//2017.04.07 ���� ����

public class BeepPringExample { // �����ϸ� �Ҹ����� �ڵ�
	public static void main(String[] args) { // ���� ������
		
		/*// �Ҹ��� ���� �ڵ�
		BeepThread beepThread = new BeepThread();
		beepThread.start();*/
	
		// exam01, exam02 ������
		// exam01 : ������ ���� ���� , Runnable�� �͸� ��ü�� ����
		// exam02 : ������ ����ؼ� ��, �������� �ڽ� ��ü�� ���� ��. 
		
		
		// �͸� ��ü�� ����� ��
		Thread thread = new Thread(){ // ������ ����
			@Override
			public void run() { // ���ο� �����尡 �����ؾ� �� �ڵ� �ۼ��κ�
								// run() �޼ҵ尡 ������ ������ "����(Terminated)" ����

				Toolkit toolkit = Toolkit.getDefaultToolkit(); // ����ƽ �޼ҵ�
				//������ �ִµ� Toolkit() ���� ���� -> ��� os���� ��밡���ϹǷ� �� ��������
				//����ƽ �޼ҵ� getDefaultToolkit() : os���� �ٸ� ��� �� �����س��� ���� ���⸸�ϸ� ��
				for(int i =0 ; i<5 ;i++){
					toolkit.beep(); // ���� ���� ����Ǳ� ������ 5�� ������ ������� �ϳ��� �鸲..
					System.out.println(Thread.currentThread().getName()); // Thread-0 : �۾� ��ȣ
					try{
						Thread.sleep(500); // sleep �ڵ�� ������ 0.5�ʵ��� �Ͻ� ����
					}catch(InterruptedException e){
						
					}
				}
			}
		};
			System.out.println(Thread.currentThread().getName()); // start ���̶� main ����
			thread.start();
		
		
		
		// ����Ʈ�� �ϴ� �ڵ�
		for (int i = 0; i < 5; i++) {
			System.out.println("��");

			try {
				Thread.sleep(500); // sleep������ �Ҹ� �� �� ������ �� �ڵ���µ�
			} catch (InterruptedException e) {

			}

		}
	}
}
