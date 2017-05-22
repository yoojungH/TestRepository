package ch12.home01;

import java.awt.Toolkit;

public class BeepPrintExample3 {
	public static void main(String[] args) {
		/* how 1 */
//		//BeepThread thread = new BeepThread();
//		//�̷��� �ص� ������ �θ�Ŭ������ ����
//		Thread thread = new BeepThread();
//		thread.start();
		
		/* how 2 --- �͸�ü�� ���� */
		Thread thread = new Thread(){
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++){
					toolkit.beep();
						
					//0.5�ʰ� �����带 �Ͻ����� ���·� ������ֱ�
					try{Thread.sleep(500);}catch(Exception e){}
				}
			}
		};
		
		
		/* Main Thread �� �����ϴ� �۾�*/
		//'��'���ڿ��� 5�� ����ϴ� �۾�
		for(int i=0; i<5; i++){
			System.out.println("��");
			//0.5�ʰ� �����带 �Ͻ����� ���·� ������ֱ�
			try{Thread.sleep(500);}catch(Exception e){}
		}
	}
}
