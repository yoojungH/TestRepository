package ch12.exam06;

public class YieldExample {
	public static void main(String[] args) {
		//Thread thread = new ThreadA();
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		threadA.start();
		threadB.start();
		
		try {ThreadA.sleep(3000);} catch (InterruptedException e) {}
		threadA.setWork(false);
	
		try {ThreadA.sleep(3000);} catch (InterruptedException e) {}
		threadB.setWork(true);
		
		threadA.setStop(true);
		threadB.setStop(true);
		//부모 A 타입의 변수가 되어야 함...?
	}
}
