import java.util.*;
import java.math.BigInteger;

/*input:
		20

  output:

	121645100408832000
	121645100408832089
	89
	31181719929966183601
*/
public class BigInt{

	static BigInteger fact(int n){

		BigInteger bigInt = BigInteger.ONE; // or new BigInteger("1");

		for(int i=2; i<n; i++)
			bigInt = bigInt.multiply(BigInteger.valueOf(i));

		return bigInt;

	}
	public static void main(String[] args){

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		BigInteger a = fact(n);

		System.out.println(a);

		BigInteger b = a.nextProbablePrime();

		System.out.println(b);

		BigInteger c = a.subtract(b);

		System.out.println(c.abs());
		System.out.println(c.pow(10));

		String num_string = "3141592653589793238";	
		BigInteger d = a.add(BigInteger.valueOf(289));
		BigInteger e = new BigInteger(num_string);

		System.out.println(d);
		System.out.println(e);

		/*note: that there are another userful methods in BigInteger class:

			.add(BigInteger val)					.doubleValue()
			.and(BigInteger val)					.floatValue()
			.andNot(BigInteger val)					.intValue()
			.bitCount()								.gcd(BigInteger val)
			.bitLength()							.hashCode()
			.compareTo(BigInteger val)				.longValue()
			.divide(BigInteger val)					.max(BigInteger val)
			.divideAndRemainder(BigInteger val)		.min(BigInteger val)
			.mod(BigInteger val)					.toByteArray()
			.modInverse(BigInteger val)				.or(BigInteger val)
			.modPow(BigInteger exponent, BigInteger m)
			.remainder(BigInteger val)				.xor(BigInteger value)
			.signum()								.toString()
			.sqrt()
			.sqrtAndRemiander()
		*/

	}
}