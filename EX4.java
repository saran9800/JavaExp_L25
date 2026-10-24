```java
// Parent class
class Bank {
    String bankName = "National Bank";

    void displayBank() {
        System.out.println("Bank Name: " + bankName);
    }
}

// Single inheritance
class Account extends Bank {
    int accountNumber;
    double balance;

    Account(int accNo, double bal) {
        accountNumber = accNo;
        balance = bal;
    }

    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: Rs. " + balance);
    }
}

// Multilevel inheritance
class SavingsAccount extends Account {
    double interestRate = 5.0;

    SavingsAccount(int accNo, double bal) {
        super(accNo, bal);
    }

    void displayInterest() {
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Hierarchical inheritance
class CurrentAccount extends Account {
    double minimumBalance = 1000.0;

    CurrentAccount(int accNo, double bal) {
        super(accNo, bal);
    }

    void displayMinimumBalance() {
        System.out.println("Minimum Balance: Rs. "
                + minimumBalance);
    }
}

// Interface 1
interface Deposit {
    void depositMoney(double amount);
}

// Interface 2
interface Withdraw {
    void withdrawMoney(double amount);
}

// Multiple inheritance through interfaces
class BankingOperations extends SavingsAccount
        implements Deposit, Withdraw {

    BankingOperations(int accNo, double bal) {
        super(accNo, bal);
    }

    public void depositMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs. " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdrawMoney(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs. " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        System.out.println("BANKING SYSTEM");
        System.out.println("--------------");

        BankingOperations account =
                new BankingOperations(1001, 5000.0);

        account.displayBank();
        account.displayAccount();
        account.displayInterest();

        System.out.println("\nBanking Transactions");
        account.depositMoney(2000.0);
        account.withdrawMoney(1000.0);

        System.out.println("\nUpdated Account Details");
        account.displayAccount();

        System.out.println("\nCurrent Account Details");
        CurrentAccount current =
                new CurrentAccount(2001, 8000.0);

        current.displayBank();
        current.displayAccount();
        current.displayMinimumBalance();
    }
}
```
