// public class loop {
//     public static void main(String[] args) {
//         int i;
//         for (i = 2; i <= 50; i+=2) {
//             System.out.println(i);
//         }

//         for(i = 1; i <= 49 ; i+=2) {
//             System.out.println(i);
//         }

//     }
    
// }
import java.util.Scanner;
public class factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int n = sc.nextInt();

        long factorial = 1;

        for(int i = 1; i <= n; i++){
            factorial *= i;
        }
        System.out.println("Factorial of " + n + " is: " + factorial);

    }
}