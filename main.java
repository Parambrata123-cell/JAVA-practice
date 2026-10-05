// import java.util.Scanner;
// public class multiplicationtable {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         System.out.print("Enter the number:");
//         int num = input.nextInt();
//         for(int i = 1; i<=10 ; i++){
//             System.out.println(num + "x" + i + "=" + num*i);
//         }
//     }
// }
public class main {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
