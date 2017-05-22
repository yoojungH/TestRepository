package ch12.exam07;

public class JoinExample {
	public static void main(String[] args) {
		SumThread thread = new SumThread();
		thread.start();
		
		
		try {
			thread.join(); //대기상태
		} catch (InterruptedException e) {

		} //메인스레드가 해당 쓰레드 끝날때까지 기다리겠다. === 기다리는 쓰레드가 join요청을 함.
		
		
		long result = thread.getSum();
		System.out.println(result);
	}
}
