package ch12.home06;

public class TargetThread  extends Thread{
	@Override
		public void run() {
			//CPU���� ���� �ʾ��� ��� -- ������ / �޾����� -- �������
			for(long i=0; i<1000000000;i++){}
			
			try {Thread.sleep(1500);} 
			catch (InterruptedException e) {}
			
			for(long i=0; i<1000000000; i++){}
		}
}
