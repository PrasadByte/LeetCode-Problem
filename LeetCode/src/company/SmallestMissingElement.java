package company;

/* Given 2 integer arrays arr1 and arr2, find the smallest number from arr1 that is not present in arr2.

Example:
Arr1[]: 5, 10, 3, 0, -2, 4, -2
Arr2[]: 0, 2, 3, -2, 5

Output: 10 */
public class SmallestMissingElement {
    public static int smallestElement(int[] arr1, int[] arr2) {
        int smallestMissing = Integer.MAX_VALUE; // Initialize to a very large value

        for (int i = 0; i < arr1.length; i++) {
            boolean found = false;

            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }

            // If arr1[i] is not found in arr2 and is smaller than the current smallestMissing
            if (!found && arr1[i] < smallestMissing) {
                smallestMissing = arr1[i];
            }
        }
        return smallestMissing;
        
    }

    public static void main(String[] args) {
        int[] arr1 = {5,  3, 0, -2, 4, -2};
        int[] arr2 = {0, 2, 3, -2, 5};
        System.out.println(smallestElement(arr1, arr2));
        ;
    }
}
