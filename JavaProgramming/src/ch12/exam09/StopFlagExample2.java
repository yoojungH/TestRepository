package ch12.exam09;

public class StopFlagExample2 {
	public static void main(String[] args) {
		
		//��� 1
		PrintThread1 thread = new PrintThread1();
		thread.start();
		try{ Thread.sleep(2000);	} catch (Exception e){}
		thread.setStop(true);
		
//		PrintThread2 thread2 = new PrintThread2();
//		thread2.start();
//		try{ Thread.sleep(2000);	} catch (Exception e){}
//		thread2.interrupt(); //����->�Ͻ�����, �Ͻ������� ���� ����
	
}
}
