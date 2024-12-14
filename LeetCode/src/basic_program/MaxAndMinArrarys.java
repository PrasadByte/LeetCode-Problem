package basic_program;

public class MaxAndMinArrarys {
	public static void findMinMax(int [] arr) {
		if(arr==null || arr.length==0) {
			throw new IllegalArgumentException("Array is Empty");
		}
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("the minimum element of the array is the"+min);
		System.out.println("the maximum elemen of the array is "+max);
	}
	public static void main(String[] args) {
		int [] arr= {10,20,30,40,50,80};
		findMinMax(arr);
	} 
}
	