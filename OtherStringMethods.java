import java.util.*;

//output:
/*
	Java $s not a coffee, and Python $s not a snake
	Java is a coffee, and Python is a snake
	[ Java, is, not, a, coffee,, and, Python, is, not, a, snake, ]

*/

public class OtherStringMethods{
	public static void main(String[] args){

		String s = "Java is not a coffee, and Python is not a snake";

		System.out.println(s.replace('i', '$')); 
		System.out.println(s.replace("is not", "is"));

		String[] splitString = s.split(" ");

		//note: that split() also can take a starting index
		//for splitting with a regex

		System.out.print("[ ");

		for(String str: splitString){
			System.out.print(str + ", ");
		}
		System.out.print("]");

	}
}