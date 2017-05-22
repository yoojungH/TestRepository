package ch11.exam02;
//��ü�� ���̵� ������ �ߺ� ���� �ȵǰ� �ϱ� --- hashcode�� �̿��ؼ�
public class Member {
	//Field
	private String id;
	//Constructor
	public Member(String id){
		this.id = id;
	}
	//Method
	//1. �ؽ��ڵ� ������
	@Override
	public int hashCode() {
		//���ڿ��� ������ ������ �ؽ��ڵ尡 ����
		return id.hashCode();
	}
	
	
	//2. equals ������
	@Override
	//(Object obj)�� ���� �� �ִ� ��ü��? Object�� ��ӹ޴� ��ü�� , �� ��� ��ü�� �� ���� �� �ִ�.
	public boolean equals(Object obj) {
		if(obj instanceof Member){ //��� ��ü�� ���� ���
			Member target = (Member)obj;
			if(id.equals(target.id)){ //String ���ο����� .equals()�� �������Ͽ� ���ڿ��񱳸� �� �� �ֵ��� �ص�
				return true;
			}
		}
		return false;
		//1. ���ڿ��� �ٸ� ��� false return 2. ��� ��ü�� �ƴҰ�� ����

	}
}
