package ch12.home02;

public class ThreadA extends Thread{
	//�����ڰ� ������ �� setName�����
	public ThreadA(){
		setName("ThreadA");
	}
	@Override
	public void run() {
		for(int i=0; i<2; i++){
			System.out.println(getName()+"�� ����� ����");
		}
	}
}
