import java.util.*;

//input: life is good
//output: 
/*
	d 1
	e 1
	f 1
	g 1
	i 2
	l 1
	o 2
	s 1
*/

// considering only letters (a - z) ignoring case
public class CountingChars{

	static int[] countLetters(char[] chars){

		int[] counts = new int[26];

		for(int i=0; i<chars.length; i++)
			if(Character.isLetter(chars[i]))
				counts[chars[i] - 'a']++;

		return counts;
	}

	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		String s = in.nextLine();


		int[] counts = countLetters(s.toLowerCase().toCharArray());

		for(int i=0; i<counts.length; i++)
			if(counts[i] > 0)
				System.out.println((char)('a' + i) + " " + counts[i]);
		
		
	}
}