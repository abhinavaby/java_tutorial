
import java.util.Scanner;

public class bank_acc {
    long accountNumber;
    String accountHolder;
    double balance;

    bank_acc(long accNo, String holder, double bal) {
        accountNumber = accNo;
        accountHolder = holder;
        balance = bal;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    void displayDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.printf("Balance = %.2f\n", balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        long accNo = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String holder = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        bank_acc account = new bank_acc(accNo, holder, bal);

        System.out.print("Enter Deposit Amount: ");
        double amount = sc.nextDouble();

        account.deposit(amount);

        System.out.println("\nUpdated Account Details");
        account.displayDetails();

        sc.close();
    }
}