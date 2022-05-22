import java.util.*;

public class Change{
	public static void main(String[] args){

		int n = 3;
		char c = '3';

		int m = 13;
		String num = "404";

		//int to char
		System.out.println((char)(n +'0'));

		//char to int
		System.out.println((int)c); //returns ascii value of c
		System.out.println(c -'0');
		
		//int to string
		System.out.println(String.valueOf(m));

		//string to int
		System.out.println(Integer.parseInt(num));

		//note: that there are anothe useful method for parsing float, double, ..
		//Float.parseFloat(f);
		//Double.parseDouble(d);

		double d = 3.141592653589793238;
		String dubl = "3.141592653589793238"; 

		System.out.println(String.valueOf(d));
		System.out.println(Double.parseDouble(dubl));
	}
}