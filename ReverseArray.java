import java.util.*;

public class ReverseArray{

	static int[] reverseArray(int[] a){

		int[] result = new int[a.length];

		int k=0;
		for(int i=0; i<a.length; i++){
			result[k++] = a[a.length - i - 1];
		}

		//returning array from method
		return result;
	}

	public static void main(String[] args){

		int[] arr = {1, 6, 2, 7, 3};

		for(int x: reverseArray(arr))
			System.out.print(x + " ");
	}
}