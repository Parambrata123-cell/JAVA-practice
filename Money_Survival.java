public class Money_Survival {
    static int calculateExpenses(int rent , int food ,  int travel , int recharge,  int entertainment) {
        return rent + food + travel + recharge + entertainment;
    }
    
    static int calculateSavings(int income, int expenses){
        return income - expenses;
    }
    static boolean checkBudget(int savings){
        return savings > 0 ;
    }
    static void printBudgetResult(int income, int expenses, int savings) {
        System.out.println("Income: " + income);
        System.out.println("Expenses: " + expenses);
        System.out.println("Savings: " + savings);

        if (savings < 0) {
            System.out.println("Bhai, salary se pehle expenses aa gaye 😅");
        } else if (savings == 0) {
            System.out.println("Balance: Zen mode 🧘");
        } else if (savings >= 5000) {
            System.out.println("Future CEO detected 🚀");
        } else {
            System.out.println("Budget balanced, keep going 👍");
        }
    }

    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter income: ");
        int income = sc.nextInt();

        System.out.print("Enter rent: ");
        int rent = sc.nextInt();

        System.out.print("Enter food: ");
        int food = sc.nextInt();

        System.out.print("Enter travel: ");
        int travel = sc.nextInt();

        System.out.print("Enter recharge: ");
        int recharge = sc.nextInt();

        System.out.print("Enter entertainment: ");
        int entertainment = sc.nextInt();

        int expenses = calculateExpenses(rent, food, travel, recharge, entertainment);
        int savings = calculateSavings(income, expenses);
        boolean budgetOk = checkBudget(savings);

        printBudgetResult(income, expenses, savings);

        if (budgetOk) {
            System.out.println("Budget is okay ✅");
        } else {
            System.out.println("Budget is not okay ❌");
        }

        sc.close();
    }
}
