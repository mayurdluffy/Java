import java.util.*;

public class Substring{
	public static void main(String[] args){

		String s1 = "Avengers EndGame";
		String s2 = "EndGame";

		System.out.println(s1.substring(12));
		System.out.println(s1.substring(9, 12));

		System.out.println(s1.contains(s2)); 

		System.out.println(s1.startsWith("Avengers"));
		System.out.println(s1.endsWith("me"));

		//.contains() method is very useful for ..

	}
}