package ch12.quiz3;

public class ThreadA extends Thread{
	//Field
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(!stop){
			if(work){
				System.out.println("ThreadA �۾� ����");
			}else{
				//���� �ۼ��ϼ���(1��)
				Thread.yield();
			}
		}
		System.out.println("ThreadA ����");
	}
}
