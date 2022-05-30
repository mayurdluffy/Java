import java.util.*;
import java.util.Arrays;

/*output: 

	51 Mayank
	60 Mayur
	81 Shreyansh
	90 Akash

	90 Akash
	51 Mayank
	60 Mayur
	81 Shreyansh
*/

class Student{

	int rollNo;
	String name;

	Student(){
		rollNo = 0;
		name = "Unknow";
	}

	Student(int rollNo, String name){
		this.rollNo = rollNo;
		this.name = name;
	}

	public String toString(){
		return this.rollNo + " " + this.name;
	}
}

class SortByRoll implements Comparator<Student>{

	public int compare(Student a, Student b){
		return (a.rollNo - b.rollNo);
	}
}

class SortByName implements Comparator<Student>{

	public int compare(Student a, Student b){
		return (a.name.compareTo(b.name));
	}
}

public class ArraysComparator{
	public static void main(String[] args){

		Student[] students = {new Student(60, "Mayur"), new Student(81, "Shreyansh"), new Student(51, "Mayank"), new Student(90, "Akash")};
		
		Arrays.sort(students, new SortByRoll());
		for(Student s: students)
			System.out.println(s.toString());
		System.out.println();

		Arrays.sort(students, new SortByName());
		for(Student s: students)
			System.out.println(s.toString());

	}
}