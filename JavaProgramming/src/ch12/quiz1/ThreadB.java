package ch12.quiz1;

public class ThreadB extends Thread{
	
	@Override
	public void run() {
		System.out.println(getName()+"�� ����� ����");
	}
}
