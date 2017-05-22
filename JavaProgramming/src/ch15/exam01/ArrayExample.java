package ch15.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayExample {
	public static void main(String[] args) {
		Student[] array = new Student[3];
//		array[0] = new Student("s1");
//		array[1] = new Student("s2");
//		array[2] = new Student("s3");
		//array[3] = new Student("s4");
		
		
		//원하는 만큼 사용가능
		List<Student> list = new ArrayList<Student>();
		for(int i=0; i<100 ; i++){
			list.add(new Student("s"+i));
		}
		
		//배열 지우고 싶을 떄
		list.remove(1);
	}
}
