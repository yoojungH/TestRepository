package ch12.home02;

public class ThreadNameExample {
	public static void main(String[] args) {
		/*���θ޼ҵ�尡 �����ϴ� ������ �̸� */
		Thread thread = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸�: "+thread.getName());
	
	
		Thread threadA = new ThreadA();
		System.out.println("ThreadA�� ������ ������ �̸�: "+thread.currentThread().getName());
		System.out.println("�۾� ������ �̸�: " + threadA.getName());
		threadA.start();
		
		Thread threadB = new ThreadB();
		threadB.start();
	
	}
}
