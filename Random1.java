import java.util.*;

public class Random1{
	public static void main(String[] args){

		long initialTimeStamp = System.currentTimeMillis();
		long lastTimeStamp;

		//Random values can be generated using different methods in java but we are concerned
		// with only

		// 1. Random generation using Math.random()
		// 2. Random generation using random class

		// here we are only using Math.random() for Random class see Random2.java
		//Math.random() * (max - min + 1) + min

		//generating random numbers in range 1 to 9 
		System.out.println((int)Math.floor(Math.random() * 10));

		//generating random characters
		System.out.println((char)Math.floor(Math.random()* ('z'-'a' + 1) + (int)'a'));

		lastTimeStamp = System.currentTimeMillis();

		//calculating execution time 
		System.out.println("Execution time(in millis) " + (lastTimeStamp - initialTimeStamp)+ "ms");
		
	}
}