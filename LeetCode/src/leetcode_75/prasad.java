package leetcode_75;

import java.util.ArrayList;
import java.util.List;

public class prasad {
    public static List<Boolean> kidsWithCandies(int candies[], int extraCandies) {
        // Find the maximum number of candies
        int max = 0;
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }

        // Create a result list to store the Boolean values
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            // Check if the current candy count + extraCandies >= max
            if (candy + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }//fdf
        return result;
    }

    public static void main(String[] args) {
        int[] candies = {10, 5, 6, 2, 4, 8, 9, 6, 10};
        int extraCandies = 2;

        // Call the method and print the result
        List<Boolean> result = kidsWithCandies(candies, extraCandies);
        System.out.println(result);
    }
}
