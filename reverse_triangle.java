
// import java.util.Scanner;
// public class password{
//     public static void main(String[] args) {
//         String correctpass = "123456";
//         String inputpass;

//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter your password:");

//         while (true) { 
//             inputpass = input.nextLine();

//             if(inputpass.equals(correctpass)){
//                 System.out.println("Access granted");
//                 break;
//             } else {
//                 System.out.println("Invalid password. Please try again.");
//             }

//         }
//     }
// }

public class reverse_triangle {
    public static void main(String[] args) {
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <=4 ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}