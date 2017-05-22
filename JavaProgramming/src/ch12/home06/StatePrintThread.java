package ch12.home06;

public class StatePrintThread extends Thread{
	//TargetThread 참조 
	private Thread targetThread;
	
	//Constructor
	public StatePrintThread(Thread targetThread){
		this.targetThread = targetThread;
	}
	
	
	//TargetThread의 상태를 지속적으로 출력 
	//Thread.State --- 열거타입(NEW/RUNNABLE/WAITING/...
	@Override
	public void run() {
		while(true){
			Thread.State state = targetThread.getState();
			System.out.println("타겟 스레드 상태: "+ state);

			if(state == Thread.State.NEW){
				targetThread.start();
			}
			
			if(state == Thread.State.TERMINATED){
				break;
			}
			
			//0.5초간 쉬기
			try {Thread.sleep(500);	} 
			catch (InterruptedException e) {} 
		}
	}
}
