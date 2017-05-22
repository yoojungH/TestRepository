package ch12.exam09;

public class PrintThread1 extends Thread{
	//필드
	private boolean stop;
	
	//생성자
	
	//메소드
	
	public void run(){
		while(!stop){ //stop 플래그 사용
			System.out.println("실행 중...");
			System.out.println("실행 중...");
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
		
	}

	public void setStop( boolean stop) {
		this.stop = stop;
		
	}
}
