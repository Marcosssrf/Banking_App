package application;

import entities.account;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Welcome to National Bank");
        System.out.println("Choose the account type");
        System.out.println("1 - Personal Account");
        System.out.println("2 - Business Account");
        int accountType = sc.nextInt();
        if (accountType < 2) {
            System.out.println("Please enter a valid account type");
        }

        System.out.print("Enter the account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter the account name: ");
        String accountName = sc.next();

        account acc = new account(accountNumber, accountName);

        int option;

        if(accountType == 1) {
            do {
                System.out.println("1 - Withdrawal");
                System.out.println("2 - Deposit");
                System.out.println("3 - Transfer");
                System.out.println("4 - Exit");
                option = sc.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("1 - Withdrawal");
                        System.out.println("Type the amount to withdraw");
                        acc.withdrawAmount = sc.nextDouble();
                        acc.withdrawAmount(acc.withdrawAmount);
                        System.out.println(acc);
                        break;
                    case 2:
                        System.out.println("2 - Deposit");
                        System.out.println("Type the amount to deposit");
                        acc.depositAmount = sc.nextDouble();
                        acc.depositAmount(acc.depositAmount);
                        System.out.println(acc);
                        break;
                    case 3:
                        System.out.println("3 - Transfer");
                        System.out.println("Type the amount to transfer");
                        acc.transferAmount(sc.nextDouble());
                        acc.transferAmount(acc.depositAmount);
                        System.out.println("Type the account number to transfer");
                        int transferAccountNumber = sc.nextInt();
                        System.out.println(acc);
                        break;
                    case 4:
                        System.out.println("Ending Program!");
                        break;
                    }
                }while (option != 4);



        }

    }
}