package ch07.home01;
//CellPhone�� ��ӹ��� �ڽ� Ŭ����
public class DmbCellPhone extends CellPhone {
	int channel;
	
	DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//Method
	void turnOnDmb(){
		System.out.println("ä�� "+channel+ "�� DMB ��� ������ �����մϴ�.");
	}
	
	void changeChannelDmb(int channel){
		this.channel = channel;
		System.out.println("ä�� "+channel + "������ �ٲߴϴ�.");
	}
	
	void turnOffDmb(){
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
}
