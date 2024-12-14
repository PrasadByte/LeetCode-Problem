package basic_program;

import java.util.Arrays;

public class Practice {
	public static int findthirdLargest(int []arr) {
		if(arr == null || arr.length<3) {
			throw new IllegalArgumentException("Array is Empty or Less then 3 element ");
		}
		Arrays.sort(arr);
		return arr[arr.length-3];
	}
	public static void main(String[] args) {
		int []arr= {10,20,30,40,50,62,05,56};
		System.out.println("the Third largets Element is "+findthirdLargest(arr));
	}

}
