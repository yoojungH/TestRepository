package ch12.quiz3;

public class ThreadA extends Thread{
	//Field
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(!stop){
			if(work){
				System.out.println("ThreadA 작업 내용");
			}else{
				//여기 작성하세요(1줄)
				Thread.yield();
			}
		}
		System.out.println("ThreadA 종료");
	}
}
