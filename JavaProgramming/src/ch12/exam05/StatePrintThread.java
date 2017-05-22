package ch12.exam05;
//2017.04.07 ���� ����
public class StatePrintThread extends Thread {	// ��� ���� ������, Target �������� ���¸� �������
	private Thread targetThread;

	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}

	public void run() {
		while(true) {
			Thread.State state = targetThread.getState(); //  targetThread�� ���¸� ���� ��
			System.out.println("Ÿ�� ������ ����: " + state);
			if(state == Thread.State.NEW) {
				targetThread.start(); // ������ NEW -> RUNNABLE ���·� �ٲ�
			}
			if(state == Thread.State.TERMINATED) { // �����尡 ����Ǹ�
				break; // ����Ʈ ����, while�� ���
			}
			try {
				//0.5�ʰ� �Ͻ� ����
				Thread.sleep(10);
			} catch(Exception e) {}
		}
	}
}

