package day13.homework;

public class BankAccount {
    private double balance;
    protected String accType;
    String branchCode;

    BankAccount(double balance, String accType, String branchCode){
        if(balance >= 0){
            this.balance = balance;
        }else{
            this.balance = 0;
            System.out.println("Invalid initial balance. Balance set to 0.");
        }

        this.accType = accType;
        this.branchCode = branchCode;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }else{
            System.out.println("Deposit amount must be positive.");
        }

    }

    public void withdraw(int amount){
        if(amount<= 0){
            System.out.println("Withdrawal amount must be positive.");
        }else if(amount > balance){
            System.out.println("Insufficient balance. Withdrawal rejected.");
        }else{
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

    }
}
