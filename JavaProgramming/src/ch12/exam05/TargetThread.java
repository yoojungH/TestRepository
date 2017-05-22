package ch12.exam05;
//2017.04.07 수업 내용
public class TargetThread extends Thread {	
	public void run() { // run()끝나면 스레드 terminated 상태
		for(long i=0; i<1000000000; i++) {}
		
		try { //타겟 스레드 상태: TIMED_WAITING
			//1.5초간 일시 정지
			Thread.sleep(1500);
		} catch(Exception e) {}
		
		for(long i=0; i<1000000000; i++) {}
	}
}
