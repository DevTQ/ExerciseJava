public class SavingsAccount extends BankAccount {
    private double rate = 0.025;
    private int savingsNumber = 0;
    private String accountNumber;

    public SavingsAccount(String name, double amount) {
        super(name, amount);
        this.accountNumber = accountNumber + " - "+ savingsNumber;
    }

    public void postInterest() {
       double interestAmount = (getBalance() * rate) /12;
       deposit(interestAmount);
    }

    public String getAccountNumber() {
        return super.getAccountNumber() + "-"+savingsNumber;
    }

    public SavingsAccount(SavingsAccount oldAccount, double amount) {
        super(oldAccount, amount);
        savingsNumber++;
        this.accountNumber = accountNumber + " - " + savingsNumber;
    }
}

 