package ch12.home05;

public class Calculator {
	//Field
	private int memory;

	//Method 
	public int getMemory() {
		return memory;
	}

	//User1이 다 끝나고 나서야 User2가 실행할 수 있다.
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try { Thread.sleep(2000);} 
		catch (InterruptedException e) {}
		
		System.out.println("["+Thread.currentThread().getName()+"]: "+this.memory);
	}
	
	
	
}
