import java.util.*;

/*
	30
	t
	23
	26
	time
	The perfect time never arrives 
	0
	true
	The perfect time  arrives
	work-hard
*/
public class StringClass1{
	public static void main(String[] args){

		String s1 = "The perfect time never arrives";

		System.out.println(s1.length()); //not length
		System.out.println(s1.charAt(10));
		System.out.println(s1.indexOf("arrives"));
		System.out.println(s1.lastIndexOf('i'));
		System.out.println(s1.substring(12, 16));

		String[] words = s1.split(" "); //return a array of strings
		for(String str: words)
			System.out.print(str + " ");
		System.out.println();

		String s2 = "The perfect time";
		s2 = s2.concat(" never arrives");

		System.out.println(s1.compareTo(s2));
		System.out.println(s2.contains("perfect"));
		System.out.println(s2.replace("never", ""));

		String s3 = String.join("-", "work" ,"hard");
		System.out.println(s3);

		/*note: that other useful methods are:

		.replaceFirst()						.endsWith()
		.replaceAll()						.startsWith()
		.equals()							.toLower()
		.compareToIgnoreCase()				.toUpper()
		.matches()							.trim()
		.getChars(srcBeg, srcEnd, dest, destBeg)
		.toCharArray()						.join()
		.valueOf(char[])					.isEmpty()
		.format()

		*/
	}
}