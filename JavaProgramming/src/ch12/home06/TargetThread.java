package ch12.home06;

public class TargetThread  extends Thread{
	@Override
		public void run() {
			//CPU선택 받지 않았을 경우 -- 실행대기 / 받았으면 -- 실행상태
			for(long i=0; i<1000000000;i++){}
			
			try {Thread.sleep(1500);} 
			catch (InterruptedException e) {}
			
			for(long i=0; i<1000000000; i++){}
		}
}
