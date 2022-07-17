import java.util.*;
	
  //functional interface
interface GenericInterface<T>{

	//abstract method
	T fn(T t);
}

public class Lambda{
	public static void main(String[] args){

		GenericInterface<String> rev = (str) -> {

			String res = "";

			for(int i=str.length()-1; i>=0; i--)
				res += str.charAt(i);

			return res;
		};

		GenericInterface<Integer> fact = (num) -> {

			int res = 1;

			for(int i=1; i<=num; i++)
				res *= i;

			return res;
		};

		System.out.println(rev.fn("lambda"));
		System.out.println(fact.fn(5));
	}
}