import java.util.*;

public class Chars{
	public static void main(String[] args){

		String s = "IronMan";

		for(char c: s.toCharArray()){ //for-each loop
			if(Character.isLowerCase(c))
				System.out.print(Character.toUpperCase(c));
			else
				System.out.print(c);
		}

		//note: that there are many useful methods defined in Character class
		//Character.isDigit()
		//Character.isSpace();
		//Character.isLetter
		//https://www.javatpoint.com/post/java-character-touppercase-method
	}
}