package ch12.quiz3;

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
				//���� �ۼ��ϼ���(1��)
				Thread.yield();
			}
		}
		System.out.println("ThreadB ����");
	}
}
