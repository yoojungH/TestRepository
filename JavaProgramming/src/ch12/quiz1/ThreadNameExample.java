package ch12.quiz1;

public class ThreadNameExample {
	public static void main(String[] args) {
		/*메인메소드드가 실행하는 쓰레드 이름 */
		Thread thread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름: "+thread.getName());
	
		Thread threadA = new ThreadA();
		Thread threadB = new ThreadB();
		
		threadA.start();
		threadB.start();
		
		System.out.println("ThreadA를 생성한 스레드 이름: "+thread.currentThread().getName());
		System.out.println("작업 쓰레드 이름: " + threadA.getName());
		
		//threadA.start();
		//threadB.start();

	
	}
}
