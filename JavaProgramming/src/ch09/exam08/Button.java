package ch09.exam08;

public class Button {
	//F
	private OnClickListener onClickListener;
	
	//C
	//M
	public void setOnClickListener(OnClickListener onClickListener) {
		this.onClickListener = onClickListener;
	}
	
	public void touch(){
		if(onClickListener != null ){
			onClickListener.onClick();
		}
	}

	//Nested Interface
	interface OnClickListener{
		void onClick();
	}
	//���� ������ ��ü���� �����

}
