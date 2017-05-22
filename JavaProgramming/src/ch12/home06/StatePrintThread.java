package ch12.home06;

public class StatePrintThread extends Thread{
	//TargetThread ���� 
	private Thread targetThread;
	
	//Constructor
	public StatePrintThread(Thread targetThread){
		this.targetThread = targetThread;
	}
	
	
	//TargetThread�� ���¸� ���������� ��� 
	//Thread.State --- ����Ÿ��(NEW/RUNNABLE/WAITING/...
	@Override
	public void run() {
		while(true){
			Thread.State state = targetThread.getState();
			System.out.println("Ÿ�� ������ ����: "+ state);

			if(state == Thread.State.NEW){
				targetThread.start();
			}
			
			if(state == Thread.State.TERMINATED){
				break;
			}
			
			//0.5�ʰ� ����
			try {Thread.sleep(500);	} 
			catch (InterruptedException e) {} 
		}
	}
}
