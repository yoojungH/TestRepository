package ch11.exam02;

public class Key {
	private int number;
	public Key(int number){
		this.number = number;
	}
	
	@Override
	public int hashCode() {
		//�ѹ��� ������ �ѹ��� �Ѱ��ֱ�
		return number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key ){ //��� ��ü�� ���� ���
			Key target = (Key)obj;
			if(number == target.number ){ //String ���ο����� .equals()�� �������Ͽ� ���ڿ��񱳸� �� �� �ֵ��� �ص�
				return true;
			}
		}
		return false;

	}
}
