package access;

public class BankAccount {

    private int balance;

    public BankAccount() {
        balance = 0;
    }

    //public 메서드 : deposit
    public void deposit(int amount){
        if(isAmountValid(amount)){
            balance += amount;
        }else{
            System.out.println("유효하지않은 금액입니다.");
        }
    }

    //출금메서드
    public void withdraw(int amount){
        if(isAmountValid(amount)&&balance >= amount){
            balance -= amount;
        }else{
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    //잔액확인 메서드
    public int getBalance(){
        return balance;
    }

    //입출금 시 금액이 유효한지 확인하는 메서드
    private boolean isAmountValid(int amount){
       //금액이 0보다 커야함
        return amount > 0;
    }

}
