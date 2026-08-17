package day13.homework;

public class UseBankAccount {
    public static void main(String[] args) {
        BankAccount account =
                new BankAccount(1000, "Savings", "JH01");
        System.out.println(account.accType);
    }
}
