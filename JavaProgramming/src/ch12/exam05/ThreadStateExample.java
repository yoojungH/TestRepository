package ch12.exam05;
//2017.04.07 ���� ����
public class ThreadStateExample {
	public static void main(String[] args) {
		StatePrintThread statePrintThread = new StatePrintThread(new TargetThread()); // "Ÿ�� ������ ����: NEW"
		statePrintThread.start();
	}
}
