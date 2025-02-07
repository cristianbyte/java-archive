class Account {
    private String accountNumber;
    private double balance;

    public Account( String accountNumber, double balance) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) throws Exception {
        if (amount > this.balance) {
            throw new Exception();
        }
        this.balance -= amount;
    }
}
