public class Application {
    public static void main(String args[]) {

        SavingsAccount saver1, saver2;
        int months = 12, i;
        saver1 = new SavingsAccount(2000.00);
        saver2 = new SavingsAccount(3000.00);
        SavingsAccount.modifyInterestRate(.04);

        System.out.println("The interest rate is 4%.");

        System.out.println();
        System.out.println("User 1:");
        for (i = 0; i < months; i++) {
            saver1.calculateMonthlyInterest();
            System.out.printf("Month %d: %.2f\n", i + 1, saver1.newSavingsBalance());
        }

        System.out.println();
        System.out.println("User 2:");
        for (i = 0; i < months; i++) {
            saver2.calculateMonthlyInterest();
            System.out.printf("Month %d: %.2f\n", i + 1, saver2.newSavingsBalance());
        }

        System.out.println();
        SavingsAccount.modifyInterestRate(.05);
        System.out.println("The interest rate has changed to 5%.");

        System.out.println();
        System.out.println("The next month's balance for User 1:");
        saver1.calculateMonthlyInterest();
        System.out.printf("%.2f\n", saver1.newSavingsBalance());

        System.out.println();
        System.out.println("The next month's balance for User 2:");
        saver2.calculateMonthlyInterest();
        System.out.printf("%.2f\n", saver2.newSavingsBalance());


        /*System.out.println("User 1:");
        for (i = 0; i < months; i++) {
            saver1.calculateMonthlyInterest();
            System.out.printf("Month %d: %.2f\n", i + 1, saver1.newSavingsBalance());
        }

        System.out.println();
        System.out.println("User 2:");
        for (i = 0; i < months; i++) {
            saver2.calculateMonthlyInterest();
            System.out.printf("Month %d: %.2f\n", i + 1, saver2.newSavingsBalance());
        }*/
    }
}
