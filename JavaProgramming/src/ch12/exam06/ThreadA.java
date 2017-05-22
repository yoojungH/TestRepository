package ch12.exam06;

public class ThreadA extends Thread{
	private boolean stop = false; //쓰레드를 종료하기 위한 목적
	private boolean work = true; //쓰레드 작업을 양보할 목적
	
	
	//메소드
	@Override
	public void run() {
		while(!stop){
			if(work){
				System.out.println("ThreadA작업중....");
			}else{
				yield(); //내가 실행 대기로 빠지고 다른 쓰레드가 실행함.
			}
		}
		System.out.println("ThreadA 작업 종료");
	}

//private기 때문에 외부에서 바꿀 수 없음 ----> 바꿀 수 있도록 하기 위해 넣어줌 
	public void setStop(boolean stop) {
		this.stop = stop;
	}


	public void setWork(boolean work) {
		this.work = work;
	}
}
