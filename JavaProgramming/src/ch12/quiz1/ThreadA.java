package ch12.quiz1;

public class ThreadA extends Thread{
	//생성자가 생성될 때 setName실행됨
	public ThreadA(){
		setName("ThreadA");
	}
	@Override
	public void run() {
		System.out.println(getName()+"가 출력한 내용");
	}
}
