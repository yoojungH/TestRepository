package ch12.exam08;

public class DataBox {
	private String data; //데이터를 저장할 실제 위치

	public synchronized String getData() {
		if(data == null){ try {wait();} catch (InterruptedException e) {}}
		String returnValue = data;
		System.out.println("읽은 데이터 "+ returnValue);
		data = null;
		notify();
		return returnValue;
	}

	public synchronized void setData(String data) {
		if(this.data == null){ try {wait();} catch (InterruptedException e) {}} //필드의 데이터가 null이라면 
		this.data = data;
		System.out.println("생성 데이터 "+ this.data);
	}
	
	
}
