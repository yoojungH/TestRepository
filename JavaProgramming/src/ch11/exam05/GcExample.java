package ch11.exam05;

public class GcExample {
	public static void main(String[] args) {
//		Member m1 = new Member("blue");//garbage
//		m1 = null;
//		m1 = new Member("white");//garbage
//		m1 = new Member("red");
//		
//		System.gc();
		
		for(int i=0; i<10000;i++){
			//Member m1 = new Member(i+"");//garbage
			Member m1 = new Member(String.valueOf(i));//¼ýÀÚ¸¦ ¹®ÀÚ¿­·Î ¹Ù²ãÁÜ
			System.gc();
		}	
	}
}
