package ch12.exam01;

import java.awt.Toolkit;

//2017.04.07 ���� ����
public class BeepTask implements Runnable{
	@Override
	public void run() { // ���ο� �����尡 �����ؾ� �� �ڵ� �ۼ��κ�

		Toolkit toolkit = Toolkit.getDefaultToolkit(); // ����ƽ �޼ҵ�
		//������ �ִµ� Toolkit() ���� ���� -> ��� os���� ��밡���ϹǷ� �� ��������
		//����ƽ �޼ҵ� getDefaultToolkit() : os���� �ٸ� ��� �� �����س��� ���� ���⸸�ϸ� ��
		for(int i =0 ; i<5 ;i++){
			toolkit.beep(); // ���� ���� ����Ǳ� ������ 5�� ������ ������� �ϳ��� �鸲..
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){
				
			}
		}
	}
}
