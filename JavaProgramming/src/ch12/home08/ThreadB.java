package ch12.home08;

public class ThreadB extends Thread{
	//Field
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(!stop){
			if(work){
				System.out.println("ThreadB �۾� ����");
			}else{
				Thread.yield();
			}
		}
		System.out.println("ThreadB ����");
	}
}
