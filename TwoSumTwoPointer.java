public class TwoSumTwoPointer {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 8, 9};  // Sorted array
        int target = 10;

        int left = 0;                  // pointer at the start
        int right = arr.length - 1;
        
        int closestRight = arr[right];
        int closestLeft = arr[left]; 
        int minDiff = Math.abs((arr[left] + arr[right]) - target);
        // pointer at the end

        boolean found = false;

        while (left < right) {
            int sum = arr[left] + arr[right];
            int diff = Math.abs(sum - target);

            if (sum == target) {
                System.out.println("Pair found: " + arr[left] + " + " + arr[right] + " = " + target);
                found = true;
                break; // stop after finding one pair
            } else if (sum < target) {
                left++;  // move left pointer forward to increase sum
            } else {
                right--; // move right pointer backward to decrease sum
            }
        }

        if (!found) {
            System.out.println("No pair found with sum = " + target);
        }
    }
}
