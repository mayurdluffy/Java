import java.util.*;

public class FindCharsAndStrings{
	public static void main(String[] args){

		String s = "Aquaman";

		System.out.println(s.indexOf('q'));
		System.out.println(s.indexOf('a', 4)); //index of 'a' after index 4

		System.out.println(s.indexOf("man"));
		System.out.println(s.indexOf("am", 4)); //returns -1 when string is not found

		s = "IronMan is the Mentor of SpyderMan and Spyder is a IDE for Python";

		System.out.println(s.lastIndexOf('a'));
		System.out.println(s.lastIndexOf('a', 20)); // index of 'a' before index 20

		System.out.println(s.lastIndexOf("Man"));
		System.out.println(s.lastIndexOf("Man", 30)); //index of "Man" before index 30

		
	}
}