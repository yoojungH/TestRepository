package ch12.quiz3;

public class YieldExample {
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		threadA.start();
		threadB.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		
		//3초 후엔 threadB만 실행되게 하는 코드 작성
		threadA.work = false;
	
		
		//stop()메소드를 쓰는 대신 Field에 선언된 flag값을 이용하여 stop()메소드를 호출한 것과 같은 효과가 나도록 작성하시오.
		threadA.stop = true;
		threadB.stop = true;
	}
}
