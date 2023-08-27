public class BankAccountRunner {
    public static void main(String[] args) {
        BankAccount memo = new BankAccount(1000);

        memo.deposit(150);
        memo.withdraw(500);
        memo.withdraw(600);
        memo.deposit(1500);
        memo.withdraw(2000);
        memo.deposit(500);
        memo.withdraw(2000);

        System.out.println("Statement: " + memo.getStatement());
        System.out.printf("Balance: %.2f\n", memo.getBalance());
    }
}
