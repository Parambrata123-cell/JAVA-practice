import java.util.Scanner;

public class scholarship_system{
    public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String name = sc.nextLine();
            System.out.println("Enter your marks in subject1: ");
            int subject1 = sc.nextInt();
            System.out.println("Enter your marks in subject2: ");
            int subject2 = sc.nextInt();
            System.out.println("Enter your marks in subject3: ");
            int subject3 = sc.nextInt();
            System.out.println("Enter your attendance percentage: ");
            double percentage = sc.nextDouble();

            double totalMarks = subject1 + subject2 + subject3;
            double averageMarks = totalMarks / 3;

            //Display result
                System.out.println("\n----- Student Result -----");
            System.out.println("Name: " + name);
            System.out.println("Total Marks: " + totalMarks);
            System.out.printf("Percentage: %.2f%%\n",percentage);


             // Grade and Pass/Fail
        // Grade and Pass/Fail
        if (percentage < 40) {
            System.out.println("Result: Fail");
        } else if(percentage >= 90) {
                System.out.println("Grade: A");
            } else if (percentage >= 75) {
                System.out.println("Grade: B");
            } else if (percentage >= 60) {
                System.out.println("Grade: C");
            } else {
                System.out.println("Grade: D");
            }
          

    // Scholarship eligibility
            if (percentage >= 80 && percentage >= 75) {
                System.out.println("Scholarship Eligible");
            } else {
                System.out.println("No Scholarship");
            }

            sc.close();

        }
}