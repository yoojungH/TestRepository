package ch12.exam08;

public class ReadThread extends Thread{
	private DataBox dataBox;
	
	public ReadThread(DataBox dataBox){
		this.dataBox = dataBox;
	}
	//생성자를 통해 외부에서 데이터 받아서 주입 ---> 생성자 주입
	
//	public void setDataBox(DataBox dataBox) {
//		this.dataBox = dataBox;
//	}
//	//Setter를 통해 ---> Setter 주입
	
	@Override
	public void run() {
		for(int i=0; i<10; i++){
			String data = dataBox.getData();
		}

	}
}
