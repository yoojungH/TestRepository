package ch12.exam05;
//2017.04.07 ���� ����
public class TargetThread extends Thread {	
	public void run() { // run()������ ������ terminated ����
		for(long i=0; i<1000000000; i++) {}
		
		try { //Ÿ�� ������ ����: TIMED_WAITING
			//1.5�ʰ� �Ͻ� ����
			Thread.sleep(1500);
		} catch(Exception e) {}
		
		for(long i=0; i<1000000000; i++) {}
	}
}
