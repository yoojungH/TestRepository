package ch12.home01;

import java.awt.Toolkit;

public class BeepPrintExample {
	public static void main(String[] args) {
		//�������� 5�� �ݺ��ؼ� �Ҹ����� �ϴ� �۾�
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++){
			toolkit.beep();
			
			//0.5�ʰ� �����带 �Ͻ����� ���·� ������ֱ�
			try{Thread.sleep(500);}catch(Exception e){}
		}
		
		//'��'���ڿ��� 5�� ����ϴ� �۾�
		for(int i=0; i<5; i++){
			System.out.println("��");
			//0.5�ʰ� �����带 �Ͻ����� ���·� ������ֱ�
			try{Thread.sleep(500);}catch(Exception e){}
		}
	}
}
