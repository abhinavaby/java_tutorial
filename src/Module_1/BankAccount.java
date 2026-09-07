package Module_1;

class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: $" + balance);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("ACC123456", "John Doe", 1000.00);

        System.out.println("--- Initial Account Details ---");
        account.displayDetails();

        account.deposit(500.00);

        System.out.println("\n--- Updated Account Details ---");
        account.displayDetails();
    }
}