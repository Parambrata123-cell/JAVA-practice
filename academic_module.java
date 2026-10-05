public class academic_module {
    // Method to calculate attendance percentage
    static double calculateAttendance(int attended, int total) {
        return (attended * 100.0) / total;
    }

    // Method to calculate average marks
    static double calculateAverage(int m1, int m2, int m3) {
        return (m1 + m2 + m3) / 3.0;
    }

    // Method to check eligibility
    static boolean checkEligibility(double attendance, double average) {
        return (attendance >= 75.0 && average >= 40.0);
    }

    // Method to print academic result
    static void printAcademicResult(double attendance, double average, boolean eligible) {
        System.out.println("Attendance: " + attendance + "%");
        System.out.println("Average Marks: " + average);
        System.out.println("Eligibility: " + (eligible ? "Eligible" : "Not Eligible"));
    }

    // Main method
    public static void main(String[] args) {
        // Example inputs
        int attendedClasses = 18;
        int totalClasses = 20;
        int mark1 = 45;
        int mark2 = 35;
        int mark3 = 50;

        // Calculations
        double attendance = calculateAttendance(attendedClasses, totalClasses);
        double average = calculateAverage(mark1, mark2, mark3);
        boolean eligible = checkEligibility(attendance, average);

        // Print result
        printAcademicResult(attendance, average, eligible);
    }
    
}
