package basic_program;

import java.util.Arrays;

public class Practice {
	public static void reverseArray(int [] arr){
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	
	}
	public static void printArray(int [] array) {
		for(int i=0;i<array.length;i++) {
			System.err.println(array[i]+(i<array.length-1 ?" ":" "));
		}
	}
	public static void main(String[] args) {
		int [] array= {1,2,3,4,5,6,7,8};
		System.out.println("Original Array");
		printArray(array);
		reverseArray(array);
		System.out.print("Reverse array is ");
		printArray(array);
	}

}
