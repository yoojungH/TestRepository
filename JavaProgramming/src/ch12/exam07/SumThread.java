package ch12.exam07;

public class SumThread extends Thread{
	//�ʵ�
	private long sum;
	//������
	
	//�޼ҵ�
	


	@Override
	public void run() {
		for(int i=1; i <= 100;i++){
			sum +=i;
		}
	}

	public long getSum() {
		return sum;
	}
}
