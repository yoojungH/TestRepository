package ch12.quiz1;

public class ThreadA extends Thread{
	//�����ڰ� ������ �� setName�����
	public ThreadA(){
		setName("ThreadA");
	}
	@Override
	public void run() {
		System.out.println(getName()+"�� ����� ����");
	}
}
