public class TwoPointerSort {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 0, 0, 1};

        int left = 0;              // pointer at the start
        int right = arr.length - 1; // pointer at the end

        while (left < right) {
            // Move left pointer forward if it's already 0
            if (arr[left] == 0) {
                left++;
            }
            // Move right pointer backward if it's already 1
            else if (arr[right] == 1) {
                right--;
            }
            // Swap when left is 1 and right is 0
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        // Print sorted array
        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
