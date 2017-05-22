package ch12.home01;

import java.awt.Toolkit;

public class BeepPrintExample2 {
	public static void main(String[] args) {
//		/* how 1 */
//		Runnable beepTask = new BeepTask();
//		Thread thread = new Thread(beepTask);
//		thread.start(); 
		
//		/* how 2 --- �͸�ü ��� */
//		Thread thread = new Thread(new Runnable(){
//
//			@Override
//			public void run() {
//				//�������� 5�� �ݺ��ؼ� �Ҹ����� �ϴ� �۾�
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for(int i=0; i<5; i++){
//					toolkit.beep();
//						
//					//0.5�ʰ� �����带 �Ͻ����� ���·� ������ֱ�
//					try{Thread.sleep(500);}catch(Exception e){}
//				}
//			}	
//		});
		
		
		/* how 3 --- ���ٽ� ��� */
		Thread thread = new Thread( () -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i=0; i<5; i++){
				toolkit.beep();
					
				//0.5�ʰ� �����带 �Ͻ����� ���·� ������ֱ�
				try{Thread.sleep(500);}catch(Exception e){}
			}
			
		});
		
		/* Main Thread �� �����ϴ� �۾�*/
		//'��'���ڿ��� 5�� ����ϴ� �۾�
		for(int i=0; i<5; i++){
			System.out.println("��");
			//0.5�ʰ� �����带 �Ͻ����� ���·� ������ֱ�
			try{Thread.sleep(500);}catch(Exception e){}
		}
	}
}
