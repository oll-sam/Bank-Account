public class BankAccount{
    public double check_balance;
    public double savings_balance;
    public static double numberOfAccounts = 0;

    public BankAccount(double checkParam, double savingsParam) {
        check_balance = checkParam;
        savings_balance = savingsParam;
        numberOfAccounts++;
    }

    public double getCheckBalance() {
        return check_balance;
    }

    public double getSavingsBalance() {
        return savings_balance;
    }

    public double addCheckBalance(double money) {
        double balance = check_balance + money;
        return balance;
    }

    public double addSavingsBalance(double money) {
        double balance = savings_balance + money;
        return balance ;
    }

    public double withdrawCheckBalance(double money) {
        if(check_balance < money) {
        return check_balance;
    }
    else {
        double balance = check_balance - money;
        return balance;
    }
    }

    public double getTotalBalance() {
        double balance = check_balance + savings_balance;
        return balance;
    }
}