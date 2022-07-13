package program15;

import model.entities15.Account;
import model.exceptions15.DomainException;

import java.util.Scanner;

public class program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Number: ");
            int number = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Holder: ");
            String holder = scanner.nextLine();

            System.out.print("Initial balance: ");
            double initialBalance = scanner.nextDouble();

            System.out.print("Withdraw limit: ");
            double withdrawLimit = scanner.nextDouble();

            System.out.println();

            Account account = new Account(number, holder, initialBalance, withdrawLimit);

            System.out.print("Enter the amount for withdraw: ");
            double amount = scanner.nextDouble();
            account.withdraw(amount);

            System.out.println("New balance: " + account.getBalance());
        } catch (DomainException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }
        scanner.close();
    }
}
