package ch15.exam08;

import java.util.Comparator;

//comparator구현 <비교대상>
public class CompareByName implements Comparator<Person> {
	
	//재정의
	@Override
	public int compare(Person o1, Person o2) {
		//return "홍길동".compareTo("감자바");
		//return o1.getName().compareTo(o2.getName());
		
		if((o1.getName().compareToIgnoreCase(o2.getName()))<0){
			return -1;
		}else if((o1.getName().compareToIgnoreCase(o2.getName()))==0){
			return 0;
		}else return 1;
	}
	
}
