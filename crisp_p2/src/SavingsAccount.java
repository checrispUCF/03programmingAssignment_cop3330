public class SavingsAccount {
    static private double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double savings) {
        savingsBalance = savings;
    }

    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    public double newSavingsBalance() {
        return savingsBalance;
    }

    public static void modifyInterestRate(double newValue) {
        annualInterestRate = newValue;
    }
}
