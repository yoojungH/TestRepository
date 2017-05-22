package ch12.home08;

public class YieldExample {
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		threadA.start();
		threadB.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		
		threadA.work = false;
		//3초 후엔 threadA yield되고 threadB만 실행됨
	
		threadA.stop = true;
		threadB.stop = true;
	}
	  
}
