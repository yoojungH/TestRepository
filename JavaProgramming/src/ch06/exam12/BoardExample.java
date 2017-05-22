package ch06.exam12;

public class BoardExample {
	public static void main(String[] args) {
		Board board = new Board();
		

		board.setBno(1);
		//board.title = "이제 봄입니다.";
		board.setTitle("이제 봄입니다.");
		board.setContent("놀러가야 겠당...^__^");
		board.setWriter("홍자바");
		System.out.println(board.getBno());	
		System.out.println(board.getContent());
		System.out.println(board.getTitle());
		System.out.println(board.getWriter());
		System.out.println(board.isOpen());
		
		
	}
}
