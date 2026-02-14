package com.jdbc.JdbcDemo.transactionmanagement;



import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("\n1 Check Balance");
            System.out.println("2 Transfer Money");
            System.out.println("3 Transaction History");
            System.out.println("4 Exit");

            int choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.print("Enter account id: ");
                    BankingSystem.checkBalance(
                        sc.nextInt());
                    break;

                case 2:
                    System.out.print("From: ");
                    int from = sc.nextInt();

                    System.out.print("To: ");
                    int to = sc.nextInt();

                    System.out.print("Amount: ");
                    double amount = sc.nextDouble();

                    BankingSystem.transferMoney(
                        from, to, amount);
                    break;

                case 3:
                    BankingSystem.showHistory();
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}
