package ch12.quiz1;

public class ThreadNameExample {
	public static void main(String[] args) {
		/*���θ޼ҵ�尡 �����ϴ� ������ �̸� */
		Thread thread = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸�: "+thread.getName());
	
		Thread threadA = new ThreadA();
		Thread threadB = new ThreadB();
		
		threadA.start();
		threadB.start();
		
		System.out.println("ThreadA�� ������ ������ �̸�: "+thread.currentThread().getName());
		System.out.println("�۾� ������ �̸�: " + threadA.getName());
		
		//threadA.start();
		//threadB.start();

	
	}
}
