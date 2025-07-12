/* 1. Find the Largest Sum Contiguous Subarray (Kadane’s Algorithm)
  Example: Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4] → Output: 6 (Subarray: [4, -1, 2, 1]) */
import java.util.Scanner;
@SPYiDY
public class MaxSubarraySum {

    // Kadane's Algorithm
    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " integer elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int result = maxSubArray(nums);
        System.out.println("Maximum subarray sum is: " + result);

        scanner.close();
    }
}
