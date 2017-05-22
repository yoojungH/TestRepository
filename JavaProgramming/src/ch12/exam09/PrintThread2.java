package ch12.exam09;

public class PrintThread2 extends Thread{
	//필드
	//생성자
	//메소드
	
	public void run(){
		try{
			while(true){ //stop 플래그 사용
				System.out.println("실행 중...");
				System.out.println("실행 중...");
				//how1
				//Thread.sleep(1);  //일시정지 발생시키기. 1000분의 1초
				
				//how2
				if(isInterrupted()){ //interrupted메소드가 호출되면 true 됨.
					break;
				}
			}
			
		}catch(Exception e){ //예오ㅣ발생하면 여기루 넘어옴
			
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}

//안,밖 Thread.interrupted() ---> static이라 밖에서 가능 
//안 isInterrupted()
