import java.util.*;

//output:
/*
	false
	true
	-32
	0
*/
public class StringComparison{
	public static void main(String[] args){

		String s1 = "HighFive";
		String s2 = "highfive";

		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));

		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		
		//note: that the .equalsToIgnoreCase() and .compareToIgnoreCase() ignores the
		//case when comparing	
	}
}