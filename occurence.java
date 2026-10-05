public class occurence {
    public static void main(String[] args) {
        int[] arr = {10 , 20 , 30, 20, 50 , 20};
        int[] brr = new int [arr.length];
        brr[0] = arr[arr.length - 1];
        int target = 20;
        int index = -1;
        
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == target){
                index = i;
                break;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            brr[i] = arr[arr.length - 1 - i];
        }
        System.out.println("First occurence is at index :" +index);
        
         // Reverse the array
        System.out.println("Reversed array: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
            
             System.out.println("brr array: ");
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }

        for (int i = 1; i < arr.length; i++) {
            brr[i] = arr[i - 1];
        }

        // Print the new array
        System.out.print("brr array: ");
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }

    }
    
}
