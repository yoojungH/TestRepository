package ch14.exam08;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class LambdaExpressionExample {
	
	//Field
	private static List<Student> list = Arrays.asList(
			new Student("È«±æµ¿",90,96),
			new Student("±èÀÚ¹Ù",95,93)
	);
	
	
	public static void main(String[] args) {
		printString((s) -> { return s.getName();});
		printInt((s) -> {return s.getEnglishScore();});
		printInt((s) -> s.getMathScore());
		
		double englishAvg = avg((s) -> s.getEnglishScore());
		System.out.println("¿µ¾î Æò±Õ Á¡¼ö: "+ englishAvg);
		
		double mathAvg = avg((s)-> s.getMathScore());
		System.out.println("¼öÇÐ Æò±Õ Á¡¼ö: "+ mathAvg);
	}
	
	
	
	public static void printString(Function<Student, String> function){
		for(Student student : list){
			System.out.print(function.apply(student) + " ");
		}
		System.out.println();
	}
	
	public static void printInt(ToIntFunction<Student> function){
		for(Student student : list){
			System.out.print(function.applyAsInt(student) + " ");
		}
		System.out.println();
	}
	
	public static double avg(ToIntFunction<Student> function){
		double sum = 0.0;
		int count = 0;
		for(Student student : list){
			sum += function.applyAsInt(student);
			count++;
		}
		return sum/count;
		
	}
}
