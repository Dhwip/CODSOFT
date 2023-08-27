import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double checkBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs " + amount);
        } else {
            System.out.println("Invalid deposit amount.\nTransaction Failed.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs " + amount);
            return true;
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount\nTransaction Failed.");
            return false;
        }
    }
}

class ATM {
    private BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount account) {
        this.account = account;
        scanner = new Scanner(System.in);
    }

    public void displayOptions() {
        System.out.println("ATM Options:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("0. Exit");
    }

    public void run() {
        int choice;
        do {
            displayOptions();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Balance: Rs " + account.checkBalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                case 0:
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }
}

class Main {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(100000.0);
        ATM atm = new ATM(userAccount);
        int pass = 1234; // default password set
                         // Extra feature added by me
        int ep = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome To Your Bank:)\n");
        System.out.print("Enter Your Pin: ");

        for (int i = 1; i <= 4; i++) {
            ep = scan.nextInt();
            if (ep == pass)
                atm.run();
            else {
                System.out.println("Wrong Password\nTry Again " + (4 - i) + " attemps left:");
            }
            if (i == 4) {
                System.out.println("Account Blocked\nReport to Bank");
                break;
            }
        }
    }
}
