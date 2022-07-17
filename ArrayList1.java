import java.util.*;
import java.util.Arrays;

/*
	[9, -1, -5]
	[9, -1, 3]
	[9, 3]
	9 3 
	[-1, 3, 5, 7, 9, 11]
	1
	[3, 5]
	[-1]
*/

public class ArrayList1{
	public static void main(String[] args){

		ArrayList<Integer>  array1 = new ArrayList<>();

		array1.add(9);
		array1.add(-5);

		array1.add(1, -1);

		System.out.println(array1);

		array1.set(array1.size()-1, 3);
		
		System.out.println(array1);

		array1.remove(1);

		System.out.println(array1);

		Iterator iter = array1.iterator();

		while(iter.hasNext())
			System.out.print(iter.next() + " ");

		System.out.println();


		//for(Integer ints: array1)
		//	System.out.print(ints + " ");

		array1.addAll(Arrays.asList(-1, 7, 5, 11));

		//Collections.sort(array1);

        array1.sort(Comparator.naturalOrder());

        //array1.sort(Comparator.reverseOrder());

		System.out.println(array1);

		System.out.println(Collections.binarySearch(array1, 3));

		//ArrayList<Integer> array2 = (ArrayList<Integer>)array1.clone();

		//System.out.println(array1.clone());

		System.out.println(array1.subList(1, 3));

		array1.remove(Integer.valueOf(11));

		array1.removeAll(Arrays.asList(5, 7));

		array1.removeIf(e -> (e % 3) == 0); //lambda expression

		System.out.println(array1);

		//note: other useful methods are:

		//.clear() 
		//.contains()
		//.containsAll()
		//.retainAll()

		//.get()
		//.indexOf()
		//.lastIndexOf()
		
		//.removeRange()

		//.isEmpty()
		//.ensureCapacity()
		//.trimToSize()

		//.replaceAll()
	}
}