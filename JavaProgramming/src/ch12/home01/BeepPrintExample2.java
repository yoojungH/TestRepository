package ch12.home01;

import java.awt.Toolkit;

public class BeepPrintExample2 {
	public static void main(String[] args) {
//		/* how 1 */
//		Runnable beepTask = new BeepTask();
//		Thread thread = new Thread(beepTask);
//		thread.start(); 
		
//		/* how 2 --- 익명객체 사용 */
//		Thread thread = new Thread(new Runnable(){
//
//			@Override
//			public void run() {
//				//비프음을 5번 반복해서 소리나게 하는 작업
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for(int i=0; i<5; i++){
//					toolkit.beep();
//						
//					//0.5초간 쓰레드를 일시정지 상태로 만들어주기
//					try{Thread.sleep(500);}catch(Exception e){}
//				}
//			}	
//		});
		
		
		/* how 3 --- 람다식 사용 */
		Thread thread = new Thread( () -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i=0; i<5; i++){
				toolkit.beep();
					
				//0.5초간 쓰레드를 일시정지 상태로 만들어주기
				try{Thread.sleep(500);}catch(Exception e){}
			}
			
		});
		
		/* Main Thread 가 실행하는 작업*/
		//'띵'문자열을 5번 출력하는 작업
		for(int i=0; i<5; i++){
			System.out.println("띵");
			//0.5초간 쓰레드를 일시정지 상태로 만들어주기
			try{Thread.sleep(500);}catch(Exception e){}
		}
	}
}
