package ch07.home01;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		//DMBCellPhone��ü ����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���","����",10);
		
		//CellPhone���� ���� ��� ���� �ʵ�
		System.out.println("��: "+ dmbCellPhone.model);
		System.out.println("����: "+ dmbCellPhone.color);
		
		//DmbCellPhone�� �ʵ�
		System.out.println("ä��: "+ dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������?");
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		
	}
}
