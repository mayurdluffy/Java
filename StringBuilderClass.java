import java.util.*;

public class StringBuilderClass{
	public static void main(String[] args){

		String s1 = "Welcome";
		StringBuilder s = new StringBuilder(s1);

		System.out.println(s);

		s.append(" from Java");

		System.out.println(s);

		String s2 = s.toString();

		System.out.println(s2);

		/* */
	}
}