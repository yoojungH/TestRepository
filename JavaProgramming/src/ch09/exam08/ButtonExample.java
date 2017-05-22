package ch09.exam08;

public class ButtonExample {
	public static void main(String[] args) {
		Button button = new Button();
		//이 인터페이스를 구현한 것으로 만든 객체를 대입
		button.setOnClickListener(new Button.OnClickListener(){
			@Override
			public void onClick() {
				System.out.println("서버에 접속합니다.+");	
			}
		});
		button.touch();
		
		
	}
}
