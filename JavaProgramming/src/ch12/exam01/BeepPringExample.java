package ch12.exam01;

//2017.04.07 ���� ����
import java.awt.Toolkit;

public class BeepPringExample { // �����ϸ� �Ҹ����� �ڵ�
	public static void main(String[] args) { // ���� ������
		// �Ҹ��� ���� �ڵ�
		/*
		 * Toolkit toolkit = Toolkit.getDefaultToolkit(); // ����ƽ �޼ҵ� //������ �ִµ�
		 * Toolkit() ���� ���� -> ��� os���� ��밡���ϹǷ� �� �������� //����ƽ �޼ҵ�
		 * getDefaultToolkit() : os���� �ٸ� ��� �� �����س��� ���� ���⸸�ϸ� �� for(int i =0 ;
		 * i<5 ;i++){ toolkit.beep(); // ���� ���� ����Ǳ� ������ 5�� ������ ������� �ϳ��� �鸲..
		 * try{ Thread.sleep(500); }catch(InterruptedException e){
		 * 
		 * } }
		 */

		/*
		 * // �Ҹ��� ����Ʈ ���ÿ� �ϰ� �ϴ� ��� -> ������ �ۼ�(���� �ڵ带 �۾���ü BeepTask �� �Űܼ� ����) //
		 * ���� �۾� �ۼ� ��� : ������ ���� -> ������ ȣ�� (��� ���ü������� ���ķ� ó���Ǵ� �� ó�� ����) BeepTask
		 * beepTask = new BeepTask(); // ���ο� �����忡�� �Ҹ����� �۾� ��ü ���� Thread thread =
		 * new Thread(beepTask); thread.start(); // ���ο� ������ ����(���� �帧 �б�)
		 */

		// �ѹ��� ���� �۾��̶�� ���� �۾���ü Ŭ���� ������������, �͸�ü�� �ٷ� ������ ��
		Thread thread = new Thread(new Runnable() {
			public void run() { // ���ο� �����尡 �����ؾ� �� �ڵ� �ۼ��κ�

				Toolkit toolkit = Toolkit.getDefaultToolkit(); // ����ƽ �޼ҵ�
				// ������ �ִµ� Toolkit() ���� ���� -> ��� os���� ��밡���ϹǷ� �� ��������
				// ����ƽ �޼ҵ� getDefaultToolkit() : os���� �ٸ� ��� �� �����س��� ���� ���⸸�ϸ� ��
				for (int i = 0; i < 5; i++) {
					toolkit.beep(); // ���� ���� ����Ǳ� ������ 5�� ������ ������� �ϳ��� �鸲..
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {

					}
				}
			}
		});
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
