package setup4;

import setup5.InsufficientfundsException;

public class BankDemo {
    public static void main(String[] args) {
        checkingAccount c = new checkingAccount(101);
        System.out.println("Depositing $500...");
        c.deposit(500.00);

        try {
            System.out.println("\nWithdrawing $100...");
            c.withdraw(100.00);
            System.out.println("\nWithdrawing $600...");
            c.withdraw(600.00);
        } catch (InsufficientfundsException e) {
            System.out.println("Sorry, but are you short $" + e.getAmount());
            e.printStackTrace();
        }
    }
}
