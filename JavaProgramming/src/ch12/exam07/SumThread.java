package ch12.exam07;

public class SumThread extends Thread{
	//필드
	private long sum;
	//생성자
	
	//메소드
	


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
