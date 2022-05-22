import java.util.*;
import java.lang.Math;

//output:
/*
	3.141592653589793
	3.0
	4.0
	3.0
	4
	7.38905609893065
	-Infinity
	3.0
	256.0
	8.0
	1
*/
public class Maths{
	public static void main(String[] args){

		double pi = 3.141592653589793238;

		System.out.println(pi);
		System.out.println(Math.floor(pi));
		System.out.println(Math.ceil(pi));
		System.out.println(Math.rint(pi)); //returns the integral part

		System.out.println(Math.round(3.6));
		System.out.println(Math.exp(2));
		System.out.println(Math.log(0));
		System.out.println(Math.log10(1000));

		System.out.println(Math.pow(2, 8));
		System.out.println(Math.sqrt(64));

		System.out.println(Math.abs(-1)); //returns absolute value 

		//there are another useful method defined in Math class

		//*note: that in Java most methods defined in Math class by default return
		// double type value   

		
	}
}