package ch12.home01;

import java.awt.Toolkit;

/* �������� ���� Ŭ���� */
public class BeepThread extends Thread{
	 @Override
	public void run() {
		//�������� 5�� �ݺ��ؼ� �Ҹ����� �ϴ� �۾�
			Toolkit toolkit =Toolkit.getDefaultToolkit();
			for(int i=0; i<5; i++){
				toolkit.beep();
					
				//0.5�ʰ� �����带 �Ͻ����� ���·� ������ֱ�
				try{Thread.sleep(500);}catch(Exception e){}
			}
	}
}
