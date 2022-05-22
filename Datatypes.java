import java.io.*;
import java.util.*;

public class Datatypes{
	public static void main(String[] args){

		//final int n = 9; //constant
		System.out.println(Integer.class + "\t" + Integer.BYTES + "\t" 
		 + Integer.MIN_VALUE + "\t" + Integer.MAX_VALUE);

		/*different datatypes are //Wrapper classes

	   	  Data Type      Size       Min. Value                Max. Value    

	       Byte           8             -128                       127
           Short         16             -32768                     32767
           Integer       32             -2147483648                2147483647
           Float         32              1.4E-45                   3.4028235E38
           Long          64             -9223372036854775808       9223372036854775807
           Double        64              4.9E-324                  1.7976931348623157E308
           Character     16
		
	}
}