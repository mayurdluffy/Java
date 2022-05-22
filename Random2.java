import java.util.Random;

public class Random2{
	public static void main(String[] args){

		
		//Random class is defined in java.util.Random

		Random random = new Random(); // creating instance of Random class

		// generating random integers in range 0 to10
		int random_int = random.nextInt(10); 

		//genrating random chars
		char random_char = (char) ('a' + random.nextInt(26));

		System.out.println(random_int);
		System.out.println(random_char);

		//note: that other method can also be used to genrate random bytes, floats and
		//double 

		//random.nextInt();
		//random.nextByte();
		//random.nextFloat();
		//random.nextDouble();
	}
}
