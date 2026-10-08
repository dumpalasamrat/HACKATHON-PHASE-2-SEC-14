import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Parameterized constructor
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Check balance method
    public double checkBalance() {
        return balance;
    }

    // Display account details method
    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading account details
        System.out.print("Enter Account Number: ");
        String accNum = sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String accHolder = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double initialBalance = sc.nextDouble();

        // Creating object using parameterized constructor
        BankAccount account = new BankAccount(accNum, accHolder, initialBalance);

        // Performing deposit operation
        System.out.print("Enter Deposit Amount: ");
        double depositAmt = sc.nextDouble();
        account.deposit(depositAmt);

        // Performing withdrawal operation
        System.out.print("Enter Withdrawal Amount: ");
        double withdrawAmt = sc.nextDouble();
        account.withdraw(withdrawAmt);

        // Displaying final account details
        System.out.println("\n--- Final Account Details ---");
        account.displayAccount();

        sc.close();
    }
}