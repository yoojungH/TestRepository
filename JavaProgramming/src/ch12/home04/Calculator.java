package ch12.home04;

public class Calculator {
	//Field
	private int memory;

	//Method 
	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
		try { Thread.sleep(2000);} 
		catch (InterruptedException e) {}
		
		System.out.println("["+Thread.currentThread().getName()+"]: "+this.memory);
	}
	
	
	
}
