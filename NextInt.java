import java.util.*;

public class NextInt{

	static <T> void consoleLog(T value){ //generic method 
		System.out.println(value);
	}

	//input:
	/*	1
		34
		342343425
		3423453544443
		3.4543454433879879
		3.4543454433879879
		c
	*/

	//output:
	/*
		1
		34
		342343425
		3423453544443
		3.4543454433879879
		3.4543454433879879
		c
	*/

	public static void main(String[] args){

		Scanner in = new Scanner(System.in);

		// method on Scanner objects for input

		byte b = in.nextByte();
		short a = in.nextShort();
		int n = in.nextInt();
		long l = in.nextLong();
		float f = in.nextFloat();
		double d = in.nextDouble();

		// note: there is no predefined method for taking a char as an input
		// althought we can take a char input using the charAt()
		char c = in.next().charAt(0);

		consoleLog(b);
		consoleLog(a);
		consoleLog(n);
		consoleLog(l);
		consoleLog(f);
		consoleLog(d);
		consoleLog(c);

		// note: that the float can represent upto 7 significant digits but double can 
		// represent upto 15 significant digits and the last digit is rounded over
		
	}
}