import java.util.*;

//input: 2 9 6 -1 4

//output:
/*
	-1 2 4 6 9 
	-1
*/

public class Arrays{

	static void printArray(int[] a){
		for(int x: a)
			System.out.print(x + " ");
		System.out.println();
	}

	static int binarySearch(int[] a, int beg, int end, int k){

		//recursive implementation of binary search
		while(beg <= end){

			int mid = (beg + end)/2;

			if(a[mid] == k)
				return mid;

			else if(k > a[mid])
				return binarySearch(a, mid+1, end, k);

			else if(k < a[mid])
				return binarySearch(a, beg, mid-1, k);
		}
		return -1;
	}

	static void sort(int[] a){

		//bubble sort implementation
		int n = a.length, flag = 1;
		for(int i=0; i<n-1 && flag == 1; i++){
			flag = 0;
			for(int j=0; j<n-i-1; j++){
				if(a[j] > a[j+1]){

					int temp = a[j]; //swapping 
					a[j] = a[j+1];
					a[j+1] = temp;
					
					flag = 1;
				}
			}
		}

		//note: that in Java a array has length property 
	}

	public static void main(String[] args){

		Scanner in = new Scanner(System.in);

		final int size = 5; //constant
		int[] arr = new int[size];

		for(int i=0; i<5; i++)
			arr[i] = in.nextInt();

		sort(arr);
		printArray(arr);

		System.out.println(binarySearch(arr, 0, size-1, 7));

	}
}