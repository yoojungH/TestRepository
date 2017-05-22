package ch12.quiz3;

public class YieldExample {
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		threadA.start();
		threadB.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		
		//3�� �Ŀ� threadB�� ����ǰ� �ϴ� �ڵ� �ۼ�
		threadA.work = false;
	
		
		//stop()�޼ҵ带 ���� ��� Field�� ����� flag���� �̿��Ͽ� stop()�޼ҵ带 ȣ���� �Ͱ� ���� ȿ���� ������ �ۼ��Ͻÿ�.
		threadA.stop = true;
		threadB.stop = true;
	}
}
