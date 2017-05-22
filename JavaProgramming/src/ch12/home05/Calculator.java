package ch12.home05;

public class Calculator {
	//Field
	private int memory;

	//Method 
	public int getMemory() {
		return memory;
	}

	//User1�� �� ������ ������ User2�� ������ �� �ִ�.
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try { Thread.sleep(2000);} 
		catch (InterruptedException e) {}
		
		System.out.println("["+Thread.currentThread().getName()+"]: "+this.memory);
	}
	
	
	
}
