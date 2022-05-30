import java.util.Arrays;

public class ArrayClassMethods{

	static void printArray(int[] a){
		for(int i: a)
			System.out.print(i + " ");
		System.out.println();
	}
	public static void main(String[] args){

		int[] arr = {1, 4, 2, 7, -3, 6};

		//System.out.println(arr.length);
		Arrays.sort(arr); printArray(arr);

		System.out.println(Arrays.binarySearch(arr, 4));

		System.out.println(Arrays.toString(arr));

		Arrays.fill(arr, -1); printArray(arr);

		System.out.println(Arrays.hashCode(arr));

		System.out.println(Arrays.asList(arr));

		/*other methods are
			.equal()
			.compare(arr1, arr2)
			.fill(arr, beg, end, fillValue)
			.binarySearch(arr, beg, end, key)
			.binarySearch(arr, beg, end, key, comparator)
			.sort(T[] arr, beg, end, comparator)
			.sort(T[] arr, comparator)
			.sort(arr, beg, end)

			.copyOf(arr, len)
			.CopyOfRange(arr, beg, end)
		*/
		
	}
}