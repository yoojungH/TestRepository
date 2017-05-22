package ch12.quiz2;

public class PriorityExample {
	public static void main(String[] args) {
		for(int i=1; i<=3; i++){
			Thread thread = new CalcThread("Thread "+i);
			
			
			if(i == 1){
				thread.setPriority(Thread.MIN_PRIORITY);
			}else if(i==3){
				thread.setPriority(3);
			}
			thread.start();
			//System.out.println(thread.getPriority());
		}
	}
}
