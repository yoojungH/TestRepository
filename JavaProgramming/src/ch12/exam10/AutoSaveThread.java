package ch12.exam10;

public class AutoSaveThread extends Thread{
	
	public void save(){
		System.out.println("작업 내용을 저장함");
	}
	
	@Override
	public void run() {
		while(true){
		//매 1초마다 저장 
		try {
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			
		} 
		save();
		}	
	}
}

	