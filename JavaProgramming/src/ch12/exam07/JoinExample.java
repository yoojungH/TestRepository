package ch12.exam07;

public class JoinExample {
	public static void main(String[] args) {
		SumThread thread = new SumThread();
		thread.start();
		
		
		try {
			thread.join(); //������
		} catch (InterruptedException e) {

		} //���ν����尡 �ش� ������ ���������� ��ٸ��ڴ�. === ��ٸ��� �����尡 join��û�� ��.
		
		
		long result = thread.getSum();
		System.out.println(result);
	}
}
