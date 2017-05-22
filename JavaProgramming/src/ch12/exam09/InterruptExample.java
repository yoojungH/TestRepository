package ch12.exam09;

public class InterruptExample {
	public static void main(String[] args) {
		PrintThread2 thread2 = new PrintThread2();
		thread2.start();
		try{ Thread.sleep(2000);	} catch (Exception e){}
		thread2.interrupt(); //실행->일시정지, 일시정지일 때만 예외
	
	}
}
