package ch06.exam12;

public class Board {
	//Field
	private int bno;
	private String title;
	private String content;
	private String writer;
	private boolean open;
	

	//Method
	//필드값 읽어서 리턴
	public int getBno(){
		return bno;
	}
	public String getTitle(){
		return title;
	}
	public String getContent(){
		return content;
	}
	public String getWriter(){
		return writer;
	}
	public boolean isOpen(){
		return open;
	}
	
	
	
	public void setBno(int bno) {
		if(bno<0) bno = 0;
		this.bno = bno;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public void setOpen(boolean open){
		this.open = open;
	}
	
	//Constructor
	
	
	
	//Method
//	public void setBno(int bno){
//		this.bno = bno;
//	}
//	
//	public void setTitle(String title){
//		this.title = title;
//	}
	
	//자동으로 만들기 --- getter, setter
	
}
