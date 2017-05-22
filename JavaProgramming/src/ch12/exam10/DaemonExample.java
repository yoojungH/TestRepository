package ch12.exam10;
//주 thread가 죽으면 보조 thread도 죽게 만드는 방법
public class DaemonExample {
	public static void main(String[] args) {
		System.out.println("워드 프로세스를 시작함");

		//자동으로 저장하는 쓰레드 구동
		AutoSaveThread thread = new AutoSaveThread();
		
		 //[추가] : 오토스레드를 메인스레드의 보조 스레드로 만들기 
		thread.setDaemon(true); 
		
		
		thread.start();
		//프로세스 종료되지 않고 계속 실행됨.
		
		try{Thread.sleep(5000);}catch(Exception e){}
		
		System.out.println("워드 프로세스를 종료함");

	
	}
}
