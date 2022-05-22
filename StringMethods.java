import java.util.*;

//output:
/* 
	21
	TODAY IS A SUNNY DAY,
	Today is a sunny day, weather is good!
	Today is a sunny day, weather is good!
	Today is a sunny day,   weather is good!
	Today is a sunny day, weather is good!
*/
public class StringMethods{
	public static void main(String[] args){

			String s1 = "Today is a sunny day,";
			String s2 = " weather is good!";

			System.out.println(s1.length());
			System.out.println(s1.toUpperCase());

			String s = s1.concat(s2);
			System.out.println(s);

			String s3 = s1 + s2; //string concatination opreator
			System.out.println(s);

			s1 = s1 + "  ";
			System.out.println(s1 + s2);
			System.out.println(s1.trim() + s2); //trims the space after


			//there are other useful method defined in String class
	}
}