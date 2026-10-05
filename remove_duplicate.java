public class remove_duplicate {
    static int removeDDuplicate(int arr[], int n) {
        if (arr.length == 0)
            return 0;
        int write = 1;
        for (int read = 1 ; read <arr.length ; read++){
             if (arr[read] != arr[write - 1]) {
            arr[write] = arr[read];
            write++;
        }

        }
        return write;
    }
    public static void main(String[] args) {
        int[] arr = {1,1, 2, 2, 3,4,4};
        int newLength = removeDDuplicate(arr, arr.length);
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
