package ch11.exam01;
//��ü�� ���̵� ���ϴ� �޼ҵ�
public class Member {
	//Field
	private String id;
	//Constructor
	public Member(String id){
		this.id = id;
	}
	//Method
	@Override
	//(Object obj)�� ���� �� �ִ� ��ü��? Object�� ��ӹ޴� ��ü�� , �� ��� ��ü�� �� ���� �� �ִ�.
	public boolean equals(Object obj) {
		if(obj instanceof Member){ //��� ��ü�� ���� ���
			Member target = (Member)obj;
			
//			if(id.equals(target.id)){ //String ���ο����� .equals()�� �������Ͽ� ���ڿ��񱳸� �� �� �ֵ��� �ص�
//				return true;
//			}else{
//				return false;
//			}
//		}else{
//			return false;
//			//��� ��ü�� �ƴҰ�� ����
//		}
			
			if(id.equals(target.id)){ //String ���ο����� .equals()�� �������Ͽ� ���ڿ��񱳸� �� �� �ֵ��� �ص�
				return true;
			}
		}
		return false;
		//1. ���ڿ��� �ٸ� ��� false return 2. ��� ��ü�� �ƴҰ�� ����

	}
}
