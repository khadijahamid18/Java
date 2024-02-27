public class task3 {
    public static void main(String[] args) {
        double payAmount = 2000.00; // Amount the employee earns each pay period
        int payPeriods = 12; // Number of pay periods in a year
        double annualPay; // Total annual pay

        // Calculating the total annual pay
        annualPay = payAmount * payPeriods;

        // Displaying the total annual pay
        System.out.println("The employee's total annual pay is: $" + annualPay);
    }
}
