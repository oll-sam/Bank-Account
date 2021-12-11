public class TestBankAccount {
    public static void main(String[] args) {

        BankAccount test_BankAccount = new BankAccount(321.23, 243.50);
        System.out.println(BankAccount.numberOfAccounts);

        Double testCheckBalance  = test_BankAccount.getCheckBalance();
        Double testSavingsBalance = test_BankAccount.getSavingsBalance();
        Double testAddCheckBalance = test_BankAccount.addCheckBalance(50.00);
        Double testAddSavingsBalance = test_BankAccount.addSavingsBalance(50.00);
        Double testWithdrawCheckBalance = test_BankAccount.withdrawCheckBalance(50.00);
        Double testTotalBalance = test_BankAccount.getTotalBalance();

        System.out.println("\n-----Checkings-----");
        System.out.println(testCheckBalance);
        System.out.println("\n-----Savings-----");
        System.out.println(testSavingsBalance);
        System.out.println(testAddCheckBalance);
        System.out.println(testAddSavingsBalance);
        System.out.println(testWithdrawCheckBalance);
        System.out.println(testTotalBalance);
    }

}