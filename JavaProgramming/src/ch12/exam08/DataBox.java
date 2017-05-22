package ch12.exam08;

public class DataBox {
	private String data; //�����͸� ������ ���� ��ġ

	public synchronized String getData() {
		if(data == null){ try {wait();} catch (InterruptedException e) {}}
		String returnValue = data;
		System.out.println("���� ������ "+ returnValue);
		data = null;
		notify();
		return returnValue;
	}

	public synchronized void setData(String data) {
		if(this.data == null){ try {wait();} catch (InterruptedException e) {}} //�ʵ��� �����Ͱ� null�̶�� 
		this.data = data;
		System.out.println("���� ������ "+ this.data);
	}
	
	
}
