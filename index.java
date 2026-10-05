public class index{
    static int postsum(int[] arr){
        int sum = 0;
        for(int num : arr){
            if(num > 0){
                sum+=num;
            }
        }
        return sum;
}

static int negsum(int[] arr){
    int sum = 0;
    for(int num : arr){
        if(num < 0){
            sum += num;
        }
    }
    return sum;

}
    public static void main(){
        int[] arr = {10 , -20 , 30 ,-50 , 60};
        int target = 30;
        int count = 0;

        System.out.println("Positive sum: " + postsum(arr));
        System.out.println("Negative sum: " + negsum(arr));

        for(int i = 0; i<arr.length ; i++){
            if(arr[i] == target){
                System.out.println("element found at index:" + i);
                System.out.println("element position:" + (i+1));
                count++;
               
            }
        }
            if (count > 0) {
                System.out.println("Total occurrences of " + target + " = " + count);
            } else {
                System.out.println("-1 (Element not found)");
            }

    }
}