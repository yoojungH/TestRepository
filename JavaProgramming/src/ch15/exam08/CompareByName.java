package ch15.exam08;

import java.util.Comparator;

//comparator���� <�񱳴��>
public class CompareByName implements Comparator<Person> {
	
	//������
	@Override
	public int compare(Person o1, Person o2) {
		//return "ȫ�浿".compareTo("���ڹ�");
		//return o1.getName().compareTo(o2.getName());
		
		if((o1.getName().compareToIgnoreCase(o2.getName()))<0){
			return -1;
		}else if((o1.getName().compareToIgnoreCase(o2.getName()))==0){
			return 0;
		}else return 1;
	}
	
}
