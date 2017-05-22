package ch12.home03;

public class PriorityExample {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++){
			Thread thread = new CalcThread("Thread"+i);
			
			//10번째 쓰레드 가장 높은 priority 부여, 나머지 낮은 우선 순위
			if(i != 10){
				thread.setPriority(Thread.MIN_PRIORITY);
			}else{
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			thread.start();
		
		}
	}
}
