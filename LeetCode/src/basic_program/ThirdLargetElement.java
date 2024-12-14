package basic_program;

import java.util.Arrays;

public class ThirdLargetElement {
	public static int thirdLargets(int[] arr) {
		if (arr == null || arr.length < 3) {
			throw new IllegalArgumentException("Array is Empty or less than 3 element");
		}
		//sorting the array in decendin order
		Arrays.sort(arr);
		//return the 3rd largest element
		return arr[arr.length -3];
	}
	public static void main(String[] args) {
		int[] arr = {12, 45, 1, -1, 90, 34, 65};
        System.out.println("Third largest element is: " + thirdLargets(arr));
	}

}
