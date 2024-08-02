package access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount a = new BankAccount();


        a.deposit(10000);
        a.withdraw(3000);
        System.out.println("balance = " + a.getBalance());

//        a.balance = 200;

    }
}