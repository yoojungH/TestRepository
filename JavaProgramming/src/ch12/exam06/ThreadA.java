package ch12.exam06;

public class ThreadA extends Thread{
	private boolean stop = false; //�����带 �����ϱ� ���� ����
	private boolean work = true; //������ �۾��� �纸�� ����
	
	
	//�޼ҵ�
	@Override
	public void run() {
		while(!stop){
			if(work){
				System.out.println("ThreadA�۾���....");
			}else{
				yield(); //���� ���� ���� ������ �ٸ� �����尡 ������.
			}
		}
		System.out.println("ThreadA �۾� ����");
	}

//private�� ������ �ܺο��� �ٲ� �� ���� ----> �ٲ� �� �ֵ��� �ϱ� ���� �־��� 
	public void setStop(boolean stop) {
		this.stop = stop;
	}


	public void setWork(boolean work) {
		this.work = work;
	}
}
