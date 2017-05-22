package ch07.home01;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		//DMBCellPhone객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰","검정",10);
		
		//CellPhone으로 부터 상속 받은 필드
		System.out.println("모델: "+ dmbCellPhone.model);
		System.out.println("색상: "+ dmbCellPhone.color);
		
		//DmbCellPhone의 필드
		System.out.println("채널: "+ dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요?");
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		
	}
}
