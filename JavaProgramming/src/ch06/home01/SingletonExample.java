package ch06.home01;

public class SingletonExample {
	public static void main(String[] args) {
		//private라서 메소드로 접근해야함
		//같은 객체
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2){
			System.out.println("같은 Singleton 객체 입니다.");
		}else{
			System.out.println("다른 Singleton 객체 입니다.");
		}
	}
}
